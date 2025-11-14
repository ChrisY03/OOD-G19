import java.util.ArrayList;

/**
 * Represents a module. Each module has a name, code, and 
 * the number of lecture, lab and tutorial hours required weekly.
 */
public class Module {

    /** The module's name. */
    private String moduleName;

    /** Unique code which identifies the module. */
    private String moduleCode;

    /** Number of lecture hours each week. */
    private int moduleLecHours;

    /** Number of lab hours each week. */
    private int moduleLabHours;

    /** Number of tutorial hours each week. */
    private int tutHours;
    
    /**
     * Creates an empty Module object.
     * Allows a Module object to be created without providing initial values,
     * which prevents errors in situations where the system needs to create the
     * object before its data is available.
     */
    public Module() {
    }

    /**
     * Creates a Module object with all required details.
     *
     * @param moduleName     name of the module
     * @param moduleCode     module's unique code
     * @param moduleLecHours number of lecture hours weekly
     * @param moduleLabours  number of lab hours weekly
     * @param tutHours       number of tutorial hours weekly
     */
    public Module(String moduleName, String moduleCode, int moduleLecHours, int moduleLabours, int tutHours) {
        this.moduleName = moduleName;
        this.moduleCode = moduleCode;
        this.moduleLecHours = moduleLecHours;
        this.moduleLabHours = moduleLabours;
        this.tutHours = tutHours;
    }

    /**
     * Sets the module's name.
     *
     * @param moduleName the new name for the module
     */
    public void setModuleName(String moduleName) {
        this.moduleName = moduleName;
    }

    /**
     * Sets the module's code.
     *
     * @param moduleCode the new code for the module
     */
    public void setModuleCode(String moduleCode) {
        this.moduleCode = moduleCode;
    }

    /**
     * Sets the number of weekly lecture hours.
     *
     * @param moduleLecHours the number of lecture hours
     */
    public void setModuleLecHour(int moduleLecHours) {
        this.moduleLecHours = moduleLecHours;
    }

    /**
     * Sets the number of weekly lab hours.
     *
     * @param moduleLabHours the number of lab hours
     */
    public void setModuleLabHour(int moduleLabHours) {
        this.moduleLabHours = moduleLabHours;
    }

    /**
     * Returns the module's name.
     *
     * @return the module name
     */
    public String getModuleName() {
        return moduleName;
    }

    /**
     * Returns the module's unique code.
     *
     * @return the module code
     */
    public String getModuleCode() {
        return moduleCode;
    }

    /**
     * Returns the weekly lab hours.
     *
     * @return lab hours per week
     */
    public int getModuleLabHours() {
        return moduleLabHours;
    }

    /**
     * Returns the weekly lecture hours.
     *
     * @return lecture hours per week
     */
    public int getModuleLecHours() {
        return moduleLecHours;
    }
}
