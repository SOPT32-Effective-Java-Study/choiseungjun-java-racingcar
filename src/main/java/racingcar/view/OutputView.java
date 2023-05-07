package racingcar.view;

import racingcar.domain.Car;

import java.util.List;

import static racingcar.constant.CarConstant.CAR_MOVE_DISTANCE_MARK;
import static racingcar.view.message.ConsoleMessage.*;

public class OutputView {
    private static final OutputView outputView = new OutputView();

    private OutputView() {
    }

    public static OutputView getOutputView() {
        return outputView;
    }

    public void printInputCarNamesMessage() {
        println(INPUT_CAR_NAMES_MESSAGE);
    }

    public void printInputTryCountMessage() {
        println(INPUT_TRY_COUNT_MESSAGE);
    }

    public void printTryResultMessage() {
        printEnter();
        println(TRY_RESULT_MESSAGE);
    }

    public void printCarsDistance(List<Car> cars) {
        for (Car car : cars) {
            printCarDistance(CAR_DISTANCE_MESSAGE,
                    car.getName(),
                    createDistanceAmountText(car.getPosition()));
        }

        printEnter();
    }

    public void printWinners(String winnerNames) {
        printf(SHOW_RACING_WINNER_MESSAGE, winnerNames);
        printEnter();
    }

    public void printError(Exception error) {
        println(error.getMessage());
        printEnter();
    }

    private void printCarDistance(String text, String carName, String distance) {
        printf(text, carName, distance);
        printEnter();
    }

    private void printEnter() {
        System.out.println();
    }

    private <T> void println(T message) {
        System.out.println(message);
    }

    private <P1, P2> void printf(String text, P1 param1, P2 param2) {
        System.out.printf(text, param1, param2);
    }

    private <P> void printf(String text, P param) {
        System.out.printf(text, param);
    }

    private String createDistanceAmountText(int amount) {
        StringBuilder distance = new StringBuilder();
        for (int i = 0; i < amount; i++) {
            distance.append(CAR_MOVE_DISTANCE_MARK);
        }

        return distance.toString();
    }
}
