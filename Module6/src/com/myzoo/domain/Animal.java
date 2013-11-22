package com.myzoo.domain;

public class Animal {
	protected String tipo;
	
	public Animal(String tipo) {
		this.tipo = tipo;
	}
	
	public void comer() {
		System.out.println("Ruido del animal");
	}
	
	public void dormir() {
		System.out.println("Ruido del animal");
	}
}
