import java.util.ArrayList;

public class Module {
    
    private String moduleName;
    private int moduleCredit;
    private String moduleCode;
    private int moduleLecHours;
    private int moduleLabHours;

    public Module(){

    }

    public Module(String moduleName, String moduleCode, int moduleLecHours, int moduleLabours){
        this.moduleName = moduleName;
        this.moduleCode = moduleCode;
        this.moduleLecHours = moduleLecHours;
        this.moduleLabHours = moduleLabours;
    }

    public String setModuleName(String moduleName){
        return moduleName;
    }

    public String setModuleCode(String moduleCode){
        return moduleCode;
    }

    public String setModuleLecHour(int moduleLecHours){
        return moduleName;
    }


}
