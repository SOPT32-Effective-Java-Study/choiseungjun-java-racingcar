package racingcar.controller;

import racingcar.domain.Car;
import racingcar.service.CarService;
import racingcar.view.InputView;
import racingcar.view.OutputView;

import java.util.Collections;
import java.util.List;
import java.util.StringJoiner;

import static racingcar.constant.CarConstant.*;


public class CarController {
    private final CarService carService;
    private final InputView inputView = InputView.getInputView();
    private final OutputView outputView = OutputView.getOutputView();

    private CarController(CarService carService) {
        this.carService = carService;
    }

    public static CarController newInstance(CarService carService) {
        return new CarController(carService);
    }


    public void inputCarNames() {
        try {
            carService.insertCar(inputView.readCarNames().replace(EMPTY_SPACE, NOT_EMPTY_SPACE));

        } catch (IllegalArgumentException error) {
            outputView.printError(error);
            inputCarNames();
        }
    }

    public int inputTryCount() {
        try {
            return inputView.readTryCount();
        } catch (IllegalArgumentException error) {
            outputView.printError(error);
            return inputTryCount();
        }
    }

    public void move(int tryCount) {
        outputView.printTryResultMessage();

        for (int i = 0; i < tryCount; i++) {
            List<Car> movedCars = carService.moveCars();
            outputView.printCarsDistance(movedCars);
        }
    }

    public void showWinner() {
        List<Car> cars = carService.findAllCars();
        Collections.sort(cars);

        int winningPosition = cars.get(0).getPosition();
        String winnerNames = getWinnerNames(cars, winningPosition);

        outputView.printWinners(winnerNames);
    }

    private String getWinnerNames(List<Car> cars, int winningPosition) {
        StringJoiner winnerJoiner = new StringJoiner(RACING_WINNER_SEPARATOR);
        for (Car car : cars) {
            if (car.getPosition() == winningPosition) {
                winnerJoiner.add(car.getName());
            }
        }

        return winnerJoiner.toString();
    }

}
