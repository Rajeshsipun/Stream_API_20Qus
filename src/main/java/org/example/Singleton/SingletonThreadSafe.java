package org.example.Singleton;

// First generally create a Public class for the thread-safe Singleton pattern
public class SingletonThreadSafe {

    // Private static instance variable
    private static SingletonThreadSafe instance;

    // Then after im create Private constructor to prevent instantiation
    private SingletonThreadSafe() {}

    // Synchronized method ensures thread safety
    // Only one thread can execute this block at a time
    public static synchronized SingletonThreadSafe getInstance() {
        // Check if the instance is null
        if (instance == null) {
            // Create the instance if it's null
            instance = new SingletonThreadSafe();
        }
        // Return the instance
        return instance;
    }

    // Method to demonstrate the Singleton instance
    public void showMessage() {
        System.out.println("Thread-Safe Singleton Instance: Hello!");
    }

    // Main method to test the SingletonThreadSafe class
    public static void main(String[] args) {
        // Get the Singleton instance
        SingletonThreadSafe instance = SingletonThreadSafe.getInstance();

        // Call the showMessage method to demonstrate the instance
        instance.showMessage();
    }
}
