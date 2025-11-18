package Model.Timetable;

import Model.Academic.Module;
import Model.People.Lecturer;
import Model.Room.Room;
/**
 * Represents a single scheduled class in the timetable.
 * Stores details such as the module, lecturer, room, day, and time.
 */
public class ScheduledSession {

    /** The code of the module. */
    private Module module;

    /** The name of the lecturer. */
    private Lecturer lecturer;

    /** The ID of the room where the class takes place. */
    private Room room;

    /** The day of the week and time the class is scheduled for. */
    private Timeslot timeslot;

    /**
     * Creates an empty ScheduledSession object.
     * Allows the entry to be created before all details are known.
     */
    public ScheduledSession(){
    }

    /**
     * Creates a ScheduledSession object.
     *
     * @param module the module being taught
     * @param lecturer the lecturer teaching the class
     * @param room the room where the class is held
     * @param day the day the class takes place
     * @param time the time the class begins
     */
    public ScheduledSession(Module module, Lecturer lecturer, Room room, Timeslot timeslot) {
        this.module = module;
        this.lecturer = lecturer;
        this.room = room;
        this.timeslot = timeslot;
    }

    /**
     * @return the module code for this class
     */
    public Module getModule() {
        return module;
    }

    /**
     * @return the name of the lecturer
     */
    public Lecturer getLecturer() {
        return lecturer;
    }

    /**
     * @return the room
     */
    public Room getRoom() {
        return room;
    }

    /**
     * @return the time of the class
     */
    public Timeslot getTimeslot() {
        return timeslot;
    }

    /**
     * Returns a readable formatted version of the timetable entry.
     *
     * @return a string containing module, lecturer, room, day and time
     */
    @Override
    public String toString() {
        return module.getModuleCode() +
                " | " + lecturer.getName() +
                " | " + room.getRoomId() +
                " | " + timeslot.toString();
    }
    public boolean sameTimeWith(ScheduledSession other) {
        return (this.room.equals(other.room) || this.lecturer.equals(other.lecturer))
                && this.timeslot.overlaps(other.getTimeslot());
}
}