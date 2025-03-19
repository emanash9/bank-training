package com.training.bank;
import java.util.Scanner;


public class test {
	//️⃣ Create a class named saving account with attributes 
	//account number
	//name, roi and amount .

	// define Attributes for the the class

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	     /*   // Input: Investment cost and net profit
	        System.out.print("Enter Initial Investment: ");
	        double investment = scanner.nextDouble();

	        System.out.print("Enter Net Profit: ");
	        double profit = scanner.nextDouble();

	        // Calculate ROI
	        double roi = (profit / investment) * 100;

	        // Display ROI
	        System.out.println("Return on Investment (ROI) After 1 Year: " + roi + "%");

	      //  scanner.close();
	    
	        //question 2: Input  4 banks account and add objects (scanner)
	        // iterate (loop) to find which account has the max amount (system out the max variable)
	        //and display that.
	        
	        
	        double[] accountBalances = new double[4];
	        String[] accountNames = new String[4];
	        
	        // Input loop for 4 bank accounts
	        for (int i = 0; i < 4; i++) {
	            System.out.print("Enter name of Bank Account " + (i + 1) + ": ");
	            accountNames[i] = scanner.nextLine();  // Store bank account name
	            
	            System.out.print("Enter balance for " + accountNames[i] + ": ");
	            accountBalances[i] = scanner.nextDouble();  // Store account balance
	            scanner.nextLine(); // Consume the newline left after nextDouble()
	        }
	        
	        // Find the bank account with the maximum balance
	        double maxAmount = accountBalances[0];
	        int maxIndex = 0;
	        
	        for (int i = 1; i < 4; i++) {
	            if (accountBalances[i] > maxAmount) {
	                maxAmount = accountBalances[i];
	                maxIndex = i;
	            }
	        }
	        
	        // Output the account with the maximum balance
	        System.out.println("The bank with the highest balance is: " + accountNames[maxIndex]);
	        System.out.println("Balance: " + maxAmount);
	        
	        scanner.close();
	     */   
	        
	        // Topic : if statement block code 
	        int age = 1;
	        
	        if (age >= 23) {
	        	System.out.println("you're 23");   // this wil be printed cause it satisfies the variable
	        }
	        else if ( age >=13) {
	        	System.out.println("you're 13");
	        	
	        	}
	        else { 
	        	System.out.println("ok");    // performs the false condition 
	        	
	        }
	        
	    }
	}
	   
	        
	        
	        
    

		


