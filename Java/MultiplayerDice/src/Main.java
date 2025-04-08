public class Main {
    public static void main(String[] args) {
        Player player1 = new Player("Player 1");
        Player player2 = new Player("Player 2");
        Player player3 = new Player("Player 3");

        Game game = new Game(player1, player2,player3);  // Pour trois joueurs
        game.playGame();
    }
}
