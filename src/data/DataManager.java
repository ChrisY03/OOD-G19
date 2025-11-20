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

            if (row.length < 7 || row[0].startsWith("studentId")) continue; 
                
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
            if (row.length < 4 || row[0].startsWith("roomCode")) continue;

            try {
                String id = row[0].trim();
                String building = row[1].trim();
                String type = row[2].trim();
                int capacity = Integer.parseInt(row[3].trim());
                boolean lab = Boolean.parseBoolean(row[2].trim());
                rooms.add(new Room(id, capacity, lab));
            } catch (Exception e) {
                System.err.println("Error in rooms.csv: " + Arrays.toString(row));
            }
            }
            return rooms;
        }

        public static List<Module> loadModules(String filePath) {
            List<Module> modules = new ArrayList<>();
            List<String[]> data = CSVReader.readCSV(filePath);

            for (String[] row : data) {
                if (row.length < 8 || row[0].startsWith("moduleCode")) continue;

                try {
                    String code = row[0].trim();
                    String title = row[1].trim();
                    int year = Integer.parseInt(row[2].trim());
                    int semester = Integer.parseInt(row[3].trim());
                    String programmeId = row[4].trim();
                    int lec = Integer.parseInt(row[5].trim());
                    int lab = Integer.parseInt(row[6].trim());
                    int tut = Integer.parseInt(row[7].trim());

                    modules.add(new Module(title, code, lec, lab, tut));
                } catch (Exception e) {
                    System.err.println("Error in modules.csv: " + Arrays.toString(row));
                }
                }
                return modules;
            
        }

        public static List<Programme> loadProgrammes(String filePath) {
            List<Programme> programmes = new ArrayList<>();
            List<String[]> data = CSVReader.readCSV(filePath);

            for (String[] row : data) {
                if (row.length < 2 || row[0].startsWith("programmeId")) continue;


                try {
                    String id = row[0].trim();
                    String name = row[1].trim();
                    programmes.add(new Programme(id.hashCode(), name));
                } catch (Exception e) {
                    System.err.println("Error in programmes.csv: " + Arrays.toString(row));
                }
                }
                return programmes;
            
        }

        public static List<String[]> loadGroups(String filePath) {
            List<String[]> groups = new ArrayList<>();
            List<String[]> data = CSVReader.readCSV(filePath);

            for (String[] row : data) {
                if (row.length < 4 || row[0].startsWith("groupId")) continue;
                groups.add(row);
            }
            return groups;
        }

        public static List<ScheduledSession> loadSessions(String filePath) {
            List<ScheduledSession> sessions = new ArrayList<>();
            List<String[]> data = CSVReader.readCSV(filePath);

            for (String[] row : data) {
                if (row.length < 10 || row[0].startsWith("sessionId")) continue;

                try {
                    Module module = new Module(row[1].trim(), "", 0, 0, 0);
                    Lecturer lecturer = new Lecturer(row[7].trim(), "", "", "", "CSIS");
                    Room room = new Room(row[6].trim(), 0, false);
                    Timeslot timeslot = new Timeslot(row[3].trim(), Integer.parseInt(row[5].trim()), 1);
                    sessions.add(new ScheduledSession(module, lecturer, room, timeslot));
                } catch (Exception e) {
                    System.err.println("Error in scheduledsessions.csv: " + Arrays.toString(row));
                }
            }
            return sessions;
        }
    }


