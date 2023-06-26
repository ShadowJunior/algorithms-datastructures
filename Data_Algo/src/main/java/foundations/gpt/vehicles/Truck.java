package foundations.gpt.vehicles;

public class Truck extends Vehicle {
    String vehicleType;
    int noOfWheels;

    int noOfDoors;


    public void sayVehicleType() {
        System.out.println("I am a truck");
    }

    public void sayNoOfWheels() {
        System.out.println("I have 16 wheels");
    }

    public void sayNoOfDoors() {
        System.out.println("I have 2 doors");
    }
}
