package Volleyball;

public class Player extends Person {
    
    private int playerID;

    // subclass + superclass constructors
    Player(
        int playerID,
        String firstName,
        String lastName,
        String fatherName,
        String phoneNumber,
        String address,
        String nationalID) 
    
    {
        super(firstName, lastName, fatherName, phoneNumber, address, nationalID);
        this.playerID = playerID;
    }

    // default constructor
    Player() {}

    // setter
    public void setPlayerID(int playerID) {
        this.playerID = playerID;
    }

    // getter
    public int getPlayerID() {
        return this.playerID;
    }
}
