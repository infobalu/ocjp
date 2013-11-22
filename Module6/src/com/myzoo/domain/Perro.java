package com.myzoo.domain;

public class Perro extends Canino {
	private String nombre;
	private int edad;
	private double peso;
	
	public Perro() {
		nombre = "N";
	}
	
	public Perro(String nombre) {
		this.nombre = nombre;
	}
	
	public Perro(String nombre, int edad) {
		this(nombre);
		this.edad = edad;
	}
	
	public Perro(String nombre, int edad, double peso) {
		this("nombre, edad");
		this.peso = peso;
	}
	
	@Override
	public String toString() {
		return "nombre: " ;
	}
	
}
