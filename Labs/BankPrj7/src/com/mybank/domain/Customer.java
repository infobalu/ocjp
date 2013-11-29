package com.mybank.domain;

public class Customer {
	private String firstName;
	private String lastName;
	private Account[] accounts;
	private int numberOfAccounts;
	
	public Customer(String f, String l) {
		this.firstName = f;
		this.lastName = l;
		
		accounts = new Account[10];
		numberOfAccounts = 0;
	}
	
	public void addAccount(Account acc) {
		accounts[numberOfAccounts] = acc;
		numberOfAccounts++;
	}
	
	public int getNumOfAccounts() {
		return numberOfAccounts;
	}

	public Account getAccount(int index) {
		return accounts[index];
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}
	
	
}
