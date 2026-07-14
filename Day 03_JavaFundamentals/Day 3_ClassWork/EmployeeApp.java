package com.coforge.day3;

public class EmployeeApp {

	public static void main(String[] args) {
		Employee varx = new Employee(101, "Varshith", 2000.0);
		varx.display();
		
		varx.setSalary(1000.0);
		varx.display();
		
		Employee valan = new Employee(102, "Valan", 3000.0);
		valan.display();
	}

}
