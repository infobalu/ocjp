package com.myzoo.domain;

public class Gato extends Felino {
	private String raza;
	private String nombre;
	static final boolean garras = false;
	static final boolean domestico = true;
	static final String tipo = "Gato";
	
	public Gato(String raza,String nombre) {
		super(tipo,garras,domestico);
		this.nombre = nombre;
		this.raza = raza;
	}
	
	public void getDetails() {
		
		String garras = super.garrasAfiladas ? "Si" : "No";
		String domestico = super.domestico ? "Si" : "No";
		
		System.out.println(
				"Mi nombre es: " + this.nombre + " \n" +
				"Soy de raza: " + this.raza + " \n" +
				"Soy un " + super.tipo + " \n" +
				"Tengo garras afiladas? " + garras + " \n" +
				"Soy domestico? " + domestico + " \n"
		);
	}
}
