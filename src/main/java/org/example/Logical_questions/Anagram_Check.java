package org.example.Logical_questions;

import java.util.Arrays;

public class Anagram_Check {
    // Method to check if two strings are anagrams
    public static boolean areAnagrams(String str1, String str2) {
        // Step 1: Check if lengths of both strings are equal
        if (str1.length() != str2.length()) {
            return false; // If lengths differ, they cannot be anagrams
        }

        // Step 2: Convert the strings into character arrays
        char[] charArray1 = str1.toCharArray(); // Convert first string to character array
        char[] charArray2 = str2.toCharArray(); // Convert second string to character array

        // Step 3: Sort both character arrays alphabetically
        Arrays.sort(charArray1); // Sort first character array
        Arrays.sort(charArray2); // Sort second character array

        // Step 4:In this step we are comparing the sorted character arrays for equality
        return Arrays.equals(charArray1, charArray2); // Return true if arrays are equal, false otherwise
    }
    public static void main(String[] args) {
        // Input strings to check if they are anagrams
        String str1 = "listen";
        String str2 = "silent";

        // Check if the strings are anagrams and print the result
        if (areAnagrams(str1, str2)) {
            System.out.println("The Strings are Anagrams");
        } else {
            System.out.println("The Strings are NOT Anagrams");
        }
    }
}
