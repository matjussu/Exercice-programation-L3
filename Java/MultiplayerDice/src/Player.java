public class Player {
    private String name;
    private TripletOfDice dice;
    private int score;

    public Player(String name) {
        this.name = name;
        this.dice = new TripletOfDice(6);  // Chaque joueur a des dés à 6 faces
        this.score = 0;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    public void throwDice() {
        dice.rollAllDice();
    }

    public void adjustScore(int points) {
        score += points;
    }

    public TripletOfDice getDice() {
        return dice;
    }
}
