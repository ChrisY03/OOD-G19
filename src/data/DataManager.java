package data;
import Model.People.Student;

import Model.People.Student;
import Model.Room.Room;
import Model.Academic.Module;
import Model.People.Lecturer;
import Model.Timetable.ScheduledSession;
import Model.Timetable.Timeslot;
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

            if (row.length < 7 || row[0].startsWith("studentId")) continue;) {
                
            

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
                System.err.println("Error in students.csv: " + Arrays.toString(row));
            }
        }
        return students;
    }

    public static List<Room> loadRooms(String filePath) {
        List<Room> rooms = new ArrayList<>();
        List<String[]> data = CSVReader.readCSV(filePath);

        for (String[] row : data) {
            if (row.length < 3) continue;

            try {
                String id = row[0].trim();
                int capacity = Integer.parseInt(row[1].trim());
                boolean lab = Boolean.parseBoolean(row[2].trim());
                rooms.add(new Room(id, capacity, lab));
            } catch (Exception e) {
                System.err.println("Skipping invalid roomm row: " + Arrays.toString(row));
            }
            }
            return rooms;
        }
        public static List<ScheduledSession> loadSessions(String filePath) {
            List<ScheduledSession> sessions = new ArrayList<>();
            List<String[]> data = CSVReader.readCSV(filePath);

            for (String[] row : data) {
                if (row.length < 5) continue;

                try {
                    Module module = new Module(row[0].trim(), "", 0, 0, 0);
                    Lecturer lecturer = new Lecturer(row[1].trim(), "", "", "", "Department");
                    Room room = new Room(row[2].trim(), 0, false);
                    Timeslot timeslot = new Timeslot(row[3].trim(), Integer.parseInt(row[4].trim()), 1);
                    sessions.add(new ScheduledSession(module, lecturer, room, timeslot));
                } catch (Exception e) {
                    System.err.println("Skipping invalid session row: " + Arrays.toString(row));
                }
            }
            return sessions;
        }
    }


