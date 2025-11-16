package People;

/**
 * Demonstrates a user (lecturer, student, admin)
 * works as an abstract superclass for each user type
 * identifies the key attributes of a user in UL and what
 * is shared among a lecturer, admin and student
 */

public abstract class User {
    protected String id;
    protected String name;
    protected String email;
    protected String password;
    protected String userType;

    /**
     * A constructor (User) with unique attributes of a user in UL
     * @param id   users specific UL id
     * @param name  users name
     * @param email  users UL email
     * @param password users password in which they selected
     * @param userType (Lecturer, student, admin)
     */
    public User(String id, String name, String email, String password,
                String userType) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.userType = userType;
    }

    /**
     * Creates a simplified User object.
     * This constructor is used when only the user's name and role are needed,
     * without ID, email or password details.
     * @param name the user's name
     * @param userType the role of the user
     */
    public User(String name, String userType) {
        this.name = name;
        this.userType = userType;
    }

    /**
     *
     * @return users specific UL id
     */
    public String getid() {
        return id;
    }

    /**
     *
     * @return users UL email
     */
    public String getEmail() {
        return email;
    }

    /**
     *
     * @return users name
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @return users type (lecturer, student, admin)
     */
    public String getUserType() {
        return userType;
    }
    // password doesn't get a getter because of security and encapsulation
    // no other class or user should be able to read it directly once its stored

    /**
     * represents a login system where the user is prompted to
     * enter id and password and compares the input to a stored
     * users info (id, password)
     * @param identered users id entered
     * @param passwordEntered users password entered
     * @return true if login details match, false if no match
     */
    public boolean idLogin(String identered, String passwordEntered) {
        return this.id.equals(identered) && password.equals(passwordEntered); //Checks if inputted password matches user password;
    }

    /**
     * Each user type must define how they view a timetable.
     */
    public abstract void viewTimetable();







}
