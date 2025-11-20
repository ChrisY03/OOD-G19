package controllers;

import Model.Timetable.ScheduledSession;
import Model.People.Student;
import Model.Room.Room;
import Model.Academic.Programme;
import Model.People.Lecturer;
import data.DataManager;

import java.util.List;
import java.util.ArrayList;



public class TimetableService {
    private List<ScheduledSession> allSessions;
    private List<Student> students;
    private List<Room> rooms;
    private List<Programme> programmes;


    public TimetableService() {
        allSessions = new ArrayList<>();
        students = new ArrayList<>();
        rooms = new ArrayList<>();
        programmes = new ArrayList<>();

    }



    //Querying timetables
    public List<ScheduledSession> getAllTimeTable(){
        return new ArrayList<>(allSessions);
    } 
    
    public List<ScheduledSession> getStudentTimetable(Student id){
        List<ScheduledSession> result = new ArrayList<>();
        for (ScheduledSession session : allSessions) {
            if (session.getStudent().equals(id)) {
                result.add(session);
            }
        }
        return result; 
    }

    public List<ScheduledSession> getLecturerTimetable(Lecturer id){
        List<ScheduledSession> result = new ArrayList<>();
        for (ScheduledSession session : allSessions) {
            if (session.getLecturer().equals(id)) {
                result.add(session);
            }
        }
        return result;        
    }

    public List<ScheduledSession> getRoomTimetable(Room room){
        List<ScheduledSession> result = new ArrayList<>();
        for (ScheduledSession session : allSessions) {
            if (session.getRoom().equals(room)) {
                result.add(session);
            }
        }
        return result; 
    }

    public List<ScheduledSession> getProgrammeTimetable(programmeCode, semester){

    }

    public List<ScheduledSession> getModuleTimetable(Module module){
        List<ScheduledSession> result = new ArrayList<>();
        for (ScheduledSession session : allSessions) {
            if (session.getModule().equals(module)) {
                result.add(session);
            }
        }
        return result; 
    }

    //Methods to write/change timetables
    public boolean addSession(ScheduledSession newSession) {
        for (ScheduledSession session : allSessions) {
            if (session.sameTimeWith(newSession)) {
                // clash – caller decides what to print
                return false;
            }
        }
        allSessions.add(newSession);
        return true;
    }

    public boolean updateSession(ScheduledSession updatedSession){

    }

    public boolean deleteSession(int sessionId){

    }
    
    public boolean saveTimetable(){

    }

    //Useful for Scheduler
    public List<ScheduledSession> getSessionsForTimeandRoom(Timmeday, start, end, roomCode){ }

    public List<ScheduledSession> getSessionsLecturer(day, start, end, lecturerId){ }

    public List<ScheduledSession> getSessionsForAudience(day, start, end, audienceId){ }

    
}
