package lotto.domain;

import lotto.validate.Validate;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lotto {
    private final List<Integer> numbers;

    public Lotto(List<Integer> numbers) {
        validate(numbers);
        this.numbers = sortLottoNumbers(numbers);
    }

    private void validate(List<Integer> numbers) {
        Validate.checkSize(numbers);
        Validate.checkDuplication(numbers);
        Validate.checkNumberRange(numbers);
    }

    public List<Integer> getNumbers() {
        return numbers;
    }

    public List<Integer> sortLottoNumbers(List<Integer> numbers) {
        List<Integer> sortNumbers = new ArrayList<Integer>(numbers);
        Collections.sort(sortNumbers);
        return sortNumbers;
    }
}
