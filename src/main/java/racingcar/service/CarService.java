package racingcar.service;

import camp.nextstep.edu.missionutils.Randoms;
import racingcar.domain.Car;
import racingcar.repository.CarRepository;

import java.util.Arrays;
import java.util.List;

import static racingcar.constant.CarConstant.*;

public class CarService {
    private final CarRepository carRepository = new CarRepository();

    public void insertCar(String carNames) {

        for (String carName : separateCarNames(carNames)) {
            carRepository.insert(Car.create(carName));
        }
    }

    public List<Car> findAllCars() {
        return carRepository.findAll();
    }

    public List<Car> moveCars(List<Car> cars) {
        for (Car car : cars) {
            car.move(getMovingPosition());
        }

        carRepository.update(cars);

        return cars;
    }

    private List<String> separateCarNames(String carNames) {
        String[] seperatedCarNames = carNames.split(CAR_NAME_SEPARATOR);

        return Arrays.asList(seperatedCarNames);
    }

    private Integer getMovingPosition() {
        int randomMovingValue = Randoms.pickNumberInRange(MIN_CAR_MOVE_FORWARD_RANDOM_VALUE, MAX_CAR_MOVE_FORWARD_RANDOM_VALUE);
        Integer movingPosition = 0;

        if (randomMovingValue >= CAR_MOVE_FORWARD_STANDARD) {
            return 1;
        }

        return movingPosition;
    }

}
