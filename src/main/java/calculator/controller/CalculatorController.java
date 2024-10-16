package calculator.controller;

import calculator.dto.CalculatorRequestDTO;
import calculator.dto.CalculatorResponseDTO;
import calculator.service.CalculatorService;
import calculator.service.CustomDivisionService;
import calculator.view.InputView;
import calculator.view.OutputView;

public class CalculatorController {

    public void run() {
        OutputView outputView = new OutputView();
        InputView inputView = new InputView();

        CustomDivisionService customDivisionService = new CustomDivisionService();
        CalculatorService calculatorService = new CalculatorService(customDivisionService);

        outputView.printStartMessage();
        CalculatorRequestDTO calculatorRequestDTO = inputView.readInput();

        CalculatorResponseDTO calculatorResponseDTO = calculatorService.getCalculatorResponseDTO(calculatorRequestDTO);

        outputView.printEndMessage(calculatorResponseDTO);
    }
}
