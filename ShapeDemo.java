class Shape {
    void display() {
        System.out.println("This is a shape.");
    }
}

class Circle extends Shape {
    double radius = 5;

    void area() {
        double area = Math.PI * radius * radius;
        System.out.println("Circle Area: " + area);
    }
}

class Rectangle extends Shape {
    double length = 10;
    double breadth = 5;

    void area() {
        double area = length * breadth;
        System.out.println("Rectangle Area: " + area);
    }
}

public class ShapeDemo {
    public static void main(String[] args) {

        Circle c = new Circle();
        c.display();
        c.area();

        Rectangle r = new Rectangle();
        r.display();
        r.area();
    }
}