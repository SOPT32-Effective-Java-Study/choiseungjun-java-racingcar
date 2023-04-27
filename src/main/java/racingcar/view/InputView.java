package racingcar.view;

import camp.nextstep.edu.missionutils.Console;

import static racingcar.view.message.ErrorMessage.TRY_COUNT_NUMBER_FORMAT_ERROR_MESSAGE;

public class InputView {
    private final OutputView outputView = new OutputView();

    public String readCarNames() {
        outputView.printInputCarNamesMessage();

        return readString();
    }

    public Integer readTryCount() {
        outputView.printInputTryCountMessage();

        return readInteger();
    }

    private String readString() {
        return Console.readLine();
    }
    private Integer readInteger() {
        return validateNumberFormat(Console.readLine());
    }

    private Integer validateNumberFormat(String text) {
        try {
            return Integer.parseInt(text);
        } catch (NumberFormatException error) {
            throw new IllegalArgumentException(TRY_COUNT_NUMBER_FORMAT_ERROR_MESSAGE);
        }
    }
}
