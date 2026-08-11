class Vehicle {

    String brand = "Toyota";
    String model = "Fortuner";
    int speed = 120;

    // Inner Class
    class VehicleDetails {

        void displayDetails() {
            System.out.println("Vehicle Details");
            System.out.println("Brand: " + brand);
            System.out.println("Model: " + model);
            System.out.println("Speed: " + speed + " km/h");
        }
    }

    public static void main(String[] args) {

        Vehicle v = new Vehicle();

        // Inner class object
        VehicleDetails details = v.new VehicleDetails();
        details.displayDetails();

        // Anonymous class
        Runnable action = new Runnable() {
            public void run() {
                System.out.println("Vehicle is running.");
            }
        };

        action.run();
    }
}