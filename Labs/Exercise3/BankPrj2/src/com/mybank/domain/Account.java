package com.mybank.domain;

public class Account {
	private double balance;
	
	public Account(double initbalance) {
		this.balance = initbalance;
	}

	public double getBalance() {
		return balance;
	}

	public void deposit(double balance) {
		this.balance = this.balance + balance;
	}
	
	public void withdraw(double balance) {
		
		double tmpBalance = this.balance - balance;
		if ( !(tmpBalance < 0) ) {
			this.balance = this.balance - balance;
		} else {
			System.out.println("The balance should not go below 0!");
		}
		
	}
}

