package T1;

public abstract class Vehicle {
    private double maxSpeed;
    protected double currentSpeed;

    public Vehicle(double maxSpeed){
        this.maxSpeed = maxSpeed;
        this.currentSpeed = 0;
    }

    public double getCurrentSpeed(){
        return currentSpeed;
    }

    public double getMaxSpeed(){
        return maxSpeed;
    }

    public void pedalToTheMetal() {
        while(currentSpeed < maxSpeed){
            accelerate();
        }
    }

    public abstract void accelerate();
}
