package lotto.validate;

import lotto.view.ErrorView;

import java.util.List;

public class Validate {
    private static final int SIZE_OF_LOTTO = 6;
    private static final int MIN_NUMBER = 1;
    private static final int MAX_NUMBER = 45;
    private static final int MIN_PRICE = 1000;
    private static final int REMAINDER_IS_ZERO = 0;

    public static void checkSize(List<Integer> numbers) {
        if (numbers.size() != SIZE_OF_LOTTO) {
            ErrorView.printSizeError();
            throw new IllegalArgumentException();
        }
    }
    public static void checkDuplication(List<Integer> numbers) {
        if (numbers.stream().distinct().count() != SIZE_OF_LOTTO) {
            ErrorView.printDuplicationError();
            throw new IllegalArgumentException();
        }
    }
    public static void checkNumberRange(List<Integer> numbers) {
        for (int number : numbers) {
            if (number < MIN_NUMBER || number > MAX_NUMBER) {
                ErrorView.printNumberRangerError();
                throw new IllegalArgumentException();
            }
        }
    }
    public static void checkDivideByThousand(int buy) {
        if (buy % MIN_PRICE != REMAINDER_IS_ZERO) {
            throw new IllegalArgumentException();
        }
    }
    public static void checkIsEmpty(String bonusnumber) {
        if (bonusnumber.isEmpty()) {
            throw new IllegalArgumentException();
        }
    }
    public static void checkIsDigit(String bonusnumber) {
        if (!bonusnumber.chars().allMatch(Character::isDigit)) {
            throw new IllegalArgumentException();
        }
    }
}
