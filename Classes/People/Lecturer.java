import java.util.ArrayList;
import java.util.List;

public class Lecturer extends User {
  private final String department;
  private List<String> modules;

  public Lecturer(String id, String name, String email, String password,
                 String department) {
    super(id, name, email, password, "Lecturer");
    this.department = department;
    this.modules = new ArrayList<>();
    }

    public String getDepartment() {
        return department;
    }
    public List<String> getModules() {
        return modules;
    }

    @Override
    public void viewTimetable() {
        System.out.println(name + "'s timetable");
        System.out.println("Department: " + department);
        System.out.println("Modules: " + modules);
    }
}

