import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TennisGame1Test {

    TennisGame1 tennisGame1;

    @BeforeEach
    void _事前準備(){
        tennisGame1 = new TennisGame1("player1", "player2");
    }

    @Nested
    class _同点の場合{
        @Test
        public void _0_0の場合() {
            String score = tennisGame1.getScore();
            assertEquals("Love-All",score);
        }

        @Test
        public void _1_1の場合() {
            wonPointBy("player1", 1);
            wonPointBy("player2", 1);
            String score = tennisGame1.getScore();
            assertEquals("Fifteen-All",score);
        }

        @Test
        public void _2_2の場合() {
            wonPointBy("player1", 2);
            wonPointBy("player2", 2);
            String score = tennisGame1.getScore();
            assertEquals("Thirty-All",score);
        }

        @Test
        public void _3_3の場合() {
            wonPointBy("player1", 3);
            wonPointBy("player2", 3);
            String score = tennisGame1.getScore();
            assertEquals("Deuce",score);
        }

        @Test
        public void _4_4の場合() {
            wonPointBy("player1", 4);
            wonPointBy("player2", 4);
            String score = tennisGame1.getScore();
            assertEquals("Deuce",score);
        }
    }

    @Nested
    class _どちらかが4点以上を取って差が付いている場合{
        @Test
        public void _4_3の場合() {
            wonPointBy("player1", 4);
            wonPointBy("player2", 3);
            String score = tennisGame1.getScore();
            assertEquals("Advantage player1",score);
        }

        @Test
        public void _5_3の場合() {
            wonPointBy("player1", 5);
            wonPointBy("player2", 3);
            String score = tennisGame1.getScore();
            assertEquals("Win for player1",score);
        }

        @Test
        public void _3_4の場合() {
            wonPointBy("player1", 3);
            wonPointBy("player2", 4);
            String score = tennisGame1.getScore();
            assertEquals("Advantage player2",score);
        }

        @Test
        public void _3_5の場合() {
            wonPointBy("player1", 3);
            wonPointBy("player2", 5);
            String score = tennisGame1.getScore();
            assertEquals("Win for player2",score);
        }
    }

    private void wonPointBy(String playerName, int point) {
        for(int i=0; i<point; i++){
            tennisGame1.wonPoint(playerName);
        }
    }
}