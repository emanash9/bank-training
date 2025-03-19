package com.training.bank;  // Ensure package name is consistent

import java.util.Scanner; // Import Scanner

public class BankAccount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create Scanner object

        System.out.print("Enter the number of accounts to create: ");
        int numAccounts = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        // Creating an array to store multiple SavingAccount objects
        SavingAccount[] accounts = new SavingAccount[numAccounts];

        // Loop to take input for each account
        for (int i = 0; i < numAccounts; i++) {
            System.out.println("\nEnter details for Account " + (i + 1));

            System.out.print("Enter Account Number: ");
            String accountNumber = scanner.nextLine();

            System.out.print("Enter Account Holder Name: ");
            String accountHolderName = scanner.nextLine();

            System.out.print("Enter Rate of Interest (ROI in %): ");
            double roi = scanner.nextDouble() / 100;  // Convert percentage to decimal

            System.out.print("Enter Initial Amount: ");
            double amount = scanner.nextDouble();
            scanner.nextLine(); // Consume newline

            // Creating an account object and storing it in the array
            accounts[i] = new SavingAccount(accountNumber, accountHolderName, roi, amount);
        }

        // Displaying all account details
        System.out.println("\n===== All Account Details =====");
        for (SavingAccount account : accounts) {
            System.out.println("\nAccount Holder: " + account.getName());
            System.out.println("Account Number: " + account.getAccountNumber());
            System.out.println("Initial Amount: $" + account.getAmount());
            System.out.println("Rate of Interest: " + (account.getRoi() * 100) + "%");
            System.out.println("Total Amount After One Year: $" + account.calculateTotalAmount());
        }

        scanner.close(); // Close scanner to prevent resource leak
    }
}
