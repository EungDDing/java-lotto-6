package lotto.view;

public class ErrorView {
    public void printSizeError() {
        System.out.println("[ERROR] 로또 번호는 총 6개여야 합니다.");
    }
    public void printDuplicationError() {
        System.out.println("[ERROR] 로또 번호는 중복되지 않아야 합니다.");
    }
    public void printNumberRangerError() {
        System.out.println("[ERROR] 로또 번호는 1부터 45 사이의 숫자여야합니다.");
    }
    public void printEmptyError() {
        System.out.println("[ERROR] 아무런 입력을 하지 않았습니다.");
    }
}
