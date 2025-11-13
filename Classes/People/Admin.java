public class Admin extends User {
    public Admin(String id, String name, String email, String password) {
        super(id, name, email, password, "Admin");
    }

    @Override
    public void viewTimetable() {
        System.out.println("Admin " + name " can view or modify any timetable.");

    }
    public void addUser(User newUser) {
        System.out.println("Added user: " + newUser.getName());

    }
    public void removeUser(User user) {
        System.out.println("Removed user: " + user.getName());
    }
    public void modifyTimetable(Timetable timetable) {
        System.out.println("Modifying timetable for: " + timetable.getOwnerName());
    }

    }


