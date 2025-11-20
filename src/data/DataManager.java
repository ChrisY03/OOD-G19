package data;

import Model.People.Student;
import Model.People.Lecturer;
import Model.Academic.Module;
import Room.Room;
import Model.Timetable.ScheduledSession;
import Model.Timetable.Timeslot;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * The DataManager class is responsible for loading data from CSV files
 * and converting it into the objects used by the system.
 */
public final class DataManager {

    private DataManager() {

        /**
         * Loads student data from a CSV file and converts each row into a Student.
         *
         * Expected CSV format:
         * ID, Name, Email, Password, ProgrammeID, Year
         */
        public static List<Student> loadStudents(String filePath) {
            List<Student> students = new ArrayList<>();
            List<String[]> data = CSvReader.readCSV(filePath);

            for (String[] row : data) {
                if (row.length < 6) {
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

                    Students.add(new Student(id, name, email, password, programme, year));
                } catch (Exception e) {
                    System.err.println("Error reading student row - skipping entry.");
                }
            }
            return students;
        }
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
            if (row.length < 3) {
                System.err.println("Skipping invalid row in rooms CSV.");
                continue;
            }

            try {
                String roomId = row[0];
                int capacity = Integer.parseInt(row[1]);
                boolean isLab = Boolean.parseBoolean(row[2]);

                rooms.add(new Room(roomId, capacity, isLab));
            } catch (Exception e) {
                System.err.println("Error reading room row - skipping entry.");
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
            if (row.length < 5) {
                System.err.println("Skipping invalid row in modules CSV.");
                continue;
            }

            try {
                String name = row[0];
                String code = row[1];
                int lecHours = Integer.parseInt(row[2]);
                int labHours = Integer.parseInt(row [3]);
                int tutHours = Integer.parseInt(row [4]);

                modules.add(new Module(name, code, lecHours, labHours, tutHours));
            } catch (Exception e) {
                System.err,println("Error reading module row - skipping entry.");
            }
        }
        return modules;
    }

    /**
     * Loads scheduled sessions from CSV.
     *
     * Expected CSV format:
     * ModuleCode, LecturerId, RoomId, Day, StartHour, Duration
     */
    public static List<ScheduledSession> loadSessions(
            String filePath,
            Map<String, Module> moduleByCode,
            Map<String, Lecturer> lecturerById,
            Map<String, Room> roomById) {

        List<ScheduledSession> sessions = new ArrayList<>();
        List<String[]> data = CSVReader.readCSV(filePath);


        for (String[] row : data) {
            if (row.length < 6) {
                System.err.println("Skipping invalid row in sessions CSV.");
                continue;
            }

            try {
                String moduleCode = row[0];
                String lecturerId = row[1];
                String roomId = row[2];
                String day = row[3];
                int startHours = Integer.parseInt(row[4]);
                int duration = Integer.parseInt(row[5]);

                Module module = moduleByCode.get(moduleCode);
                Lecturer lecturer = lecturerById.get(lecturerId);
                Room room = roomById.get(roomId);

                if (module == null || lecturer == null || room == null) {
                    System.err.println("Skipping session row - unknown module/lecturer/room.");
                    continue;
                }

                Timeslot timeslot = new Timeslot(day, startHour, duration);
                sessions.add(new ScheduledSession(module, lecturer, room, timeslot));

            } catch (Exception e) {
                System.err.println("Error reading session row - skipping entry.");
            }
        }

        return sessions;
    }

    /**
     * Saves schedules sessions to CSV in the same format used by loadSessions.
     */
    public static void saveSessions(String filePath, List<ScheduledSession> sessions) {
        List<String[]> data = new ArrayList<>();

        for (ScheduledSession session : sessions) {
            String[] row = new String[] {
                    session.getModule().getModuleCode(),
                    session.getLecturer().getId(),
                    session.getRoom().getRoomId(),
                    session.getTimeslot().getDay(),
                    String.valueOf(session.getTimeslot().getStartHours()),
            String.valueOf(session.getTimeslot().getDuration())
            };
            data.add(row);
        }

        CSVWriter.writeCSV(filePath, data);

    }
    )
}