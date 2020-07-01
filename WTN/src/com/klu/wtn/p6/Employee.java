package com.klu.wtn.p6;



public class Employee extends Person {

	   private double salary;
	   private  String insur;
	   private int start_year;
	Employee(String n,double sal,int y,String ins)
	{
	    super.name=n;
	    salary=sal;
	    start_year=y;
	    insur=ins;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getInsur() {
		return insur;
	}
	public void setInsur(String insur) {
		this.insur = insur;
	}
	public int getStart_year() {
		return start_year;
	}
	public void setStart_year(int start_year) {
		this.start_year = start_year;
	}
	public String getname()
	{
		return super.name;
	}
}
