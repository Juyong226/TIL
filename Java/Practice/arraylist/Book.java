package practice.arraylist;

public class Book {
	private String isbn;
	private String title;
	private String author;
	private String publisher;
	private int price;
	private String desc;
	
	Book() {}
//	Book() {
//		this("", "", "", "", 0, "");
//	}
//	Book(String isbn) {
//		this(isbn, "", "", "", 0, "");
//	}
//	Book(String isbn, String title) {
//		this(isbn, title, "", "", 0, "");
//	}
//	Book(String isbn, String title, String author) {
//		this(isbn, title, author, "", 0, "");
//	}
//	Book(String isbn, String title, String author, String publisher) {
//		this(isbn, title, author, publisher, 0, "");
//	}
	Book(String isbn, String title, String author, String publisher, int price) {
		this(isbn, title, author, publisher, price, "");
	}
	Book(String isbn, String title, String author, String publisher, int price, String desc) {
		setIsbn(isbn);
		setTitle(title);
		setAuthor(author);
		setPublisher(publisher);
		setDesc(desc);
		setPrice(price);
	}
	
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		if(isbn != null) {
			this.isbn = isbn;
		} else {
			System.out.println("isbn을 입력하세요.");
		}
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		if(title != null) {
			this.title = title;
		} else {
			System.out.println("title을 입력하세요.");
		}
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		if(author != null) {
			this.author = author;
		} else {
			System.out.println("author를 입력하세요.");
		}
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		if(publisher != null) {
			this.publisher = publisher;
		} else {
			System.out.println("publisher를 입력하세요.");
		}
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		if(price >= 0) {
			//System.out.println("금액을 " + price + "원으로 입력합니다.");
			this.price = price;
		} else {
			System.out.println("금액은 0원 이상이어야 합니다.");
		}
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		if(desc != null) {
			this.desc = desc;
		} else {
			//System.out.println("desc를 생략합니다.");
			this.desc = "";
		}
	}
	
	@Override
	public String toString() {
		return isbn + "\t| " + title + "\t| " +  author + "\t| " + publisher +"\t| " + price 
				+ "\t| " + desc;
	}
}
