package com.training.bank;

import java.util.Scanner;


// 1-Write a Java program to create a class called "Account" with attributes for
// account number, account holder's name, and balance.

public abstract class Account {
	
	private int accountNumber;
	private String accountHolderName;
    private double amount;
    double accountBalance;
    
    //

    
       
    public Account(int accountNumber, String accountHolderName, double amount) {
    	
        Scanner scanner = new Scanner(System.in);

    	
    	// first array to save values
    	double [] accountBalance = new double [4];
    	
        String[] accountName = new String[4];
        
        // for loop to go through array
        for (int i = 0 ; i<4 ; i++ ) {
        	
        	System.out.println("enter the account Name" + i+1 + ":");
        	accountName[i] = scanner.nextLine(); 
        	
        	
        	System.out.println("enter the account balance" + accountName[i] + ":");
        	accountBalance[i] = scanner.nextDouble(); 
        	scanner.nextLine(); 
        	
        	
        }

    
        public class bank {
            public static void main(String[] args) {
                int[] balances = {1000, 2000, 1500, 3000};
                int totalBalance = 0;

                for (int i = 0; i < balances.length; i++) {
                    totalBalance += balances[i];
                }

                System.out.println("Total Balance: " + totalBalance);
            }
        }


    


    	
    	
    	
    	
    	
    	
    	
    	
    	
    }
}