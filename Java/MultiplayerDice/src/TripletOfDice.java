import java.util.Random;

public class TripletOfDice {
    private int sides;
    private int firstDie;
    private int secondDie;
    private int thirdDie;

    public TripletOfDice(int sides) {
        this.sides = sides;
        rollAllDice();
    }

    public void rollAllDice() {
        Random rand = new Random();
        this.firstDie = rand.nextInt(sides) + 1;
        this.secondDie = rand.nextInt(sides) + 1;
        this.thirdDie = rand.nextInt(sides) + 1;
    }

    public int getFirstDie() {
        return firstDie;
    }

    public int getSecondDie() {
        return secondDie;
    }

    public int getThirdDie() {
        return thirdDie;
    }
}

