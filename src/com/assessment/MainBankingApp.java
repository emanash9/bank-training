package com.assessment;
import java.util.Scanner;

public class MainBankingApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AccountManagement accountManagement = new AccountManagement();
        CreateAccount createAccount = new CreateAccount();

        while (true) {
            System.out.println("\nOAB Banking Application Menu:");   // my menu :)
            System.out.print("1. Create Account | ");
            System.out.print("2. Deposit Money | ");
            System.out.print("3. Withdraw Money | ");
            System.out.print("4. Transfer Money | ");
            System.out.print("5. Check Balance | ");
            System.out.println("6. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); //extra/ line

            if (choice == 1) {
                System.out.print("Enter your name: ");
                String name = scanner.nextLine();
                System.out.print("Enter initial deposit: ");
                double initialDeposit = scanner.nextDouble();
                createAccount.createAccount(name, initialDeposit);
            } else if (choice == 2) {
                System.out.print("Enter account number: ");
                int accountNumber = scanner.nextInt();
                System.out.print("Enter amount to deposit: ");
                double depositAmount = scanner.nextDouble();
                accountManagement.depositMoney(accountNumber, depositAmount);
            } else if (choice == 3) {
                System.out.print("Enter account number: ");
                int accountNumber = scanner.nextInt();
                System.out.print("Enter amount to withdraw: ");
                double withdrawAmount = scanner.nextDouble();
                accountManagement.withdrawMoney(accountNumber, withdrawAmount);
            } else if (choice == 4) {
                System.out.print("Enter sender account number: ");
                int fromAccount = scanner.nextInt();
                System.out.print("Enter receiver account number: ");
                int toAccount = scanner.nextInt();
                System.out.print("Enter amount to transfer: ");
                double transferAmount = scanner.nextDouble();
                accountManagement.transferFunds(fromAccount, toAccount, transferAmount);
            } else if (choice == 5) {
                System.out.print("Enter account number: ");
                int accountNumber = scanner.nextInt();
                accountManagement.checkBalance(accountNumber);
            } else if (choice == 6) {
                System.out.println("Exiting...");
                scanner.close();
                break;
            } else {
                System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
