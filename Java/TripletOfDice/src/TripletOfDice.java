import java.util.Random;

public class TripletOfDice {

    private int sides; 
    private int firstDie;
    private int secondDie;
    private int thirdDie;

    public TripletOfDice(int sides) {
        this.sides = sides;
        System.out.println("Nombre de faces des dés : " + sides);  
        rollAllDice();
    }

    public void rollAllDice() {
        Random rand = new Random();
        this.firstDie = rand.nextInt(sides) + 1;
        this.secondDie = rand.nextInt(sides) + 1;
        this.thirdDie = rand.nextInt(sides) + 1;

        // Débogage : affiche les résultats des dés
        System.out.println("Lancer des dés : " + firstDie + ", " + secondDie + ", " + thirdDie);
    }

    public void rollOneDie(int dieNumber) {
        Random rand = new Random();
        switch (dieNumber) {
            case 1:
                this.firstDie = rand.nextInt(sides) + 1;
                break;
            case 2:
                this.secondDie = rand.nextInt(sides) + 1;
                break;
            case 3:
                this.thirdDie = rand.nextInt(sides) + 1;
                break;
            default:
                throw new IllegalArgumentException("Le numéro du dé doit être 1, 2 ou 3.");
        }
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
