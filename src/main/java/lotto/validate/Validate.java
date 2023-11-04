package lotto.validate;

import java.util.List;

public class Validate {
    private static final int SIZE_OF_LOTTO = 6;
    private static final int MIN_NUMBER = 1;
    private static final int MAX_NUMBER = 45;

    public static void checkSize(List<Integer> numbers) {
        if (numbers.size() != SIZE_OF_LOTTO) {
            throw new IllegalArgumentException("[ERROR] 로또 번호는 총 6개여야 합니다.");
        }
    }
    public static void checkDuplication(List<Integer> numbers) {
        if (numbers.stream().distinct().count() != SIZE_OF_LOTTO) {
            throw new IllegalArgumentException("[ERROR] 로또 번호는 중복되지 않아야 합니다.");
        }
    }
    public static void checkNumberRange(List<Integer> numbers) {
        for (int number : numbers) {
            if (number < MIN_NUMBER || number > MAX_NUMBER) {
                throw new IllegalArgumentException("[ERROR] 로또 번호는 1부터 45 사이의 숫자여야합니다.");
            }
        }
    }
}
