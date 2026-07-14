package com.coforge.day6.java8;

@FunctionalInterface
interface Calculator {
	public int calci(int a, int b);
}


public class LambdaTest {

	public static void main(String[] args) {
		Calculator calculator = (a,b) -> a + b;
		System.out.println(calculator.calci(10, 20));
		
		calculator = (a,b) -> a - b;
		System.out.println(calculator.calci(20, 10));

	}

}
