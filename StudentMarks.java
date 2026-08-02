class StudentMarks {

    public static void main(String[] args) {

        // Marks in String format
        String mark1 = "85";
        String mark2 = "90";
        String mark3 = "78";

        // Convert String to Integer using Wrapper Class
        Integer m1 = Integer.parseInt(mark1);
        Integer m2 = Integer.parseInt(mark2);
        Integer m3 = Integer.parseInt(mark3);

        int total = m1 + m2 + m3;

        System.out.println("Student Marks");
        System.out.println("Mark 1: " + m1);
        System.out.println("Mark 2: " + m2);
        System.out.println("Mark 3: " + m3);
        System.out.println("Total Marks: " + total);
    }
}