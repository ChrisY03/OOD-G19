package Model.People;

/**
 * Represents an administrative user who can manage users and timetables and
 * includes key details such as admin ID, name, email, and password.
 */
public class Admin extends User {

    /**
     * Creates an Admin user with full details.
     *
     * @param id admin's UL ID
     * @param name admin's full name
     * @param email admin's UL email
     * @param password admin's account password
     */
    public Admin(String id, String name, String email, String password) {
        super(id, name, email, password, "Admin");
    }

    /**
     * Adds a user to the system.
     *
     * @param newUser the user being added
     */
    public void addUser(User newUser) {
        System.out.println("Added user: " + newUser.getName());

    }

    /**
     * Removes a user from the system.
     *
     * @param user the user being removed
     */
    public void removeUser(User user) {
        System.out.println("Removed user: " + user.getName());
    }

    /**
     * Displays that the admin can view or modify any timetable.
     */
    @Override
    public void viewTimetable() {
        System.out.println("Admin " + name + " can view or modify any timetable.");

    }
}




