package objectoriented.com;

public class Book {

	private String name;
	private Author author ;
	private double price;
	private int quantity;
	
	public Book(String name,Author author, double price,int quantity) {
		this.name = name;
		this.author = author;
		this.price = price;
		this.quantity = quantity;
		
	}

	

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getName() {
		return name;
	}

	public Author getAuthor() {
		return author;
	}

	public double getPrice() {
		return price;
	}

	@Override
	public String toString() {
		return "Book [name=" + name + ", author=" + author + ", price=" + price + ", quantity=" + quantity + "]";
	}

	
}
