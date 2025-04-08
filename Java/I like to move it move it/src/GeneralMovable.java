public class GeneralMovable implements MovableObject {
    private double speed;  // Vitesse actuelle en m/s
    private double acceleration;  // Accélération en m/s^2

    public GeneralMovable(double speed, double acceleration) {
        this.speed = speed;
        this.acceleration = acceleration;
    }

    @Override
    public boolean canAccelerate() {
        return acceleration > 0;  // Peut accélérer si l'accélération est positive
    }

    @Override
    public void accelerate() {
        if (canAccelerate()) {
            speed += acceleration;  // Augmente la vitesse en fonction de l'accélération
        }
    }

    @Override
    public double getTimeToMove(double distance) {
        // Temps = distance / vitesse. Si la vitesse change avec le temps, une approximation est utilisée.
        return distance / speed;
    }

    @Override
    public void brake() {
        if (speed > 0) {
            speed = Math.max(0, speed - 2);  // Réduit la vitesse, mais ne devient pas négative
        }
    }
}
