import java.util.ArrayList;

public class StudentCourseRegistration {

    public static void main(String[] args) {

        ArrayList<String> courses = new ArrayList<>();

        // Add courses
        courses.add("Java Programming");
        courses.add("Data Structures");
        courses.add("Database Systems");

        // Remove one course
        courses.remove("Database Systems");

        StringBuffer sb = new StringBuffer();

        sb.append("Registered Courses\n");

        for (String course : courses) {
            sb.append("- ").append(course).append("\n");
        }

        System.out.println(sb);
    }
}
