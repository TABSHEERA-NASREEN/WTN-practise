package com.klu.wtn.p6;


public class TestEmployee {

	public static void main(String args[]){  
		Employee e=new Employee("nazi",3000.0,2020,"humsaath");  
		
		System.out.println("Employee name "+e.getname());
		System.out.println("Employee salary "+e.getSalary());
	    System.out.println("Employee Start year: "+e.getStart_year());
	    System.out.println("Employee insurance "+e.getInsur());
}
}
