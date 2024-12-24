package org.example.Stream_API_questions;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

//2. Given a list of integers, find the maximum number.

public class find_the_maximum_number {

    public static void main(String[] args) {

        // Create a list of integers
        List<Integer> numbers = Arrays.asList(5, 8, 12, 3, 7, 17, 2);

        Optional<Integer>maxNumber = numbers.stream()   // Step 1: Convert the list into a stream
                .max(Integer :: compareTo);             // Step 2: Find the maximum value

        // Print the result
        maxNumber.ifPresent(max -> System.out.println("Maximum number is: " + max));


    }
}

//1. List<Integer>:
//- We create a list of integers containing numbers like 5, 8, 12, 3, 7, 15, 17, 2
//- This is our input data.

//2. numbers.stream():
//- I get Converts the list into a Stream, which allows us to perform operations like finding the maximum value.

//3. max(Integer::compareTo):
//- max() is a terminal operation that finds the maximum element in the stream.
//- Integer::compareTo is a method reference that compares two integers to determine which one is larger.

//4. Optional<Integer>:
//- The result of max() is an Optional because the list might be empty. If it's empty, no maximum value exists.
//- ifPresent() checks if a value is present and executes the code to print the maximum number.

//5. System.out.println():
//- If a maximum number is found, it's printed to the console.

//If the list of integers is  [5, 8, 12, 3, 7, 15, 2].
//Maximum number is: 15
