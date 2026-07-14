package com.coforge.day4.ArraysStrings;

import java.util.Scanner;

public class ArrayTest2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[5];
		System.out.println("Enter 5 valules");
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		int sum = 0;

		for (int i = 0; i < arr.length; i++) {
			System.out.println("Arr[" + i + "] : " + arr[i]);
			sum = sum + arr[i];
		}
		System.out.println("The Sum of elements : " + sum);

	}

}
