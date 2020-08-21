import org.junit.Test;

import static org.junit.Assert.*;

public class TennisGame1Test {
    @Test
    public void _とりあえずテスト実行() {
        new TennisGame1("P1","P2").getScore();
        assertEquals(1,1);
    }
}