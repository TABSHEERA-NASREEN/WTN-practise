package com.klu.wtn.p9;

public class TestGeneralBank {
 
	public static void main(String[] args) 
	{
		KotMBank kot=new KotMBank();
		ICICIBank icici=new ICICIBank();
		GeneralBank kotg=new KotMBank();
		GeneralBank icicig=new ICICIBank();
		System.out.println(kot.getFixedInterestRate()+" "+kot.getSavingInterestRate());
		System.out.println(icici.getFixedInterestRate()+" "+icici.getSavingInterestRate());
		System.out.println(kotg.getFixedInterestRate()+" "+kotg.getSavingInterestRate());
	}
}
