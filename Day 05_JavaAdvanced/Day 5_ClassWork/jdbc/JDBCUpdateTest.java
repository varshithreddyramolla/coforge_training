package com.coforge.day5.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class JDBCUpdateTest {

	public static void main(String[] args) throws Exception {
		
		//Step-1: Loading the Driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//Step-2: Connection with the Database
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/employeemanagement","root","9030516489@RVReddy");
		
		//Step-3: Creating Statement
		String sql = "update employee_table set ename = ?, esalary = ? where eid = ?";
		PreparedStatement statement = connection.prepareStatement(sql);
		
		//Step-4: Executing the query
		statement.setString(1, "Akshaj");
		statement.setInt(2, 1000);
		statement.setInt(3, 101);
		
		int n = statement.executeUpdate(); //INSERT, DELETE, UPDATE
		if(n == 1) {
			System.out.println("Employee details updated");
		} else {
			System.out.println("Employee details not updated");
		}
		
		//Step-5: Closing
		statement.close();
		connection.close();
		
	}

}
