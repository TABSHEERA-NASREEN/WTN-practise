package com.klu.wtn.p7;

public class Fruit {

	protected String name;
	protected String taste;
	protected int size;
	
	public Fruit() {
		name = "watermelon";
		taste = "sweet";
		size = 1;
	}
	
	public void eat () {
		System.out.println(name + " tastes like " + taste);
		
	}
}
