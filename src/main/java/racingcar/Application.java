package racingcar;

import racingcar.controller.CarController;
import racingcar.service.CarService;

public class Application {
    public static void main(String[] args) {

        CarController controller = CarController.newInstance(new CarService());
        controller.run();
    }
}
