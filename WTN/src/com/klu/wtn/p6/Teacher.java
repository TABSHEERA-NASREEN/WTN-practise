package com.klu.wtn.p6;



public class Teacher extends Person1 {

	private double salary;

	public Teacher(String n, int byear, double s)
    {
      super(n, byear);
      salary = s;
    }

    public String toString()
    {
      return "Employee[super=" + super.toString() + ",salary=" + salary + "]";
    }



}
