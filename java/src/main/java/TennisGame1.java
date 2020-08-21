
public class TennisGame1 implements TennisGame {

    Player player1;
    private int m_score2 = 0;
    private String player2Name;

    public TennisGame1(String player1Name, String player2Name) {
        player1 = new Player(player1Name);
        this.player2Name = player2Name;
    }

    public void wonPoint(String playerName) {
        if (playerName == player1.playerName){
            player1.score += 1;
        }
        else
            m_score2 += 1;
    }

    public String getScore() {
        String score = "";
        int tempScore=0;
        if (player1.score==m_score2)
        {
            score = getTieScore();
        }
        else if (player1.score>=4 || m_score2>=4)
        {
            score = getAdvantageScore();
        }
        else
        {
            for (int i=1; i<3; i++)
            {
                if (i==1) tempScore = player1.score;
                else { score+="-"; tempScore = m_score2;}
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
        String score;
        int minusResult = player1.score-m_score2;
        if (minusResult==1) score ="Advantage " + player1.playerName;
        else if (minusResult ==-1) score ="Advantage " + player2Name;
        else if (minusResult>=2) score = "Win for " + player1.playerName;
        else score ="Win for " + player2Name;
        return score;
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
