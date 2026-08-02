class Calculator {

    // Static variable
    static int count = 0;

    // Method overloading for integers
    int add(int a, int b) {
        count++;
        return a + b;
    }

    // Method overloading for decimals
    double add(double a, double b) {
        count++;
        return a + b;
    }

    // Static method
    static void showCount() {
        System.out.println("Total Calculations: " + count);
    }
}

public class CalculatorDemo {

    public static void main(String[] args) {

        Calculator c = new Calculator();

        System.out.println("Integer Addition:");
        System.out.println("10 + 20 = " + c.add(10, 20));

        System.out.println();

        System.out.println("Decimal Addition:");
        System.out.println("10.5 + 20.7 = " + c.add(10.5, 20.7));

        System.out.println();

        Calculator.showCount();
    }
}