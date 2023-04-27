package racingcar;

import racingcar.controller.CarController;

public class Application {
    public static void main(String[] args) {
        // TODO 구현 진행
        CarRacing carRacing = new CarRacing(new CarController());
        carRacing.run();
    }
}
