public class Game {
    private Player[] players;

    public Game(Player player1, Player player2, Player player3) {
        players = new Player[]{player1, player2, player3};
    }

    public void playTurn() {
        // Chaque joueur lance ses dés
        for (int i = 0; i < players.length; i++) {
            players[i].throwDice();
        }

        // Calculer les scores de chaque joueur
        int[] totals = new int[players.length];
        for (int i = 0; i < players.length; i++) {
            totals[i] = players[i].getDice().getFirstDie() + players[i].getDice().getSecondDie() + players[i].getDice().getThirdDie();
        }

        // Compare les résultats et ajuste les scores
        for (int i = 0; i < players.length; i++) {
            for (int j = 0; j < players.length; j++) {
                if (i != j && totals[i] <= totals[j]) {
                    players[i].adjustScore(-1);  // Perdre un point
                    players[i].throwDice();      // Re-lancer les dés
                }
            }
        }
    }

    public void printScores() {
        for (Player player : players) {
            System.out.println(player.getName() + " score: " + player.getScore());
        }
    }

    public Player getWinner() {
        Player winner = players[0];
        for (Player player : players) {
            if (player.getScore() > winner.getScore()) {
                winner = player;
            }
        }
        return winner;
    }

    public void playGame() {
        for (int turn = 1; turn <= 20; turn++) {
            System.out.println("Turn " + turn + ":");
            playTurn();
            printScores();
        }

        System.out.println("Winner: " + getWinner().getName());
    }
}
