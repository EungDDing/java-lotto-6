package lotto.domain;

public enum Rank {
    FIRST(6, 2000000000, "2,000,000,000"),
    SECOND(5, 30000000, "30,000,000"),
    THIRD(5, 1500000, "1,500,000"),
    FOURTH(4, 50000, "50,000"),
    FIFTH(3, 5000, "5,000"),
    FAIL_MATCH_TWO(2, 0, "0"),
    FAIL_MATCH_ONE(1, 0, "0"),
    FAIL_MATCH_ZERO(0, 0, "0");

    private final int match;
    private final long prize;
    private final String result;

    Rank(int match, long prize, String result) {
        this.match = match;
        this.prize = prize;
        this.result = result;
    }

}
