package org.example.Logical_questions;

public class Longest_SubString {

    public static void main(String[] args) {
        // Input string to find the longest substring without repeating characters
      String str = "abcdabcdef";

        // Variable to store the longest substring found so far
        String longestSubstring = "";

        // Outer loop to pick the starting point of the substring
        for (int i = 0; i < str.length(); i++) {
            // Temporary string to store the current substring being checked
            String temp = "";

            // Inner loop to pick the ending point of the substring
            for (int j = i; j < str.length(); j++) {
                // Get the current character at position j
                char currentChar = str.charAt(j);

                // Check if the character is already in the temporary substring
                if (temp.indexOf(currentChar) != -1) {
                    // If character is repeated, exit the inner loop
                    break;
                }

                // Add the current character to the temporary substring
                temp += currentChar;

                // Update the longest substring if the current one is longer
                if (temp.length() > longestSubstring.length()) {
                    longestSubstring = temp;
                }
            }
        }

        // Print the longest substring without repeating characters
        System.out.println("Longest Substring Without Repeating: " + longestSubstring);
    }
}

//Explanation of the Program:
//Input String:
//The string str is the input where the longest substring without repeating characters will be found.

//Tracking Longest Substring:
//The variable longestSubstring keeps track of the longest substring discovered so far.

//Outer Loop:
//Picks the starting point of a potential substring.

//Inner Loop:
//Expands the substring by picking the next character.

//Check for Repeating Characters:
//temp.indexOf(currentChar) != -1 checks if the character currentChar is already present in the substring temp.

//Updating Temporary Substring:
//If no repetition is found, the character is added to temp.

//Updating Longest Substring:
//If the length of temp exceeds longestSubstring, longestSubstring is updated.

//Breaking the Inner Loop:
//If a duplicate character is found, the inner loop stops, and the outer loop moves to the next starting point.

//Output:
//The longest substring without repeating characters is printed.
