
public class Student {
    private int studentID;
    private String studentName;
    private int yearOfStudy;
    private int groupID;
    
    public Student() {

    }

    public Student(int studentID, String studentName, int yearOfStudy, int groupID){
        this.studentID = studentID;
        this.studentName = studentName;
        this.yearOfStudy = yearOfStudy;
        this.groupID = groupID;
    }

    //Getters
    public int getStudentID(){
        return studentID;
    }

    public String getStudentName(){
        return studentName;
    }

    public int getYOS(){
        return yearOfStudy;
    }

    public int getGroupID(){
        return groupID;
    }

    //Setters
    public void setStudentID(int studentID){
        this.studentID = studentID;
    }

    public void setStudentName(String studentName){
        this.studentName = studentName;
    }

    public void setYOS(int yearOfStudy){
        this.yearOfStudy = yearOfStudy;
    }

    public void setGroupID(int groupID){
        this.groupID = groupID;
    }     

}
