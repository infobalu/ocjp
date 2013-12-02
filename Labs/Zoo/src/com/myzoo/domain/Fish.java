package com.myzoo.domain;

public class Fish extends Animal implements Pet {
	private String name;
	
	public Fish() {
		super(0);
	}

	public String getName() {
		return name;
	}

	public void setName(String n) {
		this.name = n;
	}
	
	public void walk() {
		System.out.println("Dude seriously you took your fish for a walk?");
	}
	
	public void eat() {
		System.out.println("The fish is eating");
	}
	
	public void play() {
		System.out.println("Does your fish knows how to play death? Oh :<");
	}
}
