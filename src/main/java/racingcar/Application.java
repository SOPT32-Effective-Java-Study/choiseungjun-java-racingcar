package racingcar;

import racingcar.controller.CarController;
import racingcar.service.CarService;

public class Application {
    public static void main(String[] args) {

        CarRacing carRacing = CarRacing.from(CarController.newInstance(new CarService()));
        carRacing.start();
    }
}
