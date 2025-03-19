package com.training.bank;

import java.util.Scanner;

//Base class: Account
class Account {
 protected int accountNumber;
 protected String accountHolderName;
 protected double balance;

 // Constructor
 public Account(int accountNumber, String accountHolderName, double balance) {
     this.accountNumber = accountNumber;
     this.accountHolderName = accountHolderName;
     this.balance = balance;
 }

 // Deposit method
 public void deposit(double amount) {
     if (amount > 0) {
         balance += amount;
         System.out.println(amount + " deposited. New balance: " + balance);
     } else {
         System.out.println("Deposit amount must be positive.");
     }
 }

 // Withdraw method
 public void withdraw(double amount) {
     if (amount > 0 && amount <= balance) {
         balance -= amount;
         System.out.println(amount + " withdrawn. New balance: " + balance);
     } else {
         System.out.println("Insufficient balance or invalid amount.");
     }
 }

 // Check balance method
 public void checkBalance() {
     System.out.println("Account Balance: " + balance);
 }
}

//Subclass: SavingsAccount
class SavingsAccount extends Account {
 private double interestRate;

 // Constructor
 public SavingsAccount(int accountNumber, String accountHolderName, double balance, double interestRate) {
     super(accountNumber, accountHolderName, balance);
     this.interestRate = interestRate;
 }

 // Method to apply interest
 public void applyInterest() {
     double interest = balance * (interestRate / 100);
     balance += interest;
     System.out.println("Interest applied. New balance: " + balance);
 }
}

//Main Class with Menu
public class Exercise3 {
 private static Scanner scanner = new Scanner(System.in);
 private static Account[] accounts = new Account[10]; // Array to hold up to 10 accounts
 private static int accountCount = 0; // Tracks the number of accounts created

 public static void main(String[] args) {
     while (true) {
         System.out.println("\n----- Bank Menu -----");
         System.out.println("1. Add Account");
         System.out.println("2. Deposit");
         System.out.println("3. Withdraw");
         System.out.println("4. Check Balance");
         System.out.println("5. Apply Interest");
         System.out.println("6. Exit");
         System.out.print("Enter your choice: ");
         
         int choice = scanner.nextInt();
         switch (choice) {
             case 1:
                 addAccount();
                 break;
             case 2:
                 depositMoney();
                 break;
             case 3:
                 withdrawMoney();
                 break;
             case 4:
                 checkBalance();
                 break;
             case 5:
                 applyInterest();
                 break;
             case 6:
                 System.out.println("Exiting...");
                 System.exit(0);
             default:
                 System.out.println("Invalid choice! Please try again.");
         }
     }
 }

 // Method to add an account
 private static void addAccount() {
     if (accountCount >= accounts.length) {
         System.out.println("Account limit reached!");
         return;
     }

     System.out.print("Enter Account Number: ");
     int accNo = scanner.nextInt();
     scanner.nextLine(); // Consume newline

     System.out.print("Enter Account Holder Name: ");
     String name = scanner.nextLine();

     System.out.print("Enter Initial Balance: ");
     double balance = scanner.nextDouble();

     System.out.print("Enter Interest Rate: ");
     double interestRate = scanner.nextDouble();

     accounts[accountCount] = new SavingsAccount(accNo, name, balance, interestRate);
     accountCount++;
     System.out.println("Account created successfully!");
 }

 // Method to deposit money
 private static void depositMoney() {
     System.out.print("Enter Account Number: ");
     int accNo = scanner.nextInt();
     Account account = findAccount(accNo);
     if (account != null) {
         System.out.print("Enter Amount to Deposit: ");
         double amount = scanner.nextDouble();
         account.deposit(amount);
     }
 }

 // Method to withdraw money
 private static void withdrawMoney() {
     System.out.print("Enter Account Number: ");
     int accNo = scanner.nextInt();
     Account account = findAccount(accNo);
     if (account != null) {
         System.out.print("Enter Amount to Withdraw: ");
         double amount = scanner.nextDouble();
         account.withdraw(amount);
     }
 }

 // Method to check balance
 private static void checkBalance() {
     System.out.print("Enter Account Number: ");
     int accNo = scanner.nextInt();
     Account account = findAccount(accNo);
     if (account != null) {
         account.checkBalance();
     }
 }

 // Method to apply interest
 private static void applyInterest() {
     System.out.print("Enter Account Number: ");
     int accNo = scanner.nextInt();
     Account account = findAccount(accNo);
     if (account != null && account instanceof SavingsAccount) {
         ((SavingsAccount) account).applyInterest();
     }
 }

 // Method to find an account by account number
 private static Account findAccount(int accNo) {
     for (int i = 0; i < accountCount; i++) {
         if (accounts[i].accountNumber == accNo) {
             return accounts[i];
         }
     }
     System.out.println("Account not found!");
     return null;
 }
}
