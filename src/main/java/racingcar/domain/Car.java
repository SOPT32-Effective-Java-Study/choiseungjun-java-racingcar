package racingcar.domain;

import static racingcar.domain.CarConstantValue.MAX_CAR_NAME_LENGTH;
import static racingcar.view.message.ErrorMessage.CAR_NAME_LENGTH_ERROR_MESSAGE;

public class Car implements Comparable<Car> {
    private final String name;
    private int position = 0;


    private Car(String name) {
        validateCarNameLength(name);
        this.name = name;
    }

    public static Car create(String name) {
        return new Car(name);
    }

    // 추가 기능 구현
    public void move(int position) {
        this.position += position;
    }

    public String getName() {
        return name;
    }

    public Integer getPosition() {
        return position;
    }

    private void validateCarNameLength(String name) {
        if (name.length() > MAX_CAR_NAME_LENGTH) {
            throw new IllegalArgumentException(CAR_NAME_LENGTH_ERROR_MESSAGE);
        }
    }

    @Override
    public int compareTo(Car c) {
        return c.getPosition() - this.getPosition();
    }
}
