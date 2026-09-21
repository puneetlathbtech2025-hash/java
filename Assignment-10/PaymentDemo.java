abstract class Payment {

    abstract void pay(double amount);
}

class CreditCard extends Payment {

    void pay(double amount) {
        System.out.println("Payment Method: Credit Card");
        System.out.println("Amount Paid: ₹" + amount);
    }
}

class UPI extends Payment {

    void pay(double amount) {
        System.out.println("Payment Method: UPI");
        System.out.println("Amount Paid: ₹" + amount);
    }
}

public class PaymentDemo {

    public static void main(String[] args) {

        Payment p1 = new CreditCard();
        Payment p2 = new UPI();

        p1.pay(5000);
        System.out.println();

        p2.pay(2500);
    }
}
