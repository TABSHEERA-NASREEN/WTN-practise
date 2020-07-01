package com.klu.wtn.p4;

public class Patient {

	private String name;
	private double height;
	private double weight;
	
	public Patient(String name, double height, double weight) {
		super();
		this.name = name;
		this.height = height;
		this.weight = weight;
	}
	
	public double BMI () {
		// BMI = ( Weight in Pounds / ( Height in inches x Height in inches ) ) x 703
		return ( weight / ( height * height ) ) * 703;
	}
}
