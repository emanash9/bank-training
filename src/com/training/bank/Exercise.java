package com.training.bank;
import java.util.Scanner;
public class Exercise {
   // BankAccount class
   static class BankAccount {
       String accountHolder;
       double balance;
       // Constructor to initialize account holder and balance
       public BankAccount(String accountHolder, double balance) {
           this.accountHolder = accountHolder;
           this.balance = balance;
       }
       // Getter for balance
       public double getBalance() {
           return balance;
       }
       // To display account details
       public void displayAccountDetails() {
           System.out.println("Account Holder: " + accountHolder + ", Balance: " + balance);
       }
   }
   public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       // 1. Create objects and store in an array
       System.out.print("How many bank accounts do you want to create? ");
       int numAccounts = scanner.nextInt();
       scanner.nextLine();  // Consume newline character
       BankAccount[] accounts = new BankAccount[numAccounts];
       // Create BankAccount objects and store them in the array
       for (int i = 0; i < numAccounts; i++) {
           System.out.print("Enter account holder's name: ");
           String name = scanner.nextLine();
           System.out.print("Enter initial balance: ");
           double balance = scanner.nextDouble();
           scanner.nextLine();  // Consume newline character
           accounts[i] = new BankAccount(name, balance);
       }
       // 2. Loop through and find the account with the maximum balance
       BankAccount maxAccount = accounts[0];
       for (int i = 1; i < accounts.length; i++) {
           if (accounts[i].getBalance() > maxAccount.getBalance()) {
               maxAccount = accounts[i];
           }
       }
      // 3. Display the account with the maximum balance
       System.out.println("\nAccount with the maximum balance:");
      maxAccount.displayAccountDetails();
     scanner.close();
   }
}
