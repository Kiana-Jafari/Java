package Volleyball;
import java.util.Scanner;

public class Team {

    // data members
    public int maxPlayers = 20; // maximum players

    private Player[] players = new Player[maxPlayers]; // array of players
    private int nPlayer = 0; // number of players (for keeping track of the players array)
    private Coach c = new Coach();
    private String teamName;
    private String firstColor;
    private String secondColor;
    private Person owner = new Person();

    // default constructor
    public Team() {}

    // setters
    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public void setCoach(Coach c) {
        this.c = c;
    }

    public void setFirstColor(String firstColor) {
        this.firstColor = firstColor;
    }

    public void setSecondColor(String secondColor) {
        this.secondColor = secondColor;
    }

    public void setOwner(Person owner) {
        this.owner = owner;
    }

    // getters
    public String getTeamName() {
        return this.teamName;
    }

    public Coach getCoach() {
        return this.c;
    }

    public String getFirstColor() {
        return this.firstColor;
    }

    public String getSecondColor() {
        return this.secondColor;
    }

    public Person getOwner() {
        return this.owner;
    }

    public boolean isPlayerPresent(Player p) {
        
        for (int i = 0; i < nPlayer; i++)
        {
            if (players[i].getPlayerID() == p.getPlayerID()) // check if player is present in the team
            return true;
        }

        return false;
    }

    public void insertPlayer(Player p) {

        if (nPlayer == maxPlayers)
        {
            System.out.println("Reached maximum number of players");
            return ;
        }

        if (isPlayerPresent(p))
        {
            System.out.println("Player is already present in the team");
            return ;
        }

        else
        {
            players[nPlayer] = p;
            nPlayer ++; // increment nPlayer by one
        }
    }

    public void deletePlayer(Player p) {
        
        if (isPlayerPresent(p))
        remove(p);
    }

    public void show() {

        System.out.println("\n Coach info:\n");
        System.out.println('\n' + c.getFirstName());
        System.out.println('\n' + c.getLastName());
        System.out.println('\n' + c.getFatherName());
        System.out.println('\n' + c.getNationalID());
        System.out.println('\n' + c.getCoachID());
        System.out.println('\n' + c.getPhoneNumber());
        System.out.println('\n' + c.getAddress());

        System.out.println("\n Team Name:\n");
        System.out.println(this.getTeamName());

        System.out.println("First color & second color");
        System.out.println(this.getFirstColor());
        System.out.println(this.getSecondColor());

        System.out.println("\nOwner info:\n");
        System.out.println('\n' + owner.getFirstName());
        System.out.println('\n' + owner.getLastName());
        System.out.println('\n' + owner.getFatherName());
        System.out.println('\n' + owner.getNationalID());
        System.out.println('\n' + owner.getPhoneNumber());
        System.out.println('\n' + owner.getAddress());

        System.out.println(
            "\n\nNumber of current players: " 
            + nPlayer + "\nCurrent players:\n");

        for (int i = 0; i < nPlayer; i++)
        {
            System.out.println("Player: " + (i + 1) + "info: \n");

            System.out.println('\n' + players[i].getFirstName());
            System.out.println('\n' + players[i].getLastName());
            System.out.println('\n' + players[i].getFatherName());
            System.out.println('\n' + players[i].getPhoneNumber());
            System.out.println('\n' + players[i].getAddress());
            System.out.println('\n' + players[i].getNationalID());
        }
    }

    public void getInput() {

        String userInput;
        int id;
        Scanner input = new Scanner(System.in);

        // coach
        System.out.println("Enter coach info");

        System.out.println("coachID");
        id = input.nextInt();
        c.setCoachID(id);

        System.out.println("first name");
        userInput = input.nextLine();
        c.setFirstName(userInput);

        System.out.println("last name");
        userInput = input.nextLine();
        c.setLastName(userInput);

        System.out.println("father name");
        userInput = input.nextLine();
        c.setFatherName(userInput);

        System.out.println("phone number");
        userInput = input.nextLine();
        c.setPhoneNumber(userInput);

        System.out.println("address");
        userInput = input.nextLine();
        c.setAddress(userInput);

        System.out.println("nationalID");
        userInput = input.nextLine();
        c.setNationalID(userInput);

        // shirts' colors
        System.out.println("first shirt's color");
        userInput = input.nextLine();
        this.setFirstColor(userInput);

        System.out.println("second shirt's color");
        userInput = input.nextLine();
        this.setSecondColor(userInput);

        // gym owner
        System.out.println("Enter the gym owner's info:");

        System.out.println("nationalID");
        userInput = input.nextLine();
        owner.setNationalID(userInput);

        System.out.println("first name");
        userInput = input.nextLine();
        owner.setFirstName(userInput);

        System.out.println("last name");
        userInput = input.nextLine();
        owner.setLastName(userInput);

        System.out.println("father name");
        userInput = input.nextLine();
        owner.setFatherName(userInput);

        System.out.println("phone number");
        userInput = input.nextLine();
        owner.setPhoneNumber(userInput);

        System.out.println("address");
        userInput = input.nextLine();
        owner.setAddress(userInput);

        System.out.println("Current number of players in the team: " + (nPlayer + 1));
        System.out.println("How many players do you want to add to the team? (should be between " + nPlayer + ") and " + maxPlayers);

        int n = input.nextInt();

        for (int i = 0; i < n; i++)
        {
            Player p = new Player();

            System.out.println("Enter the player info:\n");

            System.out.println("first name: ");
            userInput = input.nextLine();
            p.setFirstName(userInput);

            System.out.println("last name: ");
            userInput = input.nextLine();
            p.setLastName(userInput);

            System.out.println("father name: ");
            userInput = input.nextLine();
            p.setFatherName(userInput);

            System.out.println("phone number: ");
            userInput = input.nextLine();
            p.setPhoneNumber(userInput);

            System.out.println("address: ");
            userInput = input.nextLine();
            p.setAddress(userInput);

            System.out.println("nationalID: ");
            userInput = input.nextLine();
            p.setNationalID(userInput);

            this.insertPlayer(p);
        }

        input.close(); // close the scanner object to avoid data leakage
    }

    void add(Team T) {

        // add players of team T to the team
        for (int i = 0; i < T.nPlayer; i++)
        {
            if (!this.isPlayerPresent(T.players[i]))
            this.insertPlayer(T.players[i]);
        }
    }

    // utility
    private void remove(Player p) {

        for (int i = 0; i < nPlayer; i++)
        {
            if (players[i].getPlayerID() == p.getPlayerID())
            {
                nPlayer --;

                for (int j = i; j < nPlayer; j++)
                {
                    players[j] = players[j + 1];
                }

                break;
            }
        }
    }
}
