package org.example.Logical_questions;

public class Duplicate_Array {

        public static void main(String[] args) {

            // Initialize an array with some duplicate elements
            int[] array = {1, 2, 3, 4, 2, 3, 5, 6};

            // Print header message for duplicate elements
            System.out.println("Duplicate Elements:");

            // Outer loop to pick each element in the array
            for (int i = 0; i < array.length; i++) {
                // Inner loop to compare the current element with the rest
                for (int j = i + 1; j < array.length; j++) {

                    // Check if the current element matches any other element
                    if (array[i] == array[j]) {
                        // If a duplicate is found, print the element
                        System.out.print(array[i] + " ");

                        // Break the inner loop to avoid redundant checks
                        break;
                    }
                }
            }
        }
    }

