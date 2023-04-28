package racingcar;

import racingcar.controller.CarController;

public class CarRacing {
    private final CarController controller;

    private CarRacing(CarController carController) {
        this.controller = carController;
    }

    public static CarRacing from(CarController carController) {
        return new CarRacing(carController);
    }


    public void run() {
        controller.inputCarNames();

        int tryCount = controller.inputTryCount();
        controller.move(tryCount);

        controller.showWinner();
    }
}
