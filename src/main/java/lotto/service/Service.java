package lotto.service;

import lotto.domain.BonusNumber;
import lotto.domain.Game;
import lotto.domain.Lotto;
import lotto.domain.Money;

public class Service {
    public int numberOfGame(Money buy) {
        return buy.numberOfLotto();
    }
    public Lotto winningNumber(Game game) {
        return game.getWinningNumber();
    }
    public BonusNumber bonusNumber(Game game) {
        return game.getBonusNumber();
    }
}
