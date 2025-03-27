package com.training.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class JavaStreams {
	   public static void main(String[] args) {
		   
		List<String> names = new ArrayList<>();
		List<String> namesWithS = new ArrayList<>();
		List<Integer> num = new ArrayList<>();

		
		names.add("Sam");
		names.add("Doe");
		names.add("Jessic");
		names.add("Stormy");
		num.add(10);
		num.add(5);
		num.add(1);
		num.add(7);
		num.add(13);

			

		
		// OR, ANOTHER WAy TO SOLVE IT 
		
//		for(String name : names) {
//			if(name.startsWith("S")) {
//				//System.out.println(name);
//				namesWithS.add(name);
//			}
//		}
		

		// Stream 
		// So instead of writing a loop use this line only to get names that start with 'S'
		names.stream().filter(n -> n.startsWith("S")).forEach(x->System.out.println(x));

		
		System.out.println();
		
		num.stream().filter(n -> n%2 != 0).sorted().forEach(x->System.out.println("Number is:" + x + ", Square Root is " + Math.pow(x, 2) ));

		num.stream().filter(n -> n%2 != 0).map(m->m*m).sorted().forEach(x->System.out.println(x));
		
		// to save output in a list 
		List<Integer> sortedNum= num.stream()
								.filter(n -> n%2 != 0)
								.map(m->m*m)
								.sorted()
								.collect(Collectors.toList());
//	       Scanner scanner = new Scanner(System.in);
//	       List<String> names = new ArrayList<>();
//	       
//	       
//	       
//	       // Taking number of names as input with validation
//	       int n = 0;
//	       boolean validInput = false;
//	      
//	       while (!validInput) {
//	           System.out.println("Enter the number of names: ");
//	          
//	           // Check if the input is an integer
//	           if (scanner.hasNextInt()) {
//	               n = scanner.nextInt();
//	               scanner.nextLine(); // Consume the leftover newline character
//	               validInput = true; // If input is valid, exit the loop
//	           } else {
//	               System.out.println("Invalid input! Please enter a valid integer.");
//	               scanner.nextLine(); // Clear the invalid input
//	           }
//	       }
//	       // Taking names as input
//	       System.out.println("Enter " + n + " names:");
//	       for (int i = 0; i < n; i++) {
//	           names.add(scanner.nextLine());
//	       }
//	       // Filtering out names that start with 'S' or 's'
//	       List<String> filteredNames = names.stream()
//	                                         .filter(name -> !name.toLowerCase().startsWith("s"))
//	                                         .collect(Collectors.toList());
//	       // Display filtered names
//	       System.out.println("Names that do NOT start with 'S': " + filteredNames);
//	       scanner.close();
	   }
	}

