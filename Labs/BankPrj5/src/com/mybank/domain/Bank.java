package com.mybank.domain;

public class Bank {
	private Customer customer[];
	private int numberOfCustomers;
	
	public Bank() {
		customer = new Customer[10];
		numberOfCustomers = 0;
	}
	
	public void addCustomer(String f, String l) {
		if (numberOfCustomers >= 10) {
			System.out.println("The customer could not be added");
		} else {
			int i = numberOfCustomers;
			customer[i++] = new Customer(f,l);
			numberOfCustomers++;
		}
		
	}
	
	public int getNumOfCustomers() {
		return this.numberOfCustomers;
	}
	
	public Customer getCustomer(int index) {
		return this.customer[index];
	}
}
