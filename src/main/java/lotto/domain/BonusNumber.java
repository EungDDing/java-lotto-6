package lotto.domain;

import lotto.validate.Validate;

public class BonusNumber {
    private final int bonusNumber;

    public BonusNumber(String bonusNumber) {
        validateBonusNumber(bonusNumber);
        this.bonusNumber = Integer.parseInt(bonusNumber);
    }

    public void validateBonusNumber(String bonusNumber) {
        Validate.checkBonusNumberIsEmpty(bonusNumber);
        Validate.checkBounsNumberRange(bonusNumber);
    }

    public int getBonusNumber() {
        return bonusNumber;
    }
}
