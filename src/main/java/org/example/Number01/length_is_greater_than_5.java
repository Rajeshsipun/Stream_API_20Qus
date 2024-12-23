package org.example.Number01;
import java.util.Arrays;
import java.util.List;
//Given a list of strings, find the count of strings whose length is greater than 5.

public class length_is_greater_than_5 {
    public static void main(String[] args) {

        //Use Java 8 Stream API to count strings with length greater than 5
        List<String> ls = Arrays.asList ("Raju","Sona","Lovely","Raja","sagar","Monaranjan");

        long count = ls.stream()  // Step 1: Convert the list into a stream
                .filter(str -> str.length() > 5)     //Step 2: Filter strings with length > 5
                .count();                 // Step 3: Count the filtered strings

        // Print the result
        System.out.println("the count of strings whose length is greater than 5: " + count);
    }
}

//List<String>:
//We create a list of strings containing words like "apple", "banana", and "cherry".
//This is our input data.


//strings.stream():
//- The stream() method converts the list into a Stream object.
//-A stream allows you to perform functional-style operations like filtering,
// mapping, and counting on the elements of the list.


//filter(str -> str.length() > 5):
//- filter() is an intermediate operation that processes each element of the stream.
//- The condition str.length() > 5 checks if the length of each string is greater than 5.

//For example:
//"sagar" has a length of 5 → Excluded.
//"Lovely" has a length of 6 → Included.
//"Monaranjan" has a length of 10 → Included.
//- After filtering, the stream contains only the strings "Lovely", and "Monaranjan".

//count():
//- count() is a terminal operation that counts the number of elements
// remaining in the stream after filtering.
//- In this case, the count will be 2 because "Lovely", and "Monaranjan" are
// the only strings with a length greater than 5.

//System.out.println(...):
//The result is printed to the console