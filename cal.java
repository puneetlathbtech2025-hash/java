class Main {

    void add(int a, int b) {
        System.out.println("Integer Sum = " + (a + b));
    }

    static void add(double a, double b) {
        System.out.println("Decimal Sum = " + (a + b));
    }

    public static void main(String[] args) {

        Main obj = new Main();

        obj.add(10, 20);      
        Main.add(5.5, 4.5);   
        
    }