package racingcar.view;

import camp.nextstep.edu.missionutils.Console;

import static racingcar.tool.Validator.validateNumberFormat;

public class InputView {
    private static final InputView inputView = new InputView();
    private final OutputView outputView = OutputView.getOutputView();

    private InputView() {
    }

    public static InputView getInputView() {
        return inputView;
    }

    public String readCarNames() {
        outputView.printInputCarNamesMessage();

        return readString();
    }

    public int readTryCount() {
        outputView.printInputTryCountMessage();

        return readInteger();
    }

    private String readString() {
        return Console.readLine();
    }

    private int readInteger() {
        return validateNumberFormat(Console.readLine());
    }

}
