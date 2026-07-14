package com.coforge.day4assignment;

public class Student {
	private int id;
	private String name;
	private int marks;
	public Student(int id, String name, int marks) {
		this.id = id;
		this.name = name;
		this.marks = marks;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public int getMarks() {
		return marks;
	}
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", marks=" + marks + "]";
	}
	
	public void grade() {
		if(marks >= 90) {
			System.out.println("Grade is A");
		}
		else if(marks >= 80 && marks < 90) {
			System.out.println("Grade is B");
		}
		else if(marks >= 70 && marks < 80) {
			System.out.println("Grade is C");
		}
		else if(marks >= 60 && marks < 70) {
			System.out.println("Grade is D");
		}
		else {
			System.out.println("Grade is F");
		}
	}
	
	
	

}
