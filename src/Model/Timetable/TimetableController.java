package Model.Timetable;

import Model.Timetable.ScheduledSession;
import Model.Timetable.Timeslot;
import Model.People.Lecturer;
import Model.Room.Room;
import Model.Academic.Module;
import data.DataManager;
import java.util.ArrayList;
import java.util.List;


public class TimetableController {
    private List<ScheduledSession> sessions;
    private DataManager dataManager;

    public TimetableController() {
        sessions = new ArrayList<>();
        dataManager = new DataManager();
    }

    public boolean addSession(ScheduledSession newSession) {
        for (ScheduledSession session : sessions) {
            if (session.sameTimeWith(newSession)) {
                System.out.println("Unable to add session : Interferes with " + session);
                return false;
            }
        }
        sessions.add(newSession);
        System.out.println("Session added: " + newSession);
        return true;
    }
    public void viewAllSessions() {
        System.out.println("\nAll Scheduled Sessions:");
        for (ScheduledSession session : sessions) {
            System.out.println(session);
        }
    }

    public void viewLecturerTimetable(Lecturer lecturer) {
        System.out.println("\nTimetable for Lecturer: " + lecturer.getName());
        for (ScheduledSession session : sessions) {
            if (session.getLecturer().equals(lecturer)) {
                System.out.println(session);
            }
        }
    }


}
