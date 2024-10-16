package calculator.service;

import calculator.dto.CalculatorRequestDTO;
import calculator.dto.CalculatorResponseDTO;
import calculator.validator.CalculatorValid;
import java.util.ArrayList;
import java.util.List;

public class CalculatorService {
    public static final String BASIC_DIVISION_1 = ",";
    public static final String BASIC_DIVISION_2 = ":";
    private final CustomDivisionService customDivisionService;

    public CalculatorService(CustomDivisionService customDivisionService) {
        this.customDivisionService = customDivisionService;
    }

    public CalculatorResponseDTO getCalculatorResponseDTO(CalculatorRequestDTO calculatorRequestDTO) {
        String inputString = calculatorRequestDTO.input();

        String customDivision = customDivisionService.getCustomDivision(inputString);
        String numberString = customDivisionService.getNumberString(inputString, customDivision);

        List<String> divisions = getDivisions(customDivision);

        String[] strings = getNumberString(numberString, divisions);
        Integer[] number = convertStringToNumber(strings);

        CalculatorValid.validNumberPositive(number);

        int total = getTotal(strings);

        return new CalculatorResponseDTO(
                total
        );
    }

    private Integer[] convertStringToNumber(String[] strings) {
        Integer[] numbers = new Integer[strings.length];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(strings[i]);
        }
        return numbers;
    }

    private int getTotal(String[] strings) {
        int total = 0;
        for (String string : strings) {
            int parsedInt = Integer.parseInt(string);
            total += parsedInt;
        }
        return total;
    }

    private String[] getNumberString(String numberString, List<String> divisions) {
        String string = numberString;
        for (String division : divisions)
            string = string.replace(division, BASIC_DIVISION_1);

        return string.split(BASIC_DIVISION_1);
    }

    private List<String> getDivisions(String customDivision) {
        List<String> divisions = new ArrayList<>();

        divisions.add(BASIC_DIVISION_1);
        divisions.add(BASIC_DIVISION_2);

        if (!customDivision.isBlank())
            divisions.add(customDivision);

        return divisions;
    }
}
