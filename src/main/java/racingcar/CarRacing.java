package racingcar;

import racingcar.controller.CarController;

public class CarRacing {

    private final CarController controller;

    public CarRacing(CarController controller) {
        this.controller = controller;
    }

    public void run() {
        controller.inputCarNames();
        Integer tryCount = controller.inputTryCount();
    }
}
