package racingcar;

import racingcar.controller.CarController;
import racingcar.domain.Car;

import java.util.List;

public class CarRacing {

    private final CarController controller;

    public CarRacing(CarController controller) {
        this.controller = controller;
    }

    public void run() {
        controller.inputCarNames();

        Integer tryCount = controller.inputTryCount();
        List<Car> cars = controller.findAllCars();
        controller.move(tryCount, cars);
    }
}
