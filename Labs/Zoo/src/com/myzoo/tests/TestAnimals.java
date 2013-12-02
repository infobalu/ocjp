package com.myzoo.tests;

import com.myzoo.domain.Animal;
import com.myzoo.domain.Cat;
import com.myzoo.domain.Fish;
import com.myzoo.domain.Pet;
import com.myzoo.domain.Spider;

public class TestAnimals {
	public static void main(String[] args) {
		Fish d = new Fish();
		Cat c = new Cat("Fluffy"); 
		Animal a = new Fish(); 
		Animal e = new Spider(); 
		Pet p = new Cat();
		
		d.walk();
		c.walk();
		a.walk();
		e.walk();
		p.getName();
	}
}
