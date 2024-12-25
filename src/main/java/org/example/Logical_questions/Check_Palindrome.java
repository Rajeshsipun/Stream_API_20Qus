package org.example.Logical_questions;

public class Check_Palindrome {

        public static void main(String[] args) {
            // Input string to check if it's a palindrome
            String input = "madam";

            // Variable to store the reversed string
            String reversed = "";

            // Reversing the string using a for loop
            for (int i = input.length() - 1; i >= 0; i--) {
                // Append each character from the end to the beginning
                reversed += input.charAt(i);
            }

            // Check if the original string and reversed string are equal
            boolean palindrome = input.equals(reversed);

            // Print the result based on the comparison
            if (palindrome) {
                System.out.println(input + " is palindrome"); // If true, it's a palindrome
            } else {
                System.out.println(input + " is Not Palindrome"); // If false, it's not a palindrome
            }
        }
    }
