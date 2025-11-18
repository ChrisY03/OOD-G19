package data;
import src.Student;

import java.util.*;

/**
 * The DataManager class is responsible for loading data from CSV files
 * and converting it into objects used by the system.
 */
public class DataManager {

    /**
     * Loads student data from a CSV file and converts each row into a
     * Student object.
     *
     * Expected CSV fromat: ID, Name, Email, Password, ProgrammeID, Year, Group
     *
     * @param filePath the path to the CSV file
     * @return a list of Student objects
     */
    public static List<Student> loadStudents(String filePath) {
        List<Student> students = new ArrayList<>();
        List<String[]> data = CSVReader.readCSV(filePath);

        for (String[] row : data) {

            if (row.length < 7) {
                System.err.println("Skipping invalid row in students CSV.");
                continue;
            }

            try {
                String id = row[0];
                String name = row[1];
                String email = row[2];
                String password = row[3];
                String programme = row[4];
                int year = Integer.parseInt(row[5]);
                

                students.add(new Student(id, name, email, password, programme, year));

            } catch (Exception e) {
                System.err.println("Error reading student row - skipping entry.");
            }
        }
        return students;
    }

}
