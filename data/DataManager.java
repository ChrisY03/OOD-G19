package data;

import model.Student;
import java.util.*;

public class DataManager {
    public static List<Student> loadStudents(String filePath) {
        List<Student> students = new ArrayList<>();
        List<String[] data = CSVReader.readCSV(filePath);

        for (String[] row : data) {
            String id = row[0];
            String name = row[1];
            String email = row[2];
            String password = row[3];
            String programme = row[4];
            int year = Integer.parseInt(row[5]);
            String group = row[6];

            students.add(new Student(id, name, email, password, programme, year, group));

        }
        return students;
    }

}
