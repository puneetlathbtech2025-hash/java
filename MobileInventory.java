class Mobile {
    String brand;
    String model;
    int price;

    // Default Constructor
    Mobile() {
        brand = "Samsung";
        model = "Unknown";
        price = 0;
    }

    // Parameterized Constructor
    Mobile(String b, String m, int p) {
        brand = b;
        model = m;
        price = p;
    }

    // Copy Constructor
    Mobile(Mobile obj) {
        brand = obj.brand;
        model = obj.model;
        price = obj.price;
    }

    void display() {
        System.out.println("Brand : " + brand);
        System.out.println("Model : " + model);
        System.out.println("Price : ₹" + price);
        System.out.println();
    }
}

public class MobileInventory {
    public static void main(String[] args) {

        Mobile m1 = new Mobile(); // Default

        Mobile m2 = new Mobile("Apple", "iPhone 16", 79999); // Parameterized

        Mobile m3 = new Mobile(m2); // Copy

        System.out.println("Default Constructor:");
        m1.display();

        System.out.println("Parameterized Constructor:");
        m2.display();

        System.out.println("Copy Constructor:");
        m3.display();
    }
}