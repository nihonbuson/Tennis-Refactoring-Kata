import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TennisGame1Test {
    @Test
    public void _0_0の場合() {
        String score = new TennisGame1("player1", "player2").getScore();
        assertEquals("Love-All",score);
    }

    @Test
    public void _1_1の場合() {
        TennisGame1 tennisGame1 = new TennisGame1("player1", "player2");
        tennisGame1.wonPoint("player1");
        tennisGame1.wonPoint("player2");
        String score = tennisGame1.getScore();
        assertEquals("Fifteen-All",score);
    }

    @Test
    public void _2_2の場合() {
        TennisGame1 tennisGame1 = new TennisGame1("player1", "player2");
        tennisGame1.wonPoint("player1");
        tennisGame1.wonPoint("player1");
        tennisGame1.wonPoint("player2");
        tennisGame1.wonPoint("player2");
        String score = tennisGame1.getScore();
        assertEquals("Thirty-All",score);
    }

    @Test
    public void _3_3の場合() {
        TennisGame1 tennisGame1 = new TennisGame1("player1", "player2");
        tennisGame1.wonPoint("player1");
        tennisGame1.wonPoint("player1");
        tennisGame1.wonPoint("player1");
        tennisGame1.wonPoint("player2");
        tennisGame1.wonPoint("player2");
        tennisGame1.wonPoint("player2");
        String score = tennisGame1.getScore();
        assertEquals("Deuce",score);
    }

    @Test
    public void _4_4の場合() {
        TennisGame1 tennisGame1 = new TennisGame1("player1", "player2");
        tennisGame1.wonPoint("player1");
        tennisGame1.wonPoint("player1");
        tennisGame1.wonPoint("player1");
        tennisGame1.wonPoint("player1");
        tennisGame1.wonPoint("player2");
        tennisGame1.wonPoint("player2");
        tennisGame1.wonPoint("player2");
        tennisGame1.wonPoint("player2");
        String score = tennisGame1.getScore();
        assertEquals("Deuce",score);
    }


}