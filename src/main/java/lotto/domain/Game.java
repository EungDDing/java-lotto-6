package lotto.domain;

public class Game {
    private final Lotto winningNumber;
    private final BonusNumber bonusNumber;

    public Game(Lotto winningNumber, BonusNumber bonusNumber) {
        this.winningNumber = winningNumber;
        this.bonusNumber = bonusNumber;
    }

    public Lotto getWinningNumber() {
        return winningNumber;
    }

    public BonusNumber getBonusNumber() {
        return bonusNumber;
    }
}
