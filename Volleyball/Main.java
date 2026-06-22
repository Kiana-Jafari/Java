package Volleyball;

public class Main {

    public static void main(String[] args) {

        Coach coach1 = new Coach(
                101, "John",
                "Doe", "Robert",
                "555-1234", "123 Main St", "ID123");

        Person owner1 = new Person(
                "Alice", "Smith",
                "Paul", "555-5678",
                "456 Oak Ave", "ID456");

        Team team1 = new Team();

        team1.setCoach(coach1);
        team1.setTeamName("Thunderbolts");
        team1.setFirstColor("Blue");
        team1.setSecondColor("White");
        team1.setOwner(owner1);

        Player p1 = new Player(
                1, "Mike",
                "Jordan", "James",
                "555-1111", "10 Sports Rd", "ID101");

        Player p2 = new Player(
                2, "Steve",
                "Curry", "Dell",
                "555-2222", "22 Hoops Ln", "ID102");

        Player p3 = new Player(
                3, "LeBron",
                "James", "Joe",
                "555-3333", "33 Champion Dr", "ID103");

        Player p4 = new Player(
                4, "Kevin",
                "Durant", "Wayne",
                "555-4444", "44 Scorer Blvd", "ID104");

        team1.insertPlayer(p1);
        team1.insertPlayer(p2);
        team1.insertPlayer(p3);
        team1.insertPlayer(p4);

        System.out.println("--- After inserting 4 players ---\n");
        team1.show();

        team1.insertPlayer(p2);
        System.out.println("--- After duplicate insertion of player ID 2 ---\n");
        team1.show();

        System.out.println("--- Presence check ---\n");
        System.out.println("Player ID 1 present? " + (team1.isPlayerPresent(p1) ? "Yes" : "No"));

        Player p99 = new Player(99, "", "", "", "", "", "");
        System.out.println("Player ID 99 present? " + (team1.isPlayerPresent(p99) ? "Yes" : "No"));

        team1.deletePlayer(p2);
        System.out.println("--- After deleting player ID 2 ---\n\n--- Team 1 info ---\\n");
        team1.show();

        Team team2 = new Team();
        team2.setTeamName("AllStars");
        team2.setFirstColor("Red");
        team2.setSecondColor("Black");

        Coach coach2 = new Coach(
                202, "Greg",
                "Popovich", "Mike",
                "555-9999", "5 Courtside", "ID999");

        Person gymOwner = new Person(
                "Mark", "Cuban",
                "Stanley", "555-7777",
                "77 Arena Dr", "ID777");

        team2.setCoach(coach2);
        team2.setOwner(gymOwner);

        Player p5 = new Player(
                5, "James",
                "Harden", "James Sr.",
                "555-5555", "55 Beard St", "ID105");

        team2.insertPlayer(p4);
        team2.insertPlayer(p1);
        team2.insertPlayer(p5);

        System.out.println("\n--- Team 2 before adding from Team 1 ---\n");
        team2.show();

        team2.add(team1);
        System.out.println("\n--- Team B after adding players from Team A ---\n");
        team2.show();
    }
}
