package com.findsport.DataBaseConnections;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;

public class CreateDBConnection {
	
	// Database settings
	private static String url = "jdbc:mysql://localhost:3306/findsport";
	private static String dbName = "findsport";
	private static String userName = "root"; 
	private static String password = "arjun613";
		
	public static Connection getConnection()
	{
		Connection con=null;
		try 
		{
			con = DriverManager.getConnection(url,userName,password);
			con.setAutoCommit(false);
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
		return con;
		   
	}
}