public class Runner {
    public static void main(String[] args) {

        Player player1 = new Player("Harshith", new ScannerReader());
        Player player2 = new Player("Arvind", new ScannerReader());
        Player bot = new CooperativeBot("Player 2");
        Player copyCat = new CopyCat("CopyCat", player1);
        Game game = new Game(player1, copyCat);
        while (true) {
            game.play();
            System.out.println();
        }
    }
}
