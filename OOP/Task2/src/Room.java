public class Room {

    private int numberOfDoors;
    private int numberOfLamps;
    private int numberOfWindows;


    private Room(int numberOfDoors, int numberOfLamps, int numberOfWindows) {
        this.numberOfDoors = numberOfDoors;
        this.numberOfLamps = numberOfLamps;
        this.numberOfWindows = numberOfWindows;
    }

    private int getNumberOfDoors() {
        return this.numberOfDoors;
    }

    private int getNumberOfLamps() {
        return this.numberOfLamps;
    }
    private int getNumberOfWindows() {
        return this.numberOfWindows;
    }


}
