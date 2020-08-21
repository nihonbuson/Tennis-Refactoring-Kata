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

}
