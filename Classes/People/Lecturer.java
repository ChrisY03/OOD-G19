package People;

/**
 * Represents a lecturer in the university.
 */
public class Lecturer extends User {

    /**
     * Creates a Lecturer object.
     *
     * @param name the lecturer's name
     */
    public Lecturer(String name) {
        super(name, "Lecturer");
    }

    /**
     * Prints the lecturer's timetable details.
     */
    @Override
    public void viewTimetable() {
        System.out.println("Timetable for Lecturer: " + name);
    }
}