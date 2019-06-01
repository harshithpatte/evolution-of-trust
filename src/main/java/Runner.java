public class Runner {
    public static void main(String[] args) {

        Player player1 = new HumanPlayer("Harshith");
        Player player2 = new HumanPlayer("Arvind");
        Player bot = new CooperativeBot("Player 2");
        Player copyCat = new CopyCat("CopyCat");
        Game game = new Game(player1, copyCat);
        while (true) {
            game.play();
            System.out.println();
        }
    }
}
