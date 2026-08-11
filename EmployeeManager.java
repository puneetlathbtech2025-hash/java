class Employee {
    String name = "Puneet";
    int salary = 50000;

    void display() {
        System.out.println("Employee Name: " + name);
        System.out.println("Salary: ₹" + salary);
    }
}

class Manager extends Employee {
    int bonus = 10000;

    void displayManager() {
        System.out.println("Manager Details");
        System.out.println("Employee Name: " + super.name);
        System.out.println("Salary: ₹" + super.salary);
        System.out.println("Bonus: ₹" + bonus);
    }
}

public class EmployeeManager {
    public static void main(String[] args) {

        Manager m = new Manager();

        m.displayManager();
    }
}