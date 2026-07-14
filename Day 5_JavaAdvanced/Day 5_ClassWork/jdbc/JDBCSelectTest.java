package com.coforge.day5.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class JDBCSelectTest {

	public static void main(String[] args) throws Exception {
		
		//Step-1: Loading the Driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//Step-2: Connection with the Database
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/employeemanagement","root","9030516489@RVReddy");
		
		//Step-3: Creating Statement
		String sql = "select * from employee_table";
		PreparedStatement statement = connection.prepareStatement(sql);
		
		//Step-4: Executing the query

		ResultSet rs = statement.executeQuery();
		
		while (rs.next()) {
		    System.out.println(rs.getInt("eid") + " "
		            + rs.getString("ename") + " "
		            + rs.getInt("esalary") + " "
		            + rs.getInt("dno"));
		}
		
		//Step-5: Closing
		rs.close();
		statement.close();
		connection.close();
		
	}

}
