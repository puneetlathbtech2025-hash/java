import java.util.*;

class Student {
    void displayStudent() {
        System.out.println("Student Details");
        System.out.println("Name: Puneet");
        System.out.println("Roll No: 101");
        System.out.println("Course: Computer Science");
    }
}

class Faculty {
    void displayFaculty() {
        System.out.println("Faculty Details");
        System.out.println("Name: Dr. Sharma");
        System.out.println("Department: Computer Science");
    }
}

public class CollegeManagement {
    public static void main(String[] args) {

        Student s = new Student();
        Faculty f = new Faculty();

        s.displayStudent();
        System.out.println();
        f.displayFaculty();
    }
}