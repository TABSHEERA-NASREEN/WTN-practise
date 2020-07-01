package com.klu.wtn.p2;

public class Ex4 {

	public static void main(String[] args)
	{
		int n=Integer.parseInt(args[0]);
		int t=n;
		int sum=0;
		while(n>0)
		{
			sum+=n%10;
			n=n/10;
		}
		System.out.println("The sum of the digits of "+t+" is "+sum);
	}
}
