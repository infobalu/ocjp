package com.myzoo.domain;

public class Cat extends Animal implements Pet {
	private String name;
	
	public Cat(String n) {
		super(4);
		this.name = n;
	}
	
	public Cat() {
		super(4);
	}

	public String getName() {
		return name;
	}

	public void setName(String n) {
		this.name = n;
	}
	
	public void play() {
		System.out.println("By play you might be refering to Conquer the World");
		System.out.println("Yep the cat is \"playing\" ");
	}
	
	public void eat() {
		System.out.println("The cat is eating");
	}
	
	
}
