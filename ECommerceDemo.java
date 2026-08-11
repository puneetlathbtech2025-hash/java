interface Product {
    void displayProduct();
}

class ElectronicProduct implements Product {
    String name = "Laptop";
    double price = 60000;

    public void displayProduct() {
        System.out.println("Electronic Product");
        System.out.println("Name: " + name);
        System.out.println("Price: ₹" + price);
    }
}

class ClothingProduct implements Product {
    String name = "T-Shirt";
    double price = 999;

    public void displayProduct() {
        System.out.println("Clothing Product");
        System.out.println("Name: " + name);
        System.out.println("Price: ₹" + price);
    }
}

class GroceryProduct implements Product {
    String name = "Rice";
    double price = 800;

    public void displayProduct() {
        System.out.println("Grocery Product");
        System.out.println("Name: " + name);
        System.out.println("Price: ₹" + price);
    }
}

public class ECommerceDemo {
    public static void main(String[] args) {

        ElectronicProduct e = new ElectronicProduct();
        ClothingProduct c = new ClothingProduct();
        GroceryProduct g = new GroceryProduct();

        e.displayProduct();
        System.out.println();

        c.displayProduct();
        System.out.println();

        g.displayProduct();
    }
}