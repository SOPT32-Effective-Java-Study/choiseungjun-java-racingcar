package racingcar.view;

import racingcar.domain.Car;

import java.util.List;

import static racingcar.tool.CarConstantValue.CAR_MOVE_DISTANCE;
import static racingcar.view.message.ConsoleMessage.*;

public class OutputView {

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
        System.out.printf(SHOW_RACING_WINNER_MESSAGE, winnerNames);
        printEnter();
    }

    public void printError(Exception error) {
        println(error.getMessage());
        printEnter();
    }

    private void printCarDistance(String text, String carName, String distance) {
        System.out.printf(text, carName, distance);
        printEnter();
    }

    private void printEnter() {
        System.out.println();
    }

    private void println(String message) {
        System.out.println(message);
    }

    private String createDistanceAmountText(Integer amount) {
        String distance = "";
        for (int i = 0; i < amount; i++) {
            distance += CAR_MOVE_DISTANCE;
        }

        return distance;
    }
}
