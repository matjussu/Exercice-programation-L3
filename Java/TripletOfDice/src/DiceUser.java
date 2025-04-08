
public class DiceUser {
    public static TripletOfDice rollOnce() {
        TripletOfDice triplet = new TripletOfDice(6); // Création d'un triplet de dés à 6 faces
        return triplet;
    }

    public static void main(String[] args) {
        // Lance les dés et récupère le triplet
        TripletOfDice triplet = rollOnce();
        
        // Affiche les résultats
        System.out.println("The die number 1 is a " + triplet.getFirstDie());
        System.out.println("The die number 2 is a " + triplet.getSecondDie());
        System.out.println("The die number 3 is a " + triplet.getThirdDie());
    }
}
