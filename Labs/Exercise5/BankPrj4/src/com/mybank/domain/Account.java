package com.mybank.domain;

public class Account {
	private double balance;
	
	public Account(double initbalance) {
		this.balance = initbalance;
	}

	public double getBalance() {
		return balance;
	}

	public boolean deposit(double balance) {
		this.balance = this.balance + balance;
		return true;
	}
	
	public boolean withdraw(double balance) {
		
		double tmpBalance = this.balance - balance;
		if ( !(tmpBalance < 0) ) {
			this.balance = this.balance - balance;
			return true;
		} else {
			return false;
		}
		
	}
}

