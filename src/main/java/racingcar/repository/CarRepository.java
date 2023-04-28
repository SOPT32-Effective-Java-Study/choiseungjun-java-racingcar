package racingcar.repository;

import racingcar.domain.Car;

import java.util.LinkedList;
import java.util.List;

public class CarRepository {
    private List<Car> cars = new LinkedList<>();

    public void insert(Car car) {
        cars.add(car);
    }

    public List<Car> findAll() {
        return cars;
    }

    public void update(List<Car> cars) {
        this.cars = cars;
    }
}
