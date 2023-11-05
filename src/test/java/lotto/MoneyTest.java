package lotto;

import lotto.domain.Money;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;

public class MoneyTest {
    @DisplayName("구매 금액이 1000원으로 나눠떨어지지 않으면 예외가 발생한다.")
    @Test
    void createMoneyByNotDivideByThousand() {
        assertThatThrownBy(() -> new Money(1100))
                .isInstanceOf(IllegalArgumentException.class);
    }
    @DisplayName("구매 금액에 따른 로또 게임 수를 출력한다.")
    @Test
    void convertMoneyToNumberOfGame() {
        Money buy = new Money(8000);
        assertThat(buy.numberOfLotto()).isEqualTo(8);
    }
}
