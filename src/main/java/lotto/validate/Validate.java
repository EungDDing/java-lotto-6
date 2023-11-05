package lotto.validate;

import lotto.view.ErrorView;

import java.util.List;

public class Validate {
    private static final int SIZE_OF_LOTTO = 6;
    private static final int MIN_NUMBER = 1;
    private static final int MAX_NUMBER = 45;

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
}
