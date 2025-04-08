public class MovableUser {

    public static double getTotalTime(MovableObject movable) {
        double totalTime = movable.getTimeToMove(1000);  // Déplace 1 km

        movable.brake();  // Freine l'objet si possible
        totalTime += movable.getTimeToMove(100);  // Déplace de 100 mètres après freinage

        if (movable.canAccelerate()) {
            movable.accelerate();  // Accélère l'objet si possible
            totalTime += movable.getTimeToMove(1000);  // Déplace encore 1 km après accélération
        }

        return totalTime;
    }

    public static void main(String[] args) {
        // Créer les objets
        ConstantSpeedMovable constantSpeed = new ConstantSpeedMovable(10);  // 10 m/s
        GeneralMovable generalMovable1 = new GeneralMovable(5, 1);  // Vitesse initiale 5 m/s, accélération 1 m/s²
        GeneralMovable generalMovable2 = new GeneralMovable(7, 0.5);  // Vitesse initiale 7 m/s, accélération 0.5 m/s²

        // Accélérer un des objets
        generalMovable1.accelerate();

        // Afficher le temps pour chaque objet pour parcourir 1 km
        System.out.println("Time for ConstantSpeedMovable (1 km): " + constantSpeed.getTimeToMove(1000) + " seconds");
        System.out.println("Time for GeneralMovable1 (1 km): " + generalMovable1.getTimeToMove(1000) + " seconds");
        System.out.println("Time for GeneralMovable2 (1 km): " + generalMovable2.getTimeToMove(1000) + " seconds");

        // Afficher le temps total pour chaque objet avec les actions (freinage, déplacement de 100m, accélération)
        System.out.println("Total time for ConstantSpeedMovable: " + getTotalTime(constantSpeed) + " seconds");
        System.out.println("Total time for GeneralMovable1: " + getTotalTime(generalMovable1) + " seconds");
        System.out.println("Total time for GeneralMovable2: " + getTotalTime(generalMovable2) + " seconds");
    }
}
