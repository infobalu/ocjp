package com.myzoo.domain;

public class Felino extends Animal {
	protected boolean garrasAfiladas;
	protected boolean domestico;
	
	public Felino(String tipo,boolean garrasAfiladas,boolean domestico) {
		super("felino/"+tipo);
		this.domestico = domestico;
		this.garrasAfiladas = garrasAfiladas;
	}
	
	public void cazar() {
		System.out.println("El felino esta cazando");
	}
	
	public void trepar() {
		System.out.println("El felino esta trepando");
	}
	
}
