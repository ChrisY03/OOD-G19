package People;

import java.util.ArrayList;
import java.util.List;
/**
 * Represents a lecturer in the university.
 */
public class Lecturer extends User {
    private final String department;
    private List<String> modules;

    /**
     * Creates a Lecturer object.
     *
     * @param name the lecturer's name
     */
    public Lecturer(String id, String name, String email, String password, String department) {
        super(id, name, email, password, "Lecturer");
    }
    public String getDepartment() {
        return department;
    }
    public List<String> getModules() {
        return modules;
    }

    /**
     * Prints the lecturer's timetable details.
     */
    @Override
    public void viewTimetable() {
        System.out.println("Timetable for Lecturer: " + name);
    }
}