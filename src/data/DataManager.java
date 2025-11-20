package data;
import Model.People.Student;

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
                String id = row[0].trim();
                String name = row[1].trim();
                String email = row[2].trim();
                String password = row[3].trim();
                String programme = row[4].trim();
                int year = Integer.parseInt(row[5].trim());
                String group = row[6].trim();

                students.add(new Student(id, name, email, password, programme, year));

            } catch (Exception e) {
                System.err.println("Error reading student row - skipping entry." + Arrays.toString(row));
            }
        }
        return students;
    }

}
