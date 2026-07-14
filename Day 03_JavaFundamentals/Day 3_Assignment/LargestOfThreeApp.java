package Assignment;

import java.util.Scanner;

public class LargestOfThreeApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter three numbers");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		if(a > b && a > c) {
			System.out.println("The largest number is : " + a);
		}
		else if(c > b && c > a) {
			System.out.println("The largest number is : " + c);
		}
		else {
			System.out.println("The largest number is : " + b);
		}
		
	}

}
