package lotto.domain;

import lotto.validate.Validate;
import java.util.List;

public class Lotto {
    private final List<Integer> numbers;

    public Lotto(List<Integer> numbers) {
        validate(numbers);
        this.numbers = numbers;
    }

    private void validate(List<Integer> numbers) {
        Validate.checkSize(numbers);
        Validate.checkDuplication(numbers);
        Validate.checkNumberRange(numbers);
    }
}
