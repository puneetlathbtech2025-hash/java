public class App {
    void print(int a)
    {
        System.out.println("Integer: " + a);
    }

    void print(String str) 
    {
        System.out.println("String: " + str);
    }

    static void print1(int a) 
    {
        System.out.println("Static Integer: " + a);
    }

    public static void main(String[] args) 
    {
        int a = 0;

        method obj = new method();

        obj.print(a);
        obj.print("hello");
        method.print1(a);
    }
}