package assessmentBanking;
import java.sql.*;

// to manage banking operations like deposit, withdraw, check balance, and transfer money

public class AccountManagement {
    private static final String URL = "jdbc:postgresql://localhost:5431/testdb";
    private static final String USER = "postgres";
    private static final String PASSWORD = "eman";

    // Method to deposit 
    public void depositMoney(int accountNumber, double amount) {
        String sql = "UPDATE bank_account SET balance = balance + ? WHERE account_number = ?";
 
        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement pstmt = connection.prepareStatement(sql)) {
            pstmt.setDouble(1, amount);
            pstmt.setInt(2, accountNumber);  //
            pstmt.executeUpdate();
            System.out.println("Deposited OMR" + amount + " to account " + accountNumber);
        } catch (SQLException e) {
            System.out.println("Error depositing money.");
            }
        }

    // Method to withdraw 
    public void withdrawMoney(int accountNumber, double amount) {
        String checkBalanceSql = "SELECT balance FROM bank_account WHERE account_number = ?";
        String updateBalanceSql = "UPDATE bank_account SET balance = balance - ? WHERE account_number = ?";

        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD)) {
            // Check current balance 
            try (PreparedStatement checkStmt = connection.prepareStatement(checkBalanceSql)) {
                checkStmt.setInt(1, accountNumber);
                ResultSet rs = checkStmt.executeQuery();

                if (rs.next()) {
                    double balance = rs.getDouble("balance");
                    System.out.println("Current balance for account " + accountNumber + " is OMR" + balance);

                    if (balance >= amount) {
                        // Withdraw money
                        try (PreparedStatement pstmt = connection.prepareStatement(updateBalanceSql)) {
                            pstmt.setDouble(1, amount);
                            pstmt.setInt(2, accountNumber);
                            pstmt.executeUpdate();
                            System.out.println("Withdrew OMR" + amount + " from account " + accountNumber);
                        }
                    } else {
                        System.out.println("Insufficient funds. Current balance: OMR" + balance);
                    }
                } else {
                    System.out.println("Account not found with account number " + accountNumber);
                }
            }
        } catch (SQLException e) {
            System.out.println("Error withdrawing money: " + e.getMessage());
        }
    }

    // Method to check balance 
    public void checkBalance(int accountNumber) {
        String sql = "SELECT balance FROM bank_account WHERE account_number = ?";

        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement pstmt = connection.prepareStatement(sql)) {
            pstmt.setInt(1, accountNumber);
            ResultSet rs = pstmt.executeQuery();

            if (rs.next()) {
                double balance = rs.getDouble("balance");
                System.out.println("Account " + accountNumber + " Balance: OMR" + balance);
            } else {
                System.out.println("Account not found.");
            }
        } catch (SQLException e) {
            System.out.println("Error checking balance.");
        }
    }

    // Method to transfer money between two accounts
    public void transferFunds(int fromAccount, int toAccount, double amount) {
        String checkBalanceSql = "SELECT balance FROM bank_account WHERE account_number = ?";
        String withdrawSql = "UPDATE bank_account SET balance = balance - ? WHERE account_number = ?";
        String depositSql = "UPDATE bank_account SET balance = balance + ? WHERE account_number = ?";

        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD)) {
            // Check balance in the sender's account
            try (PreparedStatement checkStmt = connection.prepareStatement(checkBalanceSql)) {
                checkStmt.setInt(1, fromAccount);
                ResultSet rs = checkStmt.executeQuery();

                if (rs.next()) {
                    double balance = rs.getDouble("balance");
                    if (balance >= amount) {
                        // Withdraw money from sender's account
                        try (PreparedStatement withdrawStmt = connection.prepareStatement(withdrawSql)) {
                            withdrawStmt.setDouble(1, amount);
                            withdrawStmt.setInt(2, fromAccount);
                            withdrawStmt.executeUpdate();
                        }

                        // Deposit money into receiver's account
                        try (PreparedStatement depositStmt = connection.prepareStatement(depositSql)) {
                            depositStmt.setDouble(1, amount);
                            depositStmt.setInt(2, toAccount);
                            depositStmt.executeUpdate();
                        }

                        System.out.println("Transferred OMR" + amount + " from account " + fromAccount + " to account " + toAccount);
                    } else {
                        System.out.println("Insufficient funds in sender account.");
                    }
                } else {
                    System.out.println("Sender account not found.");
                }
            }
        } catch (SQLException e) {
            System.out.println("Error transferring funds.");
        }
    }
}
// 
