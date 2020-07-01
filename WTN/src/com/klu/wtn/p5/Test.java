package com.klu.wtn.p5;

public class Test {

	public static void main(String[] args) {
		Book b=new Book();
		b.setName("Java");
		b.setPrice(800);
		b.setQtyInStock(25);
		System.out.println("Book name "+b.getName()+"\n"+"Book price "+b.getPrice()+" \n"+"Author Name: "+b.getAuthor().name+"\n"+"Author email: "+b.getAuthor().email+"\n"+"Author Gendor: "+b.getAuthor().gender+"\n"+"In Stock "+b.getQtyInStock());
	}
}
