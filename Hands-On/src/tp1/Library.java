package tp1;

import java.util.ArrayList;

public class Library {
	
	Boolean Open_Closed ;
	
	
	    public ArrayList<Book> books = new ArrayList<>();

	    public Library() {
	        this.books = new ArrayList<>();
	    }

	    public void addBook(Book book) {
	        books.add(book);
	    }

	    public void removeBook(Book book) {
	        books.remove(book);
	    }

	    public void DisplayBooks() {
	    	for (Book book : books) {
	    	    System.out.println(book.Title);
	    	}
	    }
	

}
