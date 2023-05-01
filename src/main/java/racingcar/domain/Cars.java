package racingcar.domain;

import java.util.LinkedList;
import java.util.List;

public class Cars {
    private final List<Car> cars = new LinkedList<>();

    public void insert(Car car) {
        cars.add(car);
    }

    public List<Car> findAll() {
        return cars;
    }

    public void update() {
        for (Car car : cars) {
            car.move();
        }
    }
}
