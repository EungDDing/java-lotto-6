package lotto.domain;

import java.util.List;

public class Game {
    private final List<Integer> winningNumber;
    private final int bonusNumber;

    public Game(Lotto winningNumber, BonusNumber bonusNumber) {
        this.winningNumber = winningNumber.getNumbers();
        this.bonusNumber = bonusNumber.getBonusNumber();
    }

    public List<Integer> getWinningNumber() {
        return winningNumber;
    }

    public int getBonusNumber() {
        return bonusNumber;
    }
}
