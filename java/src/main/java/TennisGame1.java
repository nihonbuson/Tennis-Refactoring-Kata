
public class TennisGame1 implements TennisGame {

    Player player1;
    Player player2;

    public TennisGame1(String player1Name, String player2Name) {
        player1 = new Player(player1Name);
        player2 = new Player(player2Name);
    }

    public void wonPoint(String playerName) {
        if (playerName == player1.playerName){
            player1.score += 1;
        }
        else
            player2.score += 1;
    }

    public String getScore() {
        String score = "";
        int tempScore=0;
        if (player1.score==player2.score)
        {
            score = getTieScore();
        }
        else if (player1.score>=4 || player2.score>=4)
        {
            score = getAdvantageScore();
        }
        else
        {
            for (int i=1; i<3; i++)
            {
                if (i==1) tempScore = player1.score;
                else {
                    score+="-";
                    tempScore = player2.score;
                }
                switch(tempScore)
                {
                    case 0:
                        score+="Love";
                        break;
                    case 1:
                        score+="Fifteen";
                        break;
                    case 2:
                        score+="Thirty";
                        break;
                    case 3:
                        score+="Forty";
                        break;
                }
            }
        }
        return score;
    }

    private String getAdvantageScore() {
        boolean isMoreScoreByPlayer1 = isMoreScore(player1, player2);
        String score;
        int minusResult = player1.score-player2.score;
        if (minusResult==1) score ="Advantage " + player1.playerName;
        else if (minusResult>=2) score = "Win for " + player1.playerName;
        else if (minusResult ==-1) score ="Advantage " + player2.playerName;
        else score ="Win for " + player2.playerName;
        return score;
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
