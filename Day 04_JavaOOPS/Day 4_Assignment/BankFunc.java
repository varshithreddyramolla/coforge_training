package com.coforge.day4assignment;

public class BankFunc {

	public static void main(String[] args) {
		BankAccount b1 = new BankAccount(1011,10000);
		BankAccount b2 = new BankAccount(1012,20000);
		
		b1.deposit(1000);
		b1.withDraw(200);
		b1.checkBalance();
		
		b2.deposit(2000);
		b2.withDraw(500);
		b2.checkBalance();
		
		

	}

}
