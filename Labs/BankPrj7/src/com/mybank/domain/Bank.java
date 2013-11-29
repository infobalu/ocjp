package com.mybank.domain;

public class Bank {
	private static Customer customer[];
	private static int numberOfCustomers;
	
	static {
		customer = new Customer[10];
		numberOfCustomers = 0;
	}
	
	private Bank() {
		
	}
	
	public static void addCustomer(String f, String l) {
		if (numberOfCustomers >= 10) {
			System.out.println("The customer could not be added");
		} else {
			int i = numberOfCustomers;
			customer[i++] = new Customer(f,l);
			numberOfCustomers++;
		}
		
	}
	
	public static int getNumOfCustomers() {
		return numberOfCustomers;
	}
	
	public static Customer getCustomer(int index) {
		return customer[index];
	}
}
