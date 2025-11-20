package controllers;

import Model.Timetable.ScheduledSession;
import Model.People.Student;
import Model.Room.Room;
import Model.Academic.Programme;
import data.DataManager;

import java.util.List;
import java.util.ArrayList;



public class TimetableService {
    private List<ScheduledSessions> allSessions;
    private List<Student> students;
    private List<Room> rooms;
    private List<Programme> programmes;
    private DataManager dataManager;

    public TimetableService() {
        allSessions = new ArrayList<>();
        students = new ArrayList<>();
        rooms = new ArrayList<>();
        programmes = new ArrayList<>();
        dataManager = new DataManager();
    }

    //Querying timetables
    public void getAllSessions extends DataManager(){

    }

    public void getSessionId(sessionId){

    }
    
    public void getStudentTimetable(studentId){

    }

    public void getLecturerTimetable(lecturerId){

    }

    public void getRoomTimetable(roomCode){

    }

    public void getProgrammeTimetable(programmeCode, semester){

    }

    public void getModuleSessions(moduleCode){

    }

    //Methods to write/change timetables
    public void addSession(ScheduledSession newSession){

    }

    public void updateSession(ScheduledSession updatedSession){

    }

    public void deleteSession(int sessionId){

    }
    
    public void saveTimetable(){

    }

    //Useful for Scheduler
    public void getSessionsForTimeandRoom(day, start, end, roomCode){ }

    public void getSessionsLecturer(day, start, end, lecturerId){ }

    public void getSessionsForAudience(day, start, end, audienceId){ }

    
}
