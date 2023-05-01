package racingcar.tool;

import static racingcar.view.message.ErrorMessage.TRY_COUNT_NUMBER_FORMAT_ERROR_MESSAGE;

public class Validator {

    public static int validateNumberFormat(String input) {
        try {
            return Integer.parseInt(input);
        } catch (NumberFormatException error) {
            throw new IllegalArgumentException(TRY_COUNT_NUMBER_FORMAT_ERROR_MESSAGE);
        }
    }
}
