public class Student extends User {
  private String programmeID;
  private int year;

  public Student(String id, String name, String email, String password,
       String programmeID, int year) {
        super(id, name, email, password, "Student");
        this.programmeID = programmeID;
        this.year = year;
       }
    
    public String getProgrammeID() {
        return programmeID;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
    
    @Override
    public void viewTimeTable() {
        System.out.println("Timetable for " + name + " (" + programmeID + " Year: " + year + ")");
    }


}
