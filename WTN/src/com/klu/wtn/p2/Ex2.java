package com.klu.wtn.p2;

public class Ex2 {

	
		public static void main(String[] args)
		{
			int n=Integer.parseInt(args[0]);
			if(n<2)
				System.out.println(n+"is neither prime nor composite number");
		    int f=0;
			if(n==2)
				f=0;
			else if(n>2)
			{
				int c=0;
				for(int i=2;i<=Math.sqrt(n);i++)
				{
					if(n%i==0)
					{
						c++;
					}
					if(c>0)
					{
						f=1;
						break;
					}
				}
			}
			else
				f=1;
			if(f==0)
				System.out.println(n+" is a Prime number");
			else
				System.out.println(n+" is not a Prime number");
			
		}
}
