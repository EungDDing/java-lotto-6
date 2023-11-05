package lotto.domain;

import lotto.validate.Validate;

public class Money {
    private final int buy;

    public Money(int buy) {
        validate(buy);
        this.buy = buy;
    }

    public void validate(int buy) {
        Validate.checkDivideByThousand(buy);
    }
}
