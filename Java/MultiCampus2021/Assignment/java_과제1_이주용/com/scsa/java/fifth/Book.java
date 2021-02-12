package com.scsa.java.fifth;

public class Book {
	String isbn;
	String title;
	String author;
	String publisher;	
	String desc = "";
	int price;
	
	Book() {}
	
	@Override
	public String toString() {
		return isbn + "\t| " + title + "\t| " +  author + "\t| " + publisher +"\t| " + price 
				+ "\t| " + desc;
	}
}
