package calculator.view;

import calculator.dto.CalculatorResponseDTO;

public class OutputView {
    private static final String GAME_START_MESSAGE = "덧셈할 문자열을 입력해 주세요.";
    private static final String GAME_END_MESSAGE = "결과 : ";

    public void printStartMessage() {
        System.out.println(GAME_START_MESSAGE);
    }

    public void printEndMessage(CalculatorResponseDTO calculatorResponseDTO) {
        System.out.println(GAME_END_MESSAGE + calculatorResponseDTO.result());
    }
}
