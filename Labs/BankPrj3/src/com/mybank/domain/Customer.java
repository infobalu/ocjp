package com.mybank.domain;

public class Customer {
	private String firstName;
	private String lastName;
	private Account acccount;
	
	public Customer(String f, String l) {
		this.firstName = f;
		this.lastName = l;
	}

	public Account getAccount() {
		return acccount;
	}

	public void setAccount(Account acc) {
		this.acccount = acc;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}
	
	
}
