package lotto.domain;

public class Money {
    private final int buy;

    public Money(int buy) {
        validate(buy);
        this.buy = buy;
    }

    public void validate(int buy) {
        
    }
}
