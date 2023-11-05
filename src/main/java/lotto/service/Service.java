package lotto.service;

import lotto.domain.Game;
import lotto.domain.Money;

import java.util.List;

public class Service {
    public int numberOfGame(Money buy) {
        return buy.numberOfLotto();
    }
    public List<Integer> winningNumber(Game game) {
        return game.getWinningNumber();
    }
    public int bonusNumber(Game game) {
        return game.getBonusNumber();
    }
}
