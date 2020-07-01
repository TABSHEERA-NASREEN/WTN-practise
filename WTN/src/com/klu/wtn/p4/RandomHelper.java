package com.klu.wtn.p4;

import java.util.Random;

public class RandomHelper {

	public static int randint(int a,int b)
	{
		Random random=new Random();
	    int rand=random.nextInt(b);
	    return rand;
	}
	
	public static double randdouble(int a,int b)
	{
		Random random=new Random();
		double c=(double)b;
		double rand=random.nextDouble();
		
		return rand;
	}
}
