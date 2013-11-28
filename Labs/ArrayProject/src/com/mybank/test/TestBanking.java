package com.mybank.test;

import mybank.domain.*;

/*
 * This class creates the program to test the banking classes.
 * It creates a new Bank, sets the Customer (with an initial balance),
 * and performs a series of transactions with the Account object.
 */
public class TestBanking {

    public static void main(String[] args) {

        Bank bank;
        bank = new Bank();

        bank.addCustumers("Joaquin", "Lom");

        System.out.println(bank.getCustumer(0));

    }
}
