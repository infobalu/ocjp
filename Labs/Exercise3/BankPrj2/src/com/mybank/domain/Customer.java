package com.mybank.domain;

public class Customer {
	private String firstName;
	private String lastName;
	private Account acc;
	
	public Customer(String f, String l) {
		this.firstName = f;
		this.lastName = l;
	}

	public Account getAccount() {
		return acc;
	}

	public void setAccount(Account acc) {
		this.acc = acc;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}
	
	
}
