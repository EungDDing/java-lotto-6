package lotto.controller;

import lotto.domain.BonusNumber;
import lotto.domain.Game;
import lotto.domain.Lotto;
import lotto.domain.Money;
import lotto.validate.Validate;
import lotto.view.InputView;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static camp.nextstep.edu.missionutils.Console.readLine;

public class Controller {
    private static final String SLICING_SYMBOL = ",";

    public void run() {
        inputMoney();
        getWinningNumber();
        inputBonusNumber();
    }
    public String inputWinningNumber() {
        String winningNumber = readLine();
        return winningNumber;
    }
    public List<Integer> convertStringToIntegerList(String winnigNumber){
        List<Integer> winningNumbers = Arrays.stream(winnigNumber.split(SLICING_SYMBOL)).mapToInt(Integer::parseInt).boxed().collect(Collectors.toList());
        return winningNumbers;
    }
    public Lotto saveWinningnumber() {
        String winningNumber = inputWinningNumber();
        List<Integer> winningNumbers = convertStringToIntegerList(winningNumber);
        Lotto lotto = new Lotto(winningNumbers);
        return lotto;
    }
    public Lotto getWinningNumber() {
        Lotto lotto;
        try {
            InputView.printInputWinngNumber();
            lotto = saveWinningnumber();
        } catch (IllegalArgumentException e){
            return getWinningNumber();
        }
        return lotto;
    }
    public BonusNumber inputBonusNumber() {
        String bonusNumber;
        BonusNumber bonus;
        try {
            InputView.printInputBonusNumber();
            bonusNumber = readLine();
            bonus = new BonusNumber(bonusNumber);
        } catch (IllegalArgumentException e) {
            return inputBonusNumber();
        }
        return bonus;
    }
    public Money inputMoney() {
        String money;
        Money buy;
        try {
            InputView.printInputMoney();
            money = readLine();
            validateMoney(money);
            buy = new Money(Integer.parseInt(money));
        } catch (IllegalArgumentException e) {
            return inputMoney();
        }
        return buy;
    }
    public void validateMoney(String money) {
        Validate.checkMoneyIsDigit(money);
        Validate.checkMoneyIsEmpty(money);
    }
}
