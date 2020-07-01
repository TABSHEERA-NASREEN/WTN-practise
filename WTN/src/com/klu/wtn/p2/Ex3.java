package com.klu.wtn.p2;

public class Ex3 {

	public static void main(String[] args)
	{
		int n=Integer.parseInt(args[0]);
		int t=n;
		int sum=0;
		while(n>0)
		{
			int rem=n%10;
			sum=sum*10+rem;
			n=n/10;
		}
		if(t==sum)
			System.out.println(t+"is a Palindrome");
		else 
			System.out.println(t+"is Not a palindrome");
		
	}
}
