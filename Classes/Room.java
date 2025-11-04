public class Room {
    private String roomId;
    private int capacity;
    private boolean lab;

    public Room(String roomId, int capacity, boolean lab) {
        this.roomId = roomId;
        this.capacity = capacity;
        this.lab = lab;
    }
    public String getRoomId() {
        return roomId;
    }
    public void setRoomId(String roomId) {
        this.roomId = roomId;
    }
    
    public int getCapacity() {
        return capacity;
    }
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public boolean getLab() {
        return lab;
    }
    public void setLab() {
        this.lab = lab;
    }
    public String toString() {
        return roomId + capacity + lab;
    }

}
