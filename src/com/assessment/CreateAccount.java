package com.assessment;
import java.sql.*;

public class CreateAccount {
    private static final String URL = "jdbc:postgresql://localhost:5431/testdb";
    private static final String USER = "postgres";
    private static final String PASSWORD = "eman";

    // Method to create an account with a name and initial deposit
    public void createAccount(String name, double initialDeposit) {
        String sql = "INSERT INTO bank_account (name, balance) VALUES (?, ?)";
        
        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement pstmt = connection.prepareStatement(sql)) {
            pstmt.setString(1, name);
            pstmt.setDouble(2, initialDeposit);
            pstmt.executeUpdate();
            System.out.println("Account created successfully for " + name + " with an initial deposit of $" + initialDeposit);
        } catch (SQLException e) {
            System.out.println("Error creating account.");
            }
        }
}
