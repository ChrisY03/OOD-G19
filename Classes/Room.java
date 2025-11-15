/**
 * Represents a teaching room in the university.
 * Each room has a room ID, seating capacity and indicates whether the room is a lab or a classroom.
 */
public class Room {

    /** The room ID for the room. */
    private String roomId;

    /** The maximum number of people the room can hold. */
    private int capacity;

    /** Indicates whether the room is a lab (true) or classroom (false). */
    private boolean lab;

    /**
     * Creates a Room object with the given details.
     *
     * @param roomId the unique ID of the room
     * @param capacity the seating capacity of the room
     * @param lab true if the room is a lab and false if it's a classroom
     */
    public Room(String roomId, int capacity, boolean lab) {
        this.roomId = roomId;
        this.capacity = capacity;
        this.lab = lab;
    }

    /**
     * Returns the room ID.
     *
     * @return the room's ID
     */
    public String getRoomId() {
        return roomId;
    }

    /**
     * Sets the room ID.
     *
     * @param roomId the new room ID
     */
    public void setRoomId(String roomId) {
        this.roomId = roomId;
    }

    /**
     * Returns the capacity of the room.
     *
     * @return the number of people the room can hold
     */
    public int getCapacity() {
        return capacity;
    }

    /**
     * Sets the room's capacity.
     *
     * @param capacity the new room capacity
     */
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    /**
     * Returns whether the room is a lab.
     *
     * @return true if the room is a lab and false if it's a classroom
     */
    public boolean getLab() {
        return lab;
    }

    /**
     * Sets whether the room is a lab or a classroom.
     *
     * @param lab true if the room is a lab and false if it's a classroom
     */
    public void setLab(boolean lab) {
        this.lab = lab;
    }

    /**
     * Returns a string representation of the room.
     *
     * @return a string containing the room ID, capacity, and lab status
     */
    @Override
    public String toString() {
        return roomId + " | Capacity: " + capacity + " | Lab: " + lab;
    }

}
