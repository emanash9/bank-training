package com.training.postgressql.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class UserRepository {
public String findUserName(String userId) {
	String url = "jdbc:postgresql://localhost:5431/testdb";
    String username = "postgres";
    String password = "eman";
    String userName = null;
		try {
//	
	       
	       
		  Class.forName("org.postgresql.Driver");
        // Connect to the database
          Connection connection = DriverManager.getConnection(url, username, password);
          if(connection != null) {
        	  System.out.println("Connected Successfully");
        	 
        	  //statement
	          Statement stmt = connection.createStatement();
	          ResultSet rs = stmt.executeQuery("SELECT * FROM employee");
	          
	          // parepare statement will be dynamic query
	          PreparedStatement pstmt = connection.prepareStatement("SELECT * FROM employee WHERE emp_Id = ?");
	          pstmt.setString(1, userId); 
	          ResultSet rs1 = pstmt.executeQuery(); 

	          
	          
	          
	          while(rs1.next()) {
//	        	  System.out.println("ID: " + rs1.getString(1) + " Name: " + rs1.getString(2));
	        	  userName = rs.getString(1);
	        	  
	          }
	         
          }
          else {
        	  System.out.println("Unable to Connect!!");
          }
   	 
		}
		catch(Exception e) {
			System.out.println(e);
		}
    return userName;
}
}
    
	

