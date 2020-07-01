package com.klu.wtn.p4;

public class Stock {

	String stock_name;
	String Stock_symbol;
	double prev;
	double curr;
	Stock() {
	stock_name="abc";
	Stock_symbol="@";
	prev=1200;
	curr=1000;
	}
	double getChangePercentage()
	{
	double per=((prev-curr)/curr)*100;
	return per;
	}
	
	public static void main(String[] args) {
	Stock st=new Stock();
	double ans=st.getChangePercentage();
	System.out.println(ans);
	}

}
