package org.example.Stream_API_questions;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class duplicate_elements {

    public static void main(String[] args) {
        // Initialize the list with integers, including duplicates
        List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 1, 2, 3, 5, 8, 7, 5, 9);

        // Use a Set to track already-seen elements
        Set<Integer> seen = new HashSet<>();

        // Use Stream API to filter and collect duplicate elements
        List<Integer> duplicates = integerList.stream()
                .filter(num -> !seen.add(num)) // Add each number to the set; if already exists, it's a duplicate
                .distinct() // Ensure duplicates are not repeated in the output
                .collect(Collectors.toList()); // Collect the filtered duplicates into a list

        // Print the duplicate elements
        System.out.println("Duplicate elements: " + duplicates);

    }
}



//List<Integer> integerList
//Creates a list of integers with duplicates.

//Set<Integer> seen = new HashSet<>();
//Initializes a HashSet to keep track of numbers we've already seen.

//integerList.stream()
//Converts the list into a stream for processing.

//filter(num -> !seen.add(num))
//Adds each number to the seen set.
//If add returns false, the number is already in the set (i.e., it's a duplicate).

//distinct()
//Ensures that each duplicate number appears only once in the output.

//collect(Collectors.toList())
//Collects the filtered duplicate numbers into a new list.

//System.out.println("Duplicate elements: " + duplicates);
//Prints the final list of duplicates.
