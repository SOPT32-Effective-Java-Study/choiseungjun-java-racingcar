package racingcar.controller;

import racingcar.service.CarService;
import racingcar.view.InputView;
import racingcar.view.OutputView;

import java.util.function.Supplier;

public class CarController {
    private final CarService carService = new CarService();
    private final InputView inputView = new InputView();
    private final OutputView outputView = new OutputView();

    public void run() {
        inputCarNames();
    }

    private void inputCarNames() {
        try {
            carService.insertCar(inputView.readCarNames());

        } catch (IllegalArgumentException error) {
            outputView.printError(error);
            inputCarNames();
        }
    }
}
