package com.mybank.domain;

public class Account {
	private double balance;
	
	public Account(double initBalance) {
		this.balance = initBalance;
	}

	public double getBalance() {
		return balance;
	}

	public boolean deposit(double amt) {
		if (amt > 0) {
			this.balance = this.balance + amt;
			return true;
		} else {
			System.out.println("The transaction could not be completed..");
			return false;
		}
		
	}
	
	public boolean withdraw(double balance) {
		
		double tmpBalance = this.balance - balance;
		if ( !(tmpBalance < 0) ) {
			this.balance = this.balance - balance;
			return true;
		} else {
			System.out.println("The balance should not go below 0!");
			return false;
		}
		
	}
}

