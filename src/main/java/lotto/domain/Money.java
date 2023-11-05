package lotto.domain;

import lotto.validate.Validate;

public class Money {
    private static final int DIVISOR = 1000;
    private final int buy;

    public Money(int buy) {
        validate(buy);
        this.buy = buy;
    }

    public void validate(int buy) {
        Validate.checkDivideByThousand(buy);
    }

    public int numberOfLotto() {
        return (buy / DIVISOR);
    }
}
