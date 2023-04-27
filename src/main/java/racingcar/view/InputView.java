package racingcar.view;

import camp.nextstep.edu.missionutils.Console;

public class InputView {
    private final OutputView outputView = new OutputView();

    public String readCarNames() {
        outputView.printInputCarNamesMessage();

        return readString();
    }

    private String readString() {
        return Console.readLine();
    }
}
