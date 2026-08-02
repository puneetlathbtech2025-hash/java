class Restaurant {

    // Static variable to count total orders
    static int totalOrders = 0;

    // Dine-in Order
    void bill(int amount) {
        totalOrders++;
        System.out.println("Dine-in Bill: ₹" + amount);
    }

    // Takeaway Order
    void bill(int amount, String takeaway) {
        totalOrders++;
        System.out.println("Takeaway Bill: ₹" + amount);
        System.out.println("Packing: " + takeaway);
    }

    // Delivery Order
    void bill(int amount, String address, double deliveryCharge) {
        totalOrders++;
        System.out.println("Delivery Bill: ₹" + amount);
        System.out.println("Address: " + address);
        System.out.println("Delivery Charge: ₹" + deliveryCharge);
        System.out.println("Total Amount: ₹" + (amount + deliveryCharge));
    }

    // Static method
    static void showTotalOrders() {
        System.out.println("\nTotal Orders: " + totalOrders);
    }
}

public class RestaurantBilling {

    public static void main(String[] args) {

        Restaurant r = new Restaurant();

        System.out.println("Dine-in Order");
        r.bill(500);

        System.out.println();

        System.out.println("Takeaway Order");
        r.bill(350, "Yes");

        System.out.println();

        System.out.println("Delivery Order");
        r.bill(700, "Pune", 50.0);

        Restaurant.showTotalOrders();
    }
}