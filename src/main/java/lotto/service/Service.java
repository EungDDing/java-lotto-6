package lotto.service;

import camp.nextstep.edu.missionutils.Randoms;
import lotto.domain.Game;
import lotto.domain.Lotto;
import lotto.domain.Money;

import java.util.List;

public class Service {
    private static final int MIN_NUMBER = 1;
    private static final int MAX_NUMBER = 45;
    private static final int SIZE_OF_LOTTO = 6;
    public int numberOfGame(Money buy) {
        return buy.numberOfLotto();
    }
    public List<Integer> winningNumber(Game game) {
        return game.getWinningNumber();
    }
    public int bonusNumber(Game game) {
        return game.getBonusNumber();
    }
    public Lotto generateRandomLottoNumbers() {
        List<Integer> randomNumbers = Randoms.pickUniqueNumbersInRange(MIN_NUMBER, MAX_NUMBER, SIZE_OF_LOTTO);
        Lotto lotto = new Lotto(randomNumbers);
        return lotto;
    }
}
