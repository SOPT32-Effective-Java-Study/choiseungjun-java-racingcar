package racingcar.view.message;

public class ErrorMessage {

    private static final String ERROR_PREFIX = "[ERROR] ";

    public static final String CAR_NAME_LENGTH_ERROR_MESSAGE = ERROR_PREFIX + "Car의 이름은 5자 이하로 작명해야합니다.";
    public static final String TRY_COUNT_NUMBER_FORMAT_ERROR_MESSAGE = ERROR_PREFIX + "시도 횟수는 정수로 입력되어야 합니다.";
}
