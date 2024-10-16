package calculator.view;

import calculator.dto.CalculatorRequestDTO;
import camp.nextstep.edu.missionutils.Console;

public class InputView {

    public CalculatorRequestDTO readInput() {
        String input = readLine();
        return new CalculatorRequestDTO(input);
    }

    private String readLine() {
        return Console.readLine();
    }
}
