package lotto.view;

public class ErrorView {
    public static void printSizeError() {
        System.out.println("[ERROR] 로또 번호는 총 6개여야 합니다.");
    }
    public static void printDuplicationError() {
        System.out.println("[ERROR] 로또 번호는 중복되지 않아야 합니다.");
    }
    public static void printNumberRangerError() {
        System.out.println("[ERROR] 로또 번호는 1부터 45 사이의 숫자여야합니다.");
    }
    public static void printBonusNumberIsEmpty() {
        System.out.println("[ERROR] 보너스 번호를 입력해야 합니다.");
    }
}
