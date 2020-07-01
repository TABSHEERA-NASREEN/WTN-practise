package com.klu.wtn.p4;

public class Fan {

	public static int SLOW =1;
	public static int MEDIUM=2;
	public static int FAST=3;
	private int speed=SLOW;
	private boolean on=false;
	private double radius=5;
	private String color="red";
	public Fan()
	{
		
	}
	public void increasespeed()
	{
		if(speed==SLOW)
			speed=MEDIUM;
		else if(speed==MEDIUM)
			speed=FAST;
		else 
			System.out.println("Fan is already in high speed");
	}
	
	public void decreasespeed()
	{
		if(speed==FAST)
			speed=MEDIUM;
		else if(speed==MEDIUM)
			speed=SLOW;
		else 
			System.out.println("Fan is already in low speed");
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public boolean isOn() {
		return on;
	}
	public void setOn(boolean on) {
		this.on = on;
	}
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	public String tostring()
	{
		String ans="Speed "+speed+"\n"+"Color "+color+"\n"+"Radius "+radius+"\n";
		if(isOn())
			ans+="fan is on";
		else
			ans+="fan is off";
		return ans;
			
	}
	public static void main(String[] args)
	{
		Fan f=new Fan();
		System.out.println(f.tostring());
		f.setSpeed(3);
		f.setOn(true);
		f.setColor("green");
		System.out.println(f.tostring());
	}
	
	
}
