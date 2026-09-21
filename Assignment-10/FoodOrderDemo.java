abstract class FoodOrder {

    abstract void calculateBill();
}

class DineInOrder extends FoodOrder {

    double amount = 500;
    double serviceCharge = 50;

    void calculateBill() {
        double total = amount + serviceCharge;

        System.out.println("Dine-In Order");
        System.out.println("Food Amount: ₹" + amount);
        System.out.println("Service Charge: ₹" + serviceCharge);
        System.out.println("Total Bill: ₹" + total);
    }
}

class TakeAwayOrder extends FoodOrder {

    double amount = 400;
    double packingCharge = 30;

    void calculateBill() {
        double total = amount + packingCharge;

        System.out.println("Take-Away Order");
        System.out.println("Food Amount: ₹" + amount);
        System.out.println("Packing Charge: ₹" + packingCharge);
        System.out.println("Total Bill: ₹" + total);
    }
}

public class FoodOrderDemo {

    public static void main(String[] args) {

        FoodOrder order1 = new DineInOrder();
        FoodOrder order2 = new TakeAwayOrder();

        order1.calculateBill();
        System.out.println();

        order2.calculateBill();
    }
}
