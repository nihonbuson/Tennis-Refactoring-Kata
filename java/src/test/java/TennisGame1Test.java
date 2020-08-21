import org.junit.Test;

import static org.junit.Assert.*;

public class TennisGame1Test {
    @Test
    public void _0_0の場合() {
        String score = new TennisGame1("P1", "P2").getScore();
        assertEquals("Love-All",score);
    }

    @Test
    public void _1_1の場合() {
        TennisGame1 tennisGame1 = new TennisGame1("P1", "P2");
        tennisGame1.wonPoint("P1");
        tennisGame1.wonPoint("P2");
        String score = tennisGame1.getScore();
        assertEquals("Fifteen-All",score);
    }
}