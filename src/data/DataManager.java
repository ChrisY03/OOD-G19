package data;

import Model.People.Student;
import Model.People.Lecturer;
import Model.Academic.Module;
import Model.Room.Room;
import Model.Timetable.ScheduledSession;
import Model.Timetable.Timeslot;
import Model.Academic.Programme;
import java.util.*;


/**
 * The DataManager class is responsible for loading data from CSV files
 * and converting it into the objects used by the system.
 */
public final class DataManager {


        /**
         * Loads student data from a CSV file and converts each row into a Student.
         *
         * Expected CSV format:
         * ID, Name, Email, Password, ProgrammeID, Year
         */
        public static List<Student> loadStudents(String filePath) {
            List<Student> students = new ArrayList<>();
            List<String[]> data = CSVReader.readCSV(filePath);

            for (String[] row : data) {
                if (row.length < 7 || row[0].startsWith("studentId")) continue;
                
                
                try {
                    String id = row[0].trim();
                    String name = row[1].trim();;
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
    

    /**
     * Loads lecturer data from a CSV file.
     *
     * Expected CSV format:
     * ID, name, Email, Password, Department
     */
    public static List<Lecturer> loadLecturers(String filePath) {
        List<Lecturer> lecturers = new ArrayList<>();
        List<String[]> data = CSVReader.readCSV(filePath);

        for (String[] row : data) {
            if (row.length < 5) {
                System.err.println("Skipping invalid row in lecturers CSV.");
                continue;
            }

            try {
                String id = row[0];
                String name = row[1];
                String email = row[2];
                String password = row[3];
                String department = row[4];

                lecturers.add(new Lecturer(id, name, email, password, department));
            } catch (Exception e) {
                System.err.println("Error reading lecturer row - skipping entry.");
            }
        }
        return lecturers;
    }

    /**
     * Loads rooms for CSV.
     *
     * Expected CSV format:
     * RoomId, Capacity, IsLab
     */
    public static List<Room> loadRooms(String filePath) {
        List<Room> rooms = new ArrayList();
        List<String[]> data = CSVReader.readCSV(filePath);

         for (String[] row : data) {
            if (row.length < 4 || row[0].startsWith("roomCode")) continue;

            try {
                String id = row[0].trim();
                String building = row[1].trim();
                String type = row[2].trim();
                int capacity = Integer.parseInt(row[3].trim());
                boolean lab = type.equalsIgnoreCase("Laboratory");
                rooms.add(new Room(id, capacity, lab));
            } catch (Exception e) {
                System.err.println("Skipping invalid roomm row: " + Arrays.toString(row));
                System.err.println("Error in rooms.csv: " + Arrays.toString(row));
            }
            }
            return rooms;
        }
    

    /**
     * Loads Modules from CSV.
     *
     * Expected CSV format:
     * ModuleName, ModuleCode, LecHours, LabHours, TutHours
     */
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
            if (row.length < 4|| row[0].startsWith("groupId")) continue;
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
                Timeslot timeslot = new Timeslot(row[3].trim(), Integer.parseInt(row[4].trim()), Integer.parseInt(row[5].trim()));

                sessions.add(new ScheduledSession(module, lecturer, room, timeslot));
            } catch (Exception e) {
                System.err.println("Error in sessions.csv: " + Arrays.toString(row));
            }
        }
        return sessions;
    }
}
    
