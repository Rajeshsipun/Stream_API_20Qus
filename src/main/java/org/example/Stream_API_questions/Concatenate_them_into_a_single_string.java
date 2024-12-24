package org.example.Stream_API_questions;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Question: Given a list of strings, concatenate them into a single string.

public class Concatenate_them_into_a_single_string {
    public static void main(String[] args) {

        // - I'm get created Create a list of strings
        //because Understanding the Input (List of Strings)
        //A list of strings can be created....
        List<String> stringList = Arrays.asList("Rajesh", "Kumar", "Behera");

        // Concatenate all strings into a single string
        String result = stringList.stream()   //- I'm Using .stream() : The stream() method converts the list into a stream.
                                                                      // A stream is like a sequence of elements (in this case, strings)
                                                                   // Then i  can process one by one.
                .collect(Collectors.joining());   //- Then after i'm Using .collect(Collectors.joining())
                                                                      //- The collect() method is used to transform the
                                                                   // elements of the stream into a final result.
                                                                //- Collectors.joining() is a special method that takes all the elements
                                                             // in the stream and concatenates them into a single string.
                                                          //- By default, it does not add anything between the strings,
                                                       // so "Rajesh", "Kumar", and "Behera" will be joined into "RajeshKumarBehera".

        // Print the result
        System.out.println(result);  // Output: RajeshKumarBehera
    }
}

//How It Works:
//- List Conversion to Stream: The stream() method creates a pipeline for processing the list of strings.

//- Collection with Joining: The Collectors.joining() method collects all the elements
// of the stream and combines them into a single string.

//- Output: The strings "Rajesh", "Kumar", and "Behera" are concatenated into "RajeshKumarBehera".


//Key Features of This Approach:
//- Java 8 Streams: Provides a functional way to process collections.
//- Collectors.joining(): Simplifies concatenation without using loops.
//- Clean and Concise: Makes the code easy to write and read.


//Arrays.asList():  method in Java is used to quickly create a fixed-size list from an array of elements.
//It allows you to create a List directly in one line of code, instead of manually adding elements to a list.

