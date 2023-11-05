package lotto.controller;

import lotto.domain.Lotto;
import lotto.view.InputView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static camp.nextstep.edu.missionutils.Console.readLine;

public class Controller {
    private static final String SLICING_SYMBOL = ",";

    public void run() {
        try {
            getWinningNumber();
        } catch (IllegalArgumentException e) {
            run();
        }
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
    public void getWinningNumber() {
        InputView.printInputWinngNumber();
        Lotto lotto = saveWinningnumber();
    }
}
