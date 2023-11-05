package lotto.domain;

import java.util.List;

public class Game {
    private final Lotto winningNumber;
    private final int bonusNumber;

    public Game(Lotto winningNumber, int bonusNumber) {
        this.winningNumber = winningNumber;
        this.bonusNumber = bonusNumber;
    }
}
