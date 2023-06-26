package foundations.gpt.vehicles;

public class Motorcycle extends Vehicle {
    String vehicleType;
    int noOfWheels;

    int noOfDoors;


    public void sayVehicleType() {
        System.out.println("I am a motorcycle");
    }

    public void sayNoOfWheels() {
        System.out.println("I have 2 wheels");
    }

    public void sayNoOfDoors() {
        System.out.println("I have no doors");
    }
}
