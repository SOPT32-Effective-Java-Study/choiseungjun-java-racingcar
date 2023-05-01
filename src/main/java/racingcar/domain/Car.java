package racingcar.domain;

import camp.nextstep.edu.missionutils.Randoms;

import static racingcar.constant.CarConstant.*;
import static racingcar.view.message.ErrorMessage.CAR_NAME_LENGTH_ERROR_MESSAGE;

public class Car implements Comparable<Car> {
    private final String name;
    private int position = 0;


    private Car(String name) {
        validateCarNameLength(name);
        this.name = name;
    }

    public static Car from(String name) {
        return new Car(name);
    }

    // 추가 기능 구현
    public void move() {
        this.position += getMovingPosition();
    }

    public String getName() {
        return name;
    }

    public int getPosition() {
        return position;
    }

    private void validateCarNameLength(String name) {
        if (name.length() > MAX_CAR_NAME_LENGTH) {
            throw new IllegalArgumentException(CAR_NAME_LENGTH_ERROR_MESSAGE);
        }
    }

    private int getMovingPosition() {
        int randomMovingValue = Randoms.pickNumberInRange(MIN_CAR_MOVE_FORWARD_RANDOM_VALUE, MAX_CAR_MOVE_FORWARD_RANDOM_VALUE);
        int movingPosition = 0;

        if (randomMovingValue >= CAR_MOVE_FORWARD_STANDARD) {
            return 1;
        }

        return movingPosition;
    }

    @Override
    public int compareTo(Car c) {
        return c.getPosition() - this.getPosition();
    }
}
