import java.io.*;

public class PatientFile {

    public static void main(String[] args) {

        String fileName = "patient.txt";

        // Write patient details to file
        try {
            FileWriter writer = new FileWriter(fileName);

            writer.write("Patient ID: 201\n");
            writer.write("Name: Rahul\n");
            writer.write("Age: 25\n");
            writer.write("Diagnosis: Fever\n");

            writer.close();

            System.out.println("Patient details written to file.");
        }
        catch (IOException e) {
            System.out.println("Error writing to file.");
        }

        // Read patient details from file
        try {
            FileReader reader = new FileReader(fileName);
            BufferedReader br = new BufferedReader(reader);

            String line;

            System.out.println("\nPatient Details:");

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
