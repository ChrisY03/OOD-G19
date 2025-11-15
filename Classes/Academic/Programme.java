import java.util.ArrayList;
import java.util.List;

public class Programme {

    /** The programme's unique code. */
    private int code;

    /** The name of the programme. */
    private String name;

    /**
     * The list of semesters in the programme.
     * Each semester has several modules.
     */
    private List<ProgrammeSemester> semesters = new ArrayList<>();

    /**
     * Creates an empty Programme object.
     * Allows the programme to be created before its data is available.
     */
    public Programme() {
    }

        /**
         * Creates a programme with a code and name.
         * 
         * @param code the programme code
         * @param name the programme name
         */
    public Programme(int code, String name){
            this.code = code;
            this.name = name;
    }

    /**
     * Returns the programme's code.
     * 
     * @return programme code
     */
    public int getCode() {
        return code;
    }

    /**
     * Returns the programme's name.
     * 
     * @return programme name
     */
    public String getName() {
        return name;
    }

    /**
     * Returns the list of semesters in the programme.
     * 
     * @return list of ProgrammeSemester objects
     */
    public List<ProgrammeSemester> getSemesters() {
        return semesters;
    }

    /**
     * Adds a semester to the programme.
     * 
     * @param semester the semester to add
     */
    public void addSemester(ProgrammeSemester semester) {
        semesters.add(semester);
    }
}
