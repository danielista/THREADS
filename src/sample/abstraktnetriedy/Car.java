package sample.abstraktnetriedy;

public class Car extends VehicleRental {
    @Override
    public void printInfo() {
        setSPZ("KE123KE");
        System.out.println("---------------------------");
        System.out.println("SPZ: " + getSPZ());
        System.out.println("max speed: " + getMaxSpeed());
        System.out.println("---------------------------");
    }

    @Override
    public void addSpeed() {
        setMaxSpeed(200);
    }
}
