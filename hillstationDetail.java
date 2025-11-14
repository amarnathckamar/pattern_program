package demo;

// Base class (Parent class)
class HillStations {
    // Method to show location of hill station
    void location() {
        System.out.println("Location is:");
    }

    // Method to show what the hill station is famous for
    void famousFor() {
        System.out.println("Famous for:");
    }
}

// Subclass 1: Manali
class Manali extends HillStations {
    // Overriding parent method for location
    void location() {
        System.out.println("Manali is in Himachal Pradesh");
    }
    // Overriding parent method for famousFor
    void famousFor() {
        System.out.println("It is Famous for Hadimba Temple and adventure sports");
    }
}

// Subclass 2: Mussoorie
class Mussoorie extends HillStations {
    void location() {
        System.out.println("Mussoorie is in Uttarakhand");
    }

    void famousFor() {
        System.out.println("It is Famous for education institutions");
    }
}

// Subclass 3: Gulmarg
class Gulmarg extends HillStations {
    void location() {
        System.out.println("Gulmarg is in J&K");
    }

    void famousFor() {
        System.out.println("It is Famous for skiing");
    }
}

// Main class to run the program
public class hillstationDetail {
    public static void main(String[] args) {
        // Using parent class reference variable
        HillStations h;

        // Object of parent class
        h = new HillStations();
        h.location();    // Calls parent method
        h.famousFor();

        // Object of subclass Manali
        h = new Manali();
        h.location();    // Calls overridden method in Manali
        h.famousFor();

        // Object of subclass Mussoorie
        h = new Mussoorie();
        h.location();    // Calls overridden method in Mussoorie
        h.famousFor();

        // Object of subclass Gulmarg
        h = new Gulmarg();
        h.location();    // Calls overridden method in Gulmarg
        h.famousFor();
    }
}
