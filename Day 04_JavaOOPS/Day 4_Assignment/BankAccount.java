package com.coforge.day4assignment;

public class BankAccount {
	private int accountNumber;
	private double balance;
	
	public BankAccount(int accountNumber, double balance) {
		
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	public int getAccountNumber() {
		return accountNumber;
	}

	public double getBalance() {
		return balance;
	}
	
	void deposit(double amount) {
		if(amount < balance) { 
			balance += amount;
			System.out.println("Deposited amount is :" + amount);
		}
		
		else {
			System.out.println("Invalid amount");
		}
	}
	
	void withDraw(double amount) {
		if(amount < balance) { 
			balance -= amount;
			System.out.println("Withdrawn amount is :" + amount);
		}
		
		else {
			System.out.println("Insufficient funds");
		}
	}
	
	void checkBalance() {
		System.out.println("Current Balance : " + balance);
	}
	

}
