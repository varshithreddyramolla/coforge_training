package com.coforge.day4assignment;

public class studentDetails {

	public static void main(String[] args) {
		Student s1 = new Student(101,"Pranay",96);
		Student s2 = new Student(102,"Gundu",89);
		Student s3 = new Student(103,"Siddu",78);
		Student s4 = new Student(104,"Enkates",55);
		
		System.out.println(s1);
		s1.grade();
		
		System.out.println(s2);
		s2.grade();
		
		System.out.println(s3);
		s3.grade();
		
		System.out.println(s4);
		s4.grade();

	}

}
