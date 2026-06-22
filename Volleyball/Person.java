package Volleyball;

public class Person {

    // constructor
    Person(
        String firstName,
        String lastName,
        String fatherName,
        String phoneNumber,
        String address,
        String nationalID
    ) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.fatherName = fatherName;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.nationalID = nationalID;
    }

    // default constructor
    Person() {}

    // data members
    private String firstName;
    private String lastName;
    private String fatherName;
    private String phoneNumber;
    private String address;
    private String nationalID;

    // setters
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName; 
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setNationalID(String nationalID) {
        this.nationalID = nationalID;
    }

    // getters
    public String getFirstName() {
        return this.firstName;
    }

        public String getLastName() {
        return this.lastName;
    }

        public String getFatherName() {
        return this.fatherName;
    }

        public String getPhoneNumber() {
        return this.phoneNumber;
    }

        public String getAddress() {
        return this.address;
    }

        public String getNationalID() {
        return this.nationalID;
    }
}
