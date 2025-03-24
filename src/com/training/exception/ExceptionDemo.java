package com.training.exception;

import java.util.InputMismatchException;
// Define the custom exception


//Define the custom exception by extending Exception


public class ExceptionDemo {

 public static void main(String[] args) {
     int i = 5;
     int j = 0;
     int age = 16;
     double result = 0;

     try {
         // Check if age is less than 18
         if (age < 18) {
             throw new MinimumAgeException("Age should not be less than 18");
         }
         // Division by zero will throw ArithmeticException
         result = i / j;
     } catch (ArithmeticException | MinimumAgeException e) {
         // This will catch both ArithmeticException and MinimumAgeException
         System.out.println("Exception occurred: " + e.getMessage());
     } finally {
         System.out.println("--- Inside the Finally Block ---");
     }

     System.out.println("--- Execution Resumes ---");
 }
}
