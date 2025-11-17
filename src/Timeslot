/**
 * this class represents a single block of time in the timetable.
 *A Timeslot keeps track of the day of the week, the hour a starts,
 * and how long the class lasts. The scheduler will use Timeslot objects
 * to check if two classes clash with each other.
 *
 * The start time is stored in 24-hours format because it makes it easier
 * to compare times.
 */
public class Timeslot {

    /** Day of the week. */
    private String day;

    /** Start hour in 24-hour format. */
    private int startHour;

    /** Duration in hours. */
    private int duration;

    /**
     * Creates a Timeslot with a day, start time and duration.
     *
     * @param day the day of the week
     * @param startHour the hour the class starts
     * @param duration how long the class lasts, in hours
     */
    public Timeslot(String day, int startHour, int duration) {
        this.day = day;
        this.startHour = startHour;
        this.duration = duration;
    }

    /**
     * Gets the day of the timeslot.
     *
     * @return day the day of the week
     */
    public String getDay() {
        return day;
    }

    /**
     * Gets the starting hour of this timeslot.
     *
     * @return startHour the hour the class starts
     */
    public int getStartHour() {
        return startHour;
    }

    /**
     * Gets how long this timeslot lasts.
     *
     * @return duration in hours
     */
    public int getDuration() {
        return duration;
    }

    @Override
    public String toString() {
        return day + " " + startHour + ":00 for " + duration + "h";
    }

    /**
     * Checks if this timeslot overlaps another one.
     * Two timeslots overlap if:
     * - they are on the same day, and
     * - their time ranges cross over.
     *
     * @param other the other timeslot to compare with
     * @return true if both timeslots overlap, false otherwise
     */
    public boolean overlaps(Timeslot other) {
        if (!this.day.equals(other.day)) {
            return false;
        }

        int thisEnd = this.startHour + this.duration;
        int otherEnd = other.startHour + other.duration;

        return this.startHour < otherEnd && other.startHour < thisEnd;
    }
}

