public class Player {
    int score;
    String playerName;

    public Player(String playerName) {

        this.playerName = playerName;
    }

    public boolean isMoreScoreThan(Player player2) {
        return this.score > player2.score;
    }

    public boolean isTieScore(Player player2) {
        return this.score==player2.score;
    }

    String getNormalScoreName() {
        switch(score)
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

    boolean isAdvantageScore() {
        return score>=4;
    }
}
