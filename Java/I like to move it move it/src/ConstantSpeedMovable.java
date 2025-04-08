public class ConstantSpeedMovable implements MovableObject {
    private double speed;  // Vitesse constante en m/s

    public ConstantSpeedMovable(double speed) {
        this.speed = speed;
    }

    @Override
    public boolean canAccelerate() {
        return false;  // Ne peut pas accélérer, la vitesse est constante
    }

    @Override
    public void accelerate() {
        // Pas de changement de vitesse, donc vide
    }

    @Override
    public double getTimeToMove(double distance) {
        return distance / speed;  // Temps = distance / vitesse
    }

    @Override
    public void brake() {
        // Aucun effet, car la vitesse est constante
    }
}