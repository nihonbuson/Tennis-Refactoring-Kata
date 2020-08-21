import org.junit.Test;

import static org.junit.Assert.*;

public class TennisGame1Test {
    @Test
    public void _とりあえずテスト実行() {
        String score = new TennisGame1("P1", "P2").getScore();
        assertEquals("Love-All",score);
    }
}