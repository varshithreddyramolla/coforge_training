package Assignment;

import java.util.Scanner;

public class GradeCalculatorApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your marks");
		int a = sc.nextInt();
		
		if(a >= 90 && a <= 100) {
			System.out.println("Grade is A");
		}
		else if(a >= 80 && a <= 89) {
			System.out.println("Grade is B");
		}
		else if(a >= 70 && a<= 79) {
			System.out.printl n("Grade is C");
		}
		else if(a >= 60 && a <= 69) {
			System.out.println("Grade is D");
		}
		else{
			System.out.println("Grade is F");
		}

	}

}
