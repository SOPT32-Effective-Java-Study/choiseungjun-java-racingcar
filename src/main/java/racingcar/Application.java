package racingcar;

import racingcar.controller.CarController;
import racingcar.service.CarService;
import racingcar.view.InputView;
import racingcar.view.OutputView;

public class Application {
    public static void main(String[] args) {
        // TODO 구현 진행
        CarController carController = CarController.of(new CarService(), new InputView(), new OutputView());
        CarRacing carRacing = CarRacing.from(carController);
        carRacing.run();
    }
}
