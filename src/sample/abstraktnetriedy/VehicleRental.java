package sample.abstraktnetriedy;

public abstract class VehicleRental {

    public String SPZ;
    public int maxSpeed;

    abstract void printInfo();
    abstract void addSpeed();

    public String getSPZ() {
        return SPZ;
    }

    public void setSPZ(String SPZ) {
        this.SPZ = SPZ;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }



}
