package lotto.domain;

import java.util.List;

public class Game {
    private final List<Integer> winningNumber;
    private final int bonusNumber;

    public Game(List<Integer> winningNumber, int bonusNumber) {
        this.winningNumber = winningNumber;
        this.bonusNumber = bonusNumber;
    }
}
