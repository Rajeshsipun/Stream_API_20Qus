package org.example.Logical_questions;

public class Sorted_Array {

    public static void main(String[] args) {
        // Initialize an array to check if it is sorted
        int[] array = {1, 2, 3, 4, 5};

        // Variable to track whether the array is sorted
        boolean isSorted = true;

        // Loop through the array to check the order of elements
        for (int i = 0; i < array.length - 1; i++) {
            // If any element is greater than the next one, the array is not sorted
            if (array[i] > array[i + 1]) {
                isSorted = false; // Mark as not sorted
                break;           // Exit the loop  as further checks are unnecessary
            }
        }

        // Print the result based on the isSorted flag
        if (isSorted) {
            System.out.println("The array is sorted.");
        } else {
            System.out.println("The array is NOT sorted.");
        }
    }
}


//Array Initialization:
//The array int[] array = {1, 2, 3, 4, 5}; is the input we are checking for sorting.

//Flag for Sorted Check:
//boolean isSorted = true; starts by assuming the array is sorted.

//Loop Through the Array:
//The for loop iterates through the array elements up to the second last index (array.length - 1), as we compare each element to the next one.

//Check Order:
//if (array[i] > array[i + 1]): If an element is greater than the next element, it means the array is not sorted.

//Mark and Exit Early:
//If an unsorted pair is found, isSorted is set to false, and the break statement exits the loop early to save processing time.

//Result Output:
//After the loop, the program checks isSorted:
//Prints "The array is sorted." if isSorted is still true.
//Prints "The array is NOT sorted." if isSorted is false.
