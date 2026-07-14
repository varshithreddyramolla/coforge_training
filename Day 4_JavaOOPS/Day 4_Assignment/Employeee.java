package com.coforge.day4assignment;

public class Employeee {

	public static void main(String[] args) {
		Employee e1 = new Employee(1,"Sreekar","Manager",50000);
		Employee e2 = new Employee(2,"Abhinav","Assistant Manager",10000);
		Employee e3 = new Employee(3,"Vivek","Product Manager",25000);
		
		System.out.println(e1);
		e1.annualSalary();
		System.out.println(e2);
		e2.annualSalary();
		System.out.println(e3);
		e3.annualSalary();
		
		

	}

}
