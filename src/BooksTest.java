
public class BooksTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Books book1=new Books("Pitch",2007,86557,20);
		System.out.println(book1.BookAuthor);
		
		Books book2=new Books("Dedication",2006,99485,25);
		System.out.println(book2.BookAuthor);
		
		book2.BookAuthor="Back To Sleep";
		System.out.println(book2.BookAuthor);
		
	}

}
