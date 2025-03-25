package com.training.java8;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CollectorsExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(100, 15, 74, 20, 25, 3340, 567, 8);

        List<Integer> result = numbers.stream()
            .filter(n -> n % 2 != 0) // filter odd numbers
            .map(n -> n * n)         // square each number
            .sorted()                 // sort the numbers
            .collect(Collectors.toList());  // collect them into a list

        // Display the squared and sorted numbers
        result.forEach(x -> System.out.println(x));   // terminal operation

        // Print the final processed list
//        System.out.println("Processed numbers: " + result);
    }
    
    
    // streeams using objects 
}