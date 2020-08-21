
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
        if (player1.isTieScore(player2))
        {
            return getTieScore();
        }
        else if (player1.score>=4 || player2.score>=4)
        {
            return getAdvantageScore();
        }
        else
        {
            return player1.getNormalScoreName() + "-" + player2.getNormalScoreName();
        }
    }

    private String getAdvantageScore() {
        boolean isMoreScoreByPlayer1 = player1.isMoreScoreThan(player2);
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


    private String getTieScore() {
        if(player1.score >= 3){
            return "Deuce";
        }
        return player1.getNormalScoreName() + "-All";
    }
}
