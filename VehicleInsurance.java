class Vehicle {
    String brand = "Toyota";
    String model = "Fortuner";

    void displayVehicle() {
        System.out.println("Vehicle Brand: " + brand);
        System.out.println("Vehicle Model: " + model);
    }
}

class VehicleInsurance extends Vehicle {
    String insuranceType = "Comprehensive";

    void displayInsurance() {
        System.out.println("Vehicle Insurance Details");
        System.out.println("Brand: " + super.brand);
        System.out.println("Model: " + super.model);
        System.out.println("Insurance Type: " + insuranceType);
    }
}

public class VehicleInsurance {
    public static void main(String[] args) {

        VehicleInsurance v = new VehicleInsurance();

        v.displayInsurance();
    }
}