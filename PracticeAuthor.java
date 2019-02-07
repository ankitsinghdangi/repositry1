package objectoriented.com;

public class PracticeAuthor {

	public static void main(String[]args) {
		Author a = new Author ("John","johncena@gmail.com",'m');
		
				
		Book b = new Book("Harry Potter",a, 9999.9, 1);
	b.setQuantity(1);
	System.out.println(b);
	}

}
