package practice.arraylist;

import java.util.*;

public class ArrayListPractice {

	public static void main(String[] args) {
		Book b1 = new Book("21424", "Java Basic", "김하나", "Jean.kr", 15000, "Java 기본 문법");
		Book b2 = new Book("33455", "JDBC Pro", "김철수", "Jean.kr", 23000);
		Book b3 = new Book("55355", "Servlet/JSP", "박자바", "Jean.kr", 41000, "Model2 기반");
		Book b4 = new Book("35332", "Android App", "홍길동", "Jean.kr", 25000, "Lightweight Framework");
		Book b5 = new Book("35355", "OOAD 분석,설계", "소나무", "Jean.kr", 30000);
		
		Magazine m1 = new Magazine("35535", "Java World", "편집부", "Jean.kr", 7000, 2013, 2);
		Magazine m2 = new Magazine("33434", "Mobile World", "편집부", "Jean.kr", 8000, 2013, 3);
		Magazine m3 = new Magazine("75342", "Next Web", "편집부", "Jean.kr", 10000, "AJAX 소개", 2012, 10);
		Magazine m4 = new Magazine("76543", "Architecture", "편집부", "Jean.kr", 5000, "java 시스텝", 2010, 3);
		Magazine m5 = new Magazine("76534", "Data Modeling", "편집부", "Jean.kr", 14000, 2012, 12);
		
		List<Book> bookList = new ArrayList<Book>();
		bookList.add(b1);
		bookList.add(b2);
		bookList.add(b3);
		bookList.add(b4);
		bookList.add(b5);
		
		System.out.println("************************************ 도서목록 ************************************");
		for(int i = 0 ; i < bookList.size() ; i++) {
			System.out.println(bookList.get(i));
		}
		
		List<Magazine> megazineList = new ArrayList<Magazine>();
		megazineList.add(m1);
		megazineList.add(m2);
		megazineList.add(m3);
		megazineList.add(m4);
		megazineList.add(m5);
		
		System.out.println("************************************ 잡지목록 ************************************");
		for(int i = 0 ; i < megazineList.size() ; i++) {
			System.out.println(megazineList.get(i));
		}
		
	}

}
