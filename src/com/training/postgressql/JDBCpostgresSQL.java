package com.training.postgressql;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;
import java.sql.PreparedStatement;



public class JDBCpostgresSQL {
	public static void main(String[] args) {
//			
//			db.url=jdbc:postgresql://localhost:5431/testdb
//			db.user=postgres
//			db.password=eman
		
			String url = "jdbc:postgresql://localhost:5431/testdb";
	        String username = "postgres";
	        String password = "eman";
 
				try {
//					Properties props = new Properties();
//					FileInputStream input = new FileInputStream("db.properties");
//					props.load(input);
//				    String url = props.getProperty("db.url");
//			        String username = props.getProperty("db.user");
//			        String password = props.getProperty("db.password");
			       
			       
				  Class.forName("org.postgresql.Driver");
		        // Connect to the database
		          Connection connection = DriverManager.getConnection(url, username, password);
		          if(connection != null) {
		        	  System.out.println("Connected Successfully");
		        	 
		        	  //statement
			          Statement stmt = connection.createStatement();
			          ResultSet rs = stmt.executeQuery("SELECT * FROM employee");
			          
			          // parepare statement will be dynamic query
			          PreparedStatement pstmt = connection.prepareStatement("SELECT * FROM employee WHERE emp_name = ?");
			          pstmt.setString(1, "Ahmed"); 
			          ResultSet rs1 = pstmt.executeQuery(); 

			          
			          
			          
			          while(rs1.next()) {
			        	  System.out.println("ID: " + rs1.getString(1) + " Name: " + rs1.getString(2));
			          }
			         
		          }
		          else {
		        	  System.out.println("Unable to Connect!!");
		          }
	       	 
				}
				catch(Exception e) {
					System.out.println(e);
				}
	}
	}

