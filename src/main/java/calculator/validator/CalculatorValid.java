package calculator.validator;

public class CalculatorValid {

    public static void validNumberPositive(Integer[] integers) {
        for (Integer integer : integers) {
            if (integer < 0)
                throw new IllegalArgumentException();
        }
    }
}
