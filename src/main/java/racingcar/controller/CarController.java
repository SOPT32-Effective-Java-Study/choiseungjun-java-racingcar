package racingcar.controller;

import racingcar.domain.Car;
import racingcar.service.CarService;
import racingcar.view.InputView;
import racingcar.view.OutputView;

import java.util.Collections;
import java.util.List;
import java.util.StringJoiner;

import static racingcar.constant.CarConstant.RACING_WINNER_SEPARATOR;

public class CarController {
    private final CarService carService = new CarService();
    private final InputView inputView = new InputView();
    private final OutputView outputView = new OutputView();


    public void inputCarNames() {
        try {
            carService.insertCar(inputView.readCarNames().replace(" ", ""));

        } catch (IllegalArgumentException error) {
            outputView.printError(error);
            inputCarNames();
        }
    }

    public Integer inputTryCount() {
        try {
            return inputView.readTryCount();
        } catch (IllegalArgumentException error) {
            outputView.printError(error);
            return inputTryCount();
        }
    }

    public void move(Integer tryCount) {
        outputView.printTryResultMessage();
        List<Car> cars = carService.findAllCars();

        for (int i = 0; i < tryCount; i++) {
            List<Car> movedCars = carService.moveCars(cars);
            outputView.printCarsDistance(movedCars);
        }
    }

    public void showWinner() {
        List<Car> cars = carService.findAllCars();
        Collections.sort(cars);

        Integer winningPosition = cars.get(0).getPosition();
        String winnerNames = getWinnerNames(cars, winningPosition);

        outputView.printWinners(winnerNames);
    }

    private String getWinnerNames(List<Car> cars, Integer winningPosition) {
        StringJoiner winnerJoiner = new StringJoiner(RACING_WINNER_SEPARATOR);
        for (Car car : cars) {
            if (car.getPosition() == winningPosition) {
                winnerJoiner.add(car.getName());
            }
        }

        return winnerJoiner.toString();
    }

}
