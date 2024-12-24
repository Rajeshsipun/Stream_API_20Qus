package org.example.Stream_API_questions;

//Given a list of integers, find the average of all numbers.

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class Find_the_average_of_all_numbers {

    public static void main(String[] args) {

        // Step 1: I get Create a list of integers
        // integerList is a List of integers , This list contains the integers 10, 20, 30, 40, and 50.
        List<Integer>  integerList = Arrays.asList (10, 20, 30, 40, 50);

        //- Step 2: Then after I'm Calculate the average
        //- So That i'm  Using .stream()
        //The stream() method converts the list into a stream.
        //stream is a pipeline that allows processing of the elements in the list.
        //For example, the list [10, 20, 30, 40, 50]

// What is OptionalDouble?
//It is a container that may or may not contain a double value.
//If the list is empty, the result is OptionalDouble.empty().
        OptionalDouble average = integerList.stream()

        // Then after i'm  Using .mapToInt(Integer::intValue)
        //The mapToInt() method converts each element in the stream to its primitive int value.
        //Integer::intValue is a method reference that converts a boxed Integer to its primitive int.
       //example: The list [10, 20, 30, 40, 50] is converted to the primitive integers: 10, 20, 30, 40, 50.
                .mapToInt(Integer :: intValue)

//Using .average()
//The average() method is a terminal operation in streams.
// It calculates the average of all the elements in the stream and returns an OptionalDouble.
                .average();


//// Step 3: Print the result
//- Then after i'm using if( average.isPresent()){}else {} method
//Okey fist i'm explain  - average.isPresent() method It is  checks whether the OptionalDouble contains a value.
//Returns true if the average was successfully calculated (i.e., the list was not empty).
//Returns false if the list was empty, and therefore no average could be calculated.
        if (average.isPresent()){
            System.out.println("Average: "+ average.getAsDouble());   //Retrieves the value using getAsDouble(),
            // which returns the double value stored inside the OptionalDouble. Prints the calculated average to the console.

        }
        else {
            System.out.println("List of empty , no average.");
        }
    }
}

//For the list [10, 20, 30, 40, 50], the output is: Average: 30.0


//How It Works
//Streams: The list is processed as a stream of numbers.
//Convert to Primitive Ints:
//mapToInt(Integer::intValue) ensures we are working with primitive int values,
// which are required for mathematical operations like average().

//Compute the Average: The average() method computes the sum of all numbers and divides
// it by the count of elements.

//Handle OptionalDouble:
//If the list is not empty, the average is returned.
//If the list is empty, it returns an empty OptionalDouble.

