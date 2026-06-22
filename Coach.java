package Volleyball;

public class Coach extends Person {
    
    private int coachID;

    // subclass + superclass constructors
    Coach(
        int coachID,
        String firstName,
        String lastName,
        String fatherName,
        String phoneNumber,
        String address,
        String nationalID
    )

    {
        super(firstName, lastName, fatherName, phoneNumber, address, nationalID);
        this.coachID = coachID;
    }

    Coach() {}

    // setter
    public void setCoachID(int coachID) {
        this.coachID = coachID;
    }

    // getter
    public int getCoachID() {
        return this.coachID;
    }
}
