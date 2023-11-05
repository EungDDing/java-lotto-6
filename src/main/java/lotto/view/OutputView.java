package lotto.view;

import lotto.domain.Lotto;

import java.util.List;

public class OutputView {
    public static void printNumberOfGames(int number) {
        System.out.println();
        System.out.println(number + "개를 구입했습니다.");
    }
    public static void printLottos(List<Lotto> lottos) {
        for (Lotto lotto : lottos) {
            System.out.println(lotto.getNumbers());
        }
    }
}
