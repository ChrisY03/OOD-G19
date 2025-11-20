package Model.Timetable;

import java.util.List;
import Model.People.Lecturer;
import controllers.TimetableService;


public class TimetableController {

    private final TimetableService timetableService;

    public TimetableController(TimetableService timetableService) {
        this.timetableService = timetableService;
    }

    public void addSession(ScheduledSession newSession) {
        boolean added = timetableService.addSession(newSession);
        if (added) {
            System.out.println("Session added: " + newSession);
        } else {
            System.out.println("Unable to add session: clashes with an existing session.");
        }
    }

    public void viewAllSessions() {
        System.out.println("\nAll Scheduled Sessions:");
        List<ScheduledSession> allSessions = timetableService.getAllTimeTable();
        for (ScheduledSession session : allSessions) {
            System.out.println(session);
        }
    }

    public void viewLecturerTimetable(Lecturer id) {
        System.out.println("\nTimetable for Lecturer: " + id.getName());
        List<ScheduledSession> allSessions = timetableService.getLecturerTimetable(id);
        for (ScheduledSession session : allSessions) {
            System.out.println(session);
        }
    }


}
