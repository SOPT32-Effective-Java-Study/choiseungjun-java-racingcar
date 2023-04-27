package racingcar.controller;

import racingcar.service.CarService;
import racingcar.view.InputView;
import racingcar.view.OutputView;

public class CarController {
    private final CarService carService = new CarService();
    private final InputView inputView = new InputView();
    private final OutputView outputView = new OutputView();


    public void inputCarNames() {
        try {
            carService.insertCar(inputView.readCarNames());

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
}
