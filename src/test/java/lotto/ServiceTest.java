package lotto;

import lotto.domain.BonusNumber;
import lotto.domain.Game;
import lotto.domain.Lotto;
import lotto.service.Service;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class ServiceTest {
    @DisplayName("Game class에 로또 당첨 번호와 보너스 번호가 잘 저장되는지 확인")
    @Test
    void checkSaveWinningNumberAndBonusNumber() {
        Lotto lotto = new Lotto(List.of(1, 2, 3, 4, 5, 6));
        BonusNumber bonus = new BonusNumber("7");
        Game game = new Game(lotto, bonus);
        Service service = new Service();
        assertThat(service.winningNumber(game)).isEqualTo(List.of(1, 2, 3, 4, 5, 6));
        assertThat(service.bonusNumber(game)).isEqualTo(7);
    }
}
