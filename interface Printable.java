interface Printable {
    void print();
}

class Student implements Printable {

    public void print() {
        System.out.println("Student Details");
        System.out.println("Name: Puneet");
        System.out.println("Roll No: 101");
    }
}

class Employee implements Printable {

    public void print() {
        System.out.println("Employee Details");
        System.out.println("Name: Rahul");
        System.out.println("Employee ID: 201");
    }
}

public class PrintableDemo {

    public static void main(String[] args) {

        Student s = new Student();
        Employee e = new Employee();

        s.print();
        System.out.println();

        e.print();
    }
}