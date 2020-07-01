package com.klu.wtn.p6;

public class Person1 {

	private String name;
	private int birthYear;

	public Person1(String n,int byear)
	{
	  name = n;
	  birthYear = byear;
	}

	public String toString()
	{
	  return "Person[name=" + name + ",birthYear=" + birthYear + "]";
	}
}
