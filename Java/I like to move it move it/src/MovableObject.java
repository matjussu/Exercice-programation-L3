public interface MovableObject {
    boolean canAccelerate();
    void accelerate();
    double getTimeToMove(double distance);
    void brake();
}
