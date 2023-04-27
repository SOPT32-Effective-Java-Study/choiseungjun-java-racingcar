package racingcar.repository;

import racingcar.domain.Car;

import java.util.LinkedList;
import java.util.List;

public class CarRepository {
    List<Car> cars = new LinkedList<>();

    public void insert(Car car) {
        cars.add(car);
    }
}
