package lotto.service;

import camp.nextstep.edu.missionutils.Randoms;
import lotto.domain.Game;
import lotto.domain.Lotto;
import lotto.domain.Money;
import lotto.domain.Rank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Service {
    private static final int MIN_NUMBER = 1;
    private static final int MAX_NUMBER = 45;
    private static final int SIZE_OF_LOTTO = 6;

    private static List<Lotto> lottos;
    private static HashMap<Rank, Integer> result = new HashMap<>();

    public static void initResult() {
        for (Rank rank : Rank.values()) {
            result.put(rank, 0);
        }
    }
    public static int numberOfGame(Money buy) {
        return buy.numberOfLotto();
    }
    public static List<Integer> winningNumber(Game game) {
        return game.getWinningNumber();
    }
    public static int bonusNumber(Game game) {
        return game.getBonusNumber();
    }
    public static Lotto generateRandomLottoNumbers() {
        List<Integer> randomNumbers = Randoms.pickUniqueNumbersInRange(MIN_NUMBER, MAX_NUMBER, SIZE_OF_LOTTO);
        Lotto lotto = new Lotto(randomNumbers);
        return lotto;
    }
    public static List<Lotto> randomLottos(Money buy) {
        lottos = new ArrayList<>();
        for (int i = 0; i < numberOfGame(buy); i++) {
            lottos.add(generateRandomLottoNumbers());
        }
        return lottos;
    }
    public int match(List<Integer> randomNumber, List<Integer> winningNumber) {
        int count = 0;
        for (Integer number : winningNumber) {
            if (randomNumber.contains(number)) {
                count++;
            }
        }
        return count;
    }
    public int bonusMatch(List<Integer> randomNumber, int bonusNumber) {
        int bonusCount = 0;
        if (randomNumber.contains(bonusNumber)) {
            bonusCount++;
        }
        return bonusCount;
    }
}
