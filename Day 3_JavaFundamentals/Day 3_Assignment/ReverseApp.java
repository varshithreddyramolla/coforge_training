package Assignment;

import java.util.Scanner;

public class ReverseApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		
		int num = n;
		int rev = 0;
		
		while(num >= 1) {
			int x = num % 10;
			rev = rev * 10 + x;
			num = num / 10;
		}
			
		System.out.println("Reversed num : " + rev);
	}

}
