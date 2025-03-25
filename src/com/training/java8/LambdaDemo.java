package com.training.java8;
import java.util.function.Predicate;

public class LambdaDemo {

	public static void main(String[] args) {

//		int result = sum(23, 45);
//		System.out.println(result);
//		MyFuncInterface obj = (x,y)-> x+y; 
//		System.out.print(obj.sum(21,19));    // to write a shorter code
		
//		MyFuncInterface obj1 = (a, b) -> a * b;
//		System.out.print(obj1.Multiplication(1,10)); 
//		
//		// two values 
//
//	}
//		MyFuncInterface obj1 = (a, b, c) -> a + " " + b + " "+ c  ;    // for strings concatenation
//	    String a = "My";
//        String b = "Name";
//        String c = "Is";
//
//
//        // Call the method
//        System.out.print(obj1.Concatenation(a, b, c));
        
		Predicate<Integer> val = a -> a % 2 == 0;

        // Test the predicate
        System.out.println(val.test(34)); // Output: true
        System.out.println(val.test(15));

	}
	
	
	
	
//	private static int sum (int a , int b) {
//		return a+b;
		
	}


