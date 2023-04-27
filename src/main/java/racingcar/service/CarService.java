package racingcar.service;

import racingcar.domain.Car;
import racingcar.repository.CarRepository;

import java.util.Arrays;
import java.util.List;

import static racingcar.domain.CarConstantValue.CAR_NAME_SEPARATOR;

public class CarService {
    private final CarRepository carRepository = new CarRepository();

    public void insertCar(String carNames) {

        for (String carName : separateCarNames(carNames)) {
            carRepository.insert(Car.create(carName));
        }
    }

    private List<String> separateCarNames(String carNames) {
        String[] seperatedCarNames = carNames.split(CAR_NAME_SEPARATOR);

        return Arrays.asList(seperatedCarNames);
    }
}
