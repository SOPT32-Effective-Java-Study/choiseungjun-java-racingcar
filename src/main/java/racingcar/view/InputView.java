package racingcar.view;

import camp.nextstep.edu.missionutils.Console;

import static racingcar.tool.Validator.validateNumberFormat;

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

}
