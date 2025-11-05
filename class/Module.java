import java.util.ArrayList;

public class Module {
    
    private String moduleName;
    private String moduleCode;
    private int moduleLecHours;
    private int moduleLabHours;
    //array here for students

    public Module(){

    }

    //Constructor
    public Module(String moduleName, String moduleCode, int moduleLecHours, int moduleLabours){
        this.moduleName = moduleName;
        this.moduleCode = moduleCode;
        this.moduleLecHours = moduleLecHours;
        this.moduleLabHours = moduleLabours;
    }

    //Setters
    public void setModuleName(String moduleName){
        this.moduleName = moduleName;
    }

    public void setModuleCode(String moduleCode){
        this.moduleCode = moduleCode;
    }

    public void setModuleLecHour(int moduleLecHours){
        this.moduleLecHours = moduleLecHours;
    }

    public void setModuleLabHour(int moduleLabHours){
        this.moduleLabHours = moduleLabHours;
    }

    //Setters
    public String getModuleName() {
        return moduleName;
    }

    public String getModuleCode() {
        return moduleCode;
    }

    public int getModuleLabHours() {
        return moduleLabHours;
    }

    public int getModuleLecHours() {
        return moduleLecHours;
    }


}
