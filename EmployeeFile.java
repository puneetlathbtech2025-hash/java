import java.io.*;

public class EmployeeFile {

    public static void main(String[] args) {

        String fileName = "employee.txt";

        // Write employee details to file
        try {
            FileWriter writer = new FileWriter(fileName);

            writer.write("Employee ID: 101\n");
            writer.write("Name: Puneet\n");
            writer.write("Department: Computer Science\n");
            writer.write("Salary: 50000\n");

            writer.close();

            System.out.println("Employee details written to file.");
        }
        catch (IOException e) {
            System.out.println("Error writing to file.");
        }

        // Read employee details from file
        try {
            FileReader reader = new FileReader(fileName);
            BufferedReader br = new BufferedReader(reader);

            String line;

            System.out.println("\nEmployee Details:");

            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

            br.close();
        }
        catch (IOException e) {
            System.out.println("Error reading from file.");
        }
    }
}