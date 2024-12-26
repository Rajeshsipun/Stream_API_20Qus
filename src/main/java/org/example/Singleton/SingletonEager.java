package org.example.Singleton;

// Step 1: First i'm generally Create a public class for the Singleton pattern
public class SingletonEager {

    // Step 2: I have Created a private static instance, eagerly initialized
    // This instance is created when the class is loaded
    private static final SingletonEager INSTANCE = new SingletonEager();

    // Step 3:Then i'm create a Private constructor to prevent instantiation from other classes
    // This ensures that only one instance is created
    private SingletonEager() {}

    // Step 4: Public method to provide the Singleton instance
    // This method returns the eagerly initialized instance
    public static SingletonEager getInstance() {
        return INSTANCE;
    }

    // Additional method to demonstrate the Singleton instance
    public void showMessage() {
        System.out.println("Eager Singleton Instance: Hello!");
    }

    // Main method to test the SingletonEager class
    public static void main(String[] args) {
        // Get the Singleton instance
        SingletonEager instance = SingletonEager.getInstance();

        // Call the showMessage method to demonstrate the instance
        instance.showMessage();
    }
}

//private static final SingletonEager INSTANCE = new SingletonEager();
//- This "INSTANCE" variable is declared as "static" , which means it belongs to the class and not to any specific object.
// This ensures that only one instance of the class is created for the entire application.

//-


