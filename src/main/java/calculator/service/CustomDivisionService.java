package calculator.service;

public class CustomDivisionService {
    public static final String CUSTOM_DIVISION_START = "//";
    public static final String CUSTOM_DIVISION_END = "\\n";
    public static final String BLANK = "";

    public String getNumberString(String input, String customDivision) {
        String removeString = getRemoveString(customDivision);
        return input.replace(removeString, BLANK);
    }

    public String getCustomDivision(String input) {
        if (isContainsCustomDivision(input)) {
            int startPos = getPosition(input, CUSTOM_DIVISION_START) + CUSTOM_DIVISION_START.length();
            int lastPos = getPosition(input, CUSTOM_DIVISION_END);

            return input.substring(startPos, lastPos);
        }
        return BLANK;
    }

    private boolean isContainsCustomDivision(String input) {
        return input.contains(CUSTOM_DIVISION_START);
    }

    private String getRemoveString(String customDivision) {
        return CUSTOM_DIVISION_START + customDivision + CUSTOM_DIVISION_END;
    }

    private int getPosition(String input, String findString) {
        return input.indexOf(findString);
    }
}
