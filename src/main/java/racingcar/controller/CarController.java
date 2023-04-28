package racingcar.controller;

import racingcar.domain.Car;
import racingcar.service.CarService;
import racingcar.view.InputView;
import racingcar.view.OutputView;

import java.util.List;

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

    public List<Car> findAllCars() {
        List<Car> cars = carService.findAllCars();

        return cars;
    }

    public void move(Integer tryCount, List<Car> cars) {
        outputView.printTryResultMessage();

        for (int i = 0; i < tryCount; i++) {
            List<Car> movedCars = carService.moveCars(cars);
            outputView.printCarsDistance(movedCars);
        }
    }
}
