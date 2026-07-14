package com.coforge.day5.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class JDBCInsert {

	public static void main(String[] args) throws Exception {
		
		//Step-1: Loading the Driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//Step-2: Connection with the Database
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/employeemanagement","root","9030516489@RVReddy");
		
		//Step-3: Creating Statement
		String sql = "insert into employee_table values(?, ?, ?, ?)";
		PreparedStatement statement = connection.prepareStatement(sql);
		
		//Step-4: Executing the query
		statement.setInt(1, 201);
		statement.setString(2, "Abhideep");
		statement.setInt(3, 1000);
		statement.setInt(4, 20);
		
		int n = statement.executeUpdate(); //INSERT, DELETE, UPDATE
		if(n == 1) {
			System.out.println("Employee details saved");
		} else {
			System.out.println("Employee details not saved");
		}
		
		//Step-5: Closing
		statement.close();
		connection.close();
		
	}

}
