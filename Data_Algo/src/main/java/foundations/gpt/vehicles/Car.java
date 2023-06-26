package foundations.gpt.vehicles;

public class Car extends Vehicle {

    String vehicleType;
    int noOfWheels;

    int noOfDoors;


    public void sayVehicleType() {
        System.out.println("I am a car");
    }

    public void sayNoOfWheels() {
        System.out.println("I have 4 wheels");
    }

    public void sayNoOfDoors() {
        System.out.println("I have 4 doors");
    }


}
