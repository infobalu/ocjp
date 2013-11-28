package com.mybank.domain;

public class Account {
	protected double balance;
	
	protected Account(double initbalance) {
		this.balance = initbalance;
	}

	public double getBalance() {
		return balance;
	}

	public boolean deposit(double amt) {
		this.balance = this.balance + amt;
		return true;
	}
	
	public boolean withdraw(double amt) {
		double tmpBalance = this.balance - amt;
		if ( !(tmpBalance < 0) ) {
			this.balance = this.balance - amt;
			return true;
		} else {
			return false;
		}
	}
}

