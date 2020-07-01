package com.klu.wtn.p6;

public class Student extends Person1 {

	private String major;

	  public Student(String n, int byear, String m)
	  {
	     super(n, byear);
	     major = m;
	  }

	  public String toString()
	  {
	    return "Student[super=" + super.toString() + ",major=" + major + "]";
	  }


}
