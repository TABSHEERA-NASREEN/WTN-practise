package com.klu.wtn.p2;

public class Ex7 {

	public static void main(String[] args)
	{
		int n=Integer.parseInt(args[0]);
		int t=n;
		int sum=1;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}
}
