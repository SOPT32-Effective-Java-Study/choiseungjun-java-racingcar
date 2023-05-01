package racingcar;

import racingcar.controller.CarController;
import racingcar.service.CarService;

public class Application {
    public static void main(String[] args) {

        CarController carController = CarController.newInstance(new CarService());
        CarRacing carRacing = CarRacing.from(carController);
        carRacing.run();
    }
}
