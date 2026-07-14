package com.coforge.day4assignment;

public class Employee {
	private int empid;
	private String empname;
	private String desgination;
	private double monthlysalary;
	public Employee(int empid, String empname, String desgination,double monthlysalary) {
		this.empid = empid;
		this.empname = empname;
		this.desgination = desgination;
		this.monthlysalary = monthlysalary;
	}
	
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", empname=" + empname + ", desgination=" + desgination + ", monthlysalary="
				+ monthlysalary + "]";
	}

	public void annualSalary() {
		double annualSalary = monthlysalary * 12;
		System.out.println(annualSalary);
		
	}

}
