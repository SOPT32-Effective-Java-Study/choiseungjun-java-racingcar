package racingcar.view;

import static racingcar.view.message.ConsoleMessage.INPUT_CAR_NAMES_MESSAGE;

public class OutputView {

    public void printInputCarNamesMessage() {
        println(INPUT_CAR_NAMES_MESSAGE);
    }


    public void printError(Exception error) {
        println(error.getMessage());
        printEnter();
    }

    private void printEnter() {
        System.out.println();
    }

    private void println(String message) {
        System.out.println(message);
    }
}
