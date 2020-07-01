package com.klu.wtn.p2;

public class Ex6 {

	public static void main(String[] args)
	{
		int n=Integer.parseInt(args[0]);
		int t=n;
		int sum=1;
		for(int i=1;i<=n;i++)
		{
			sum=sum*i;
		}
		System.out.println("The factorial of the number of "+t+" is "+sum);
	}
}
