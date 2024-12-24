package org.example.Stream_API_questions;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//5.Given a list of strings, convert them all to uppercase.
public class Convert_them_all_to_uppercase {

    public static void main(String[] args) {

        // Step 1:
        //First  I'm get creates a list of strings: ["rajesh", "sonali", "raja", "lovely"].
        //Then The method Arrays.asList() it is  converts the given arguments ("rajesh", "sonali", "raja", "lovely")
        // into a fixed-size list.
        List<String> stringList = Arrays.asList("rajesh", "sonali", "raja", "lovely");


        // Step 2: Convert each string to uppercase
        List<String> uppercaseStrings = stringList.stream() //stringList.stream(): This creates a stream from the stringList.
                                                                                                     //  A stream is a sequence of elements that can
                                                                                                  //  be processed step by step
                //- if stringList is ["rajesh", "sonali", "raja", "lovely"], the stream represents these elements:

                .map(String :: toUpperCase)  // .map(String::toUpperCase)
             // The map() method is used to apply a transformation to each element in the stream.
           //     Here, String::toUpperCase is a method reference that converts each string to uppercase
        //["rajesh", "sonali", "raja", "lovely"] it is transformations UpperCase [RAJESH, SONALI, RAJA, LOVELY]

                .collect(Collectors.toList());           //.collect(Collectors.toList())
        //The collect(): method gathers the elements of the stream into a collection.
        //Collectors.toList() specifies that the elements should be collected into a List.

        System.out.println(uppercaseStrings);
        //This prints the resulting list of uppercase strings to the console.
    }
}



//What Makes This Code Efficient?
//Streams API: The Streams API provides a functional, declarative approach to process collections.
//No need for manual loops or conditional checks.

//Method Reference (String::toUpperCase):
//It is  concise syntax avoids writing a separate function to convert strings to uppercase.

//Immutability:
//this is  original list (stringList) remains unchanged.
// A new list (uppercaseStrings) is created with the transformed values.
