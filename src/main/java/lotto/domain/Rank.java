package lotto.domain;

public enum Rank {
    FIRST(6, 2000000000, "6개 일치 (2,000,000,000원)"),
    SECOND(5, 30000000, "5개 일치, 보너스 볼 일치 (30,000,000원)"),
    THIRD(5, 1500000, "5개 일치 (1,500,000원)"),
    FOURTH(4, 50000, "4개 일치 (50,000원)"),
    FIFTH(3, 5000, "3개 일치 (5,000원)"),
    FAIL_MATCH_TWO(2, 0, "2개 일치 (0원)"),
    FAIL_MATCH_ONE(1, 0, "1개 일치 (0원)"),
    FAIL_MATCH_ZERO(0, 0, "0개 일치 (0원)");

    private final int match;
    private final int prize;
    private final String result;

    Rank(int match, int prize, String result) {
        this.match = match;
        this.prize = prize;
        this.result = result;
    }
    
}
