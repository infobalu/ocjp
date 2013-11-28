package com.mybank.domain;

public class CheckingAccount extends Account {
	private double overDraftAmount;
	
	public CheckingAccount(double initBalance, double overdraft) {
		super(initBalance);
		this.overDraftAmount = overdraft;
	}
	
	public CheckingAccount(double initBalance) {
		super(initBalance);
	}
	
	@Override
	public boolean withdraw(double amt) {
		if (balance < amt ) {
			double overDraftNeeded = amt - balance;
			if (overDraftNeeded > overDraftAmount) {
				return false;
			} else {
				balance = 0.0;
				overDraftAmount -= overDraftNeeded;
				return true;
			}
		} else {
			balance -= amt;
			return true;
		}
	}
}
