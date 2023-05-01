package racingcar.service;

import racingcar.domain.Car;
import racingcar.domain.Cars;

import java.util.Arrays;
import java.util.List;

import static racingcar.constant.CarConstant.CAR_NAME_SEPARATOR;

public class CarService {
    private final Cars cars = new Cars();

    public void insertCar(String carNames) {

        for (String carName : separateCarNames(carNames)) {
            cars.insert(Car.from(carName));
        }
    }

    public List<Car> findAllCars() {
        return cars.findAll();
    }

    public List<Car> moveCars() {
        cars.update();
        return findAllCars();
    }

    private List<String> separateCarNames(String carNames) {
        String[] seperatedCarNames = carNames.split(CAR_NAME_SEPARATOR);

        return Arrays.asList(seperatedCarNames);
    }

}
