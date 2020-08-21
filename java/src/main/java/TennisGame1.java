
public class TennisGame1 implements TennisGame {

    Player player1;
    Player player2;

    public TennisGame1(String player1Name, String player2Name) {
        player1 = new Player(player1Name);
        player2 = new Player(player2Name);
    }

    public void wonPoint(String playerName) {
        if (playerName.equals(player1.playerName)){
            player1.score += 1;
        }
        else
            player2.score += 1;
    }

    public String getScore() {
        String score = "";
        if (player1.score==player2.score)
        {
            return getTieScore();
        }
        else if (player1.score>=4 || player2.score>=4)
        {
            return getAdvantageScore();
        }
        else
        {
            score += getNormalScoreName(player1.score);
            score+="-";
            score += getNormalScoreName(player2.score);
            return score;
        }
    }

    private String getNormalScoreName(int tempScore) {
        switch(tempScore)
        {
            case 0:
                return "Love";
            case 1:
                return "Fifteen";
            case 2:
                return "Thirty";
            case 3:
                return "Forty";
        }
        return "";
    }

    private String getAdvantageScore() {
        boolean isMoreScoreByPlayer1 = isMoreScore(player1, player2);
        int minusResult = Math.abs(player1.score-player2.score);
        if(isMoreScoreByPlayer1){
            return getAdvantageMessage(minusResult, player1);
        } else {
            return getAdvantageMessage(minusResult, player2);
        }
    }

    private String getAdvantageMessage(int minusResult, Player player) {
        if (minusResult == 1) return "Advantage " + player.playerName;
        else if (minusResult >= 2) return "Win for " + player.playerName;
        return "";
    }

    private boolean isMoreScore(Player player1, Player player2) {
        return player1.score > player2.score;
    }

    private String getTieScore() {
        switch (player1.score)
        {
            case 0:
                return "Love-All";
            case 1:
                return "Fifteen-All";
            case 2:
                return "Thirty-All";
            default:
                return "Deuce";
        }
    }
}
