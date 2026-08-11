class FoodDelivery {

    String orderId = "ORD101";
    String food = "Pizza";
    String address = "Pune";

    // Inner Class
    class OrderDetails {

        void displayOrder() {
            System.out.println("Order Details");
            System.out.println("Order ID: " + orderId);
            System.out.println("Food: " + food);
            System.out.println("Address: " + address);
        }
    }

    public static void main(String[] args) {

        FoodDelivery order = new FoodDelivery();

        // Inner class object
        OrderDetails details = order.new OrderDetails();
        details.displayOrder();

        // Anonymous class
        Runnable deliveryStatus = new Runnable() {
            public void run() {
                System.out.println("Delivery Status: Out for Delivery");
            }
        };

        deliveryStatus.run();
    }
}