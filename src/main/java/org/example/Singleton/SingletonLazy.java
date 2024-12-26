package org.example.Singleton;

//First i'm generally Create a Public class for the Singleton pattern
public class SingletonLazy {

    // Step 1: I have created a Declare a private static instance but do not initialize it
    // This instance will be created lazily when requested
    private static SingletonLazy instance;

    // Step 2: Then i'm created a Private constructor to prevent instantiation
    // This ensures that only one instance is created
    private SingletonLazy() {}

    // Step 3: Public method to create and return the instance lazily
    public static SingletonLazy getInstance() {
        //Then after i have created  if condition for  Check if the instance is null
        if (instance == null) {
            // Create the instance if it's null
            instance = new SingletonLazy();
        }
        // Return the instance
        return instance;
    }

    // Additional method to demonstrate the Singleton instance
    public void showMessage() {
        System.out.println("Lazy Singleton Instance: Hello!");              // Printing statement...
    }

    // Main method to test the SingletonLazy class
    public static void main(String[] args) {
        // Then I Get the Singleton instance
        SingletonLazy instance = SingletonLazy.getInstance();

        // Call the showMessage method to demonstrate the instance
        instance.showMessage();
    }
}
