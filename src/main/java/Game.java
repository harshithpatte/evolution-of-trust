public class Game {
    private Player player1;
    private Player player2;

    public Game(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void play(){
        askTheChoice(player1.getName());
        boolean p1hasCooperated = player1.chooseToCooperate();
        askTheChoice(player2.getName());
        boolean p2hasCooperated = player2.chooseToCooperate();
        if (p1hasCooperated){
            player2.addCoins(3);
            player1.subtractCoins(1);
        }
        if (p2hasCooperated){
            player1.addCoins(3);
            player2.subtractCoins(1);
        }

        showScore(player1);
        showScore(player2);

    }

    private void showScore(Player player) {
        System.out.println(player.getName() + "score:" + player.getScore());
    }

    private void askTheChoice(String playerName) {
        System.out.println(playerName + " choose to cooperate:");
    }
}
