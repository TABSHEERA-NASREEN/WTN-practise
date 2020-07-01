package com.klu.wtn.p7;

public class Demo {
	   public static void arrPrint(Integer[] arr) {
		      System.out.print("\nThe Integer array is: ");
		      for (Integer i : arr)
		         System.out.print(i + " ");
		   }
		   public static void arrPrint(Character[] arr) {
		      System.out.print("\nThe Character array is: ");
		      for (Character i : arr)
		         System.out.print(i + " ");
		   }
		   public static void arrPrint(String[] arr) {
		      System.out.print("\nThe String array is: ");
		      for (String i : arr)
		         System.out.print(i + " ");
		   }
		   public static void arrPrint(Double[] arr) {
		      System.out.print("\nThe Double array is: ");
		      for (Double i : arr)
		         System.out.print(i + " ");
		   }
		   public static void main(String args[]) {
		      Integer[] iarr = { 8, 1, 5, 3, 9 };
		      Character[] carr = { 'A', 'B', 'C', 'D', 'E' };
		      String[] sarr = { "Jane", "Amy", "John", "Tim", "Sara" };
		      Double[] darr = { 7.3, 5.9, 2.5, 3.7, 1.4 };
		      arrPrint(iarr);
		      arrPrint(carr);
		      arrPrint(sarr);
		      arrPrint(darr);
		   }
		}
