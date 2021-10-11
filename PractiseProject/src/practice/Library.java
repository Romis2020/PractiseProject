package practice;

import java.util.ArrayList;

class Book{
	 public String name, author;
	 
	 public Book(String name, String author) {
		 this.name = name;
		 this.author = author;
	 }
	 @Override 
	 public String toString() {
		 return "book{"+
				 	name + '\'' + 
				 	'}';
	 }
}

class MyLibrary{
	
	public ArrayList<Book> books;
	
	public MyLibrary(ArrayList<Book> books){
		this.books = books;
	}
	
	public void addBook(Book book) {
		System.out.println("The book has been added to the Library");
		this.books.add(book);
	}
	public void issueBook(Book book, String issued_to) {
		System.out.println("The book has been issued form the Library "+ issued_to);
		this.books.remove(book);
	}
	
	public void returnBook(Book b) {
		System.out.println("The book has been returned");
		this.books.add(b);
	}
	
}
public class Library {

	public static void main(String[] args) {
		ArrayList<Book> bk = new ArrayList<>();
		Book b1 = new Book("A Commentary and Digest on The Air, Act 1981", "Apoorva Kumar Singh");
		bk.add(b1);
		Book b2 = new Book("The Bloomsbury Anthology of Great Indian Poems", "Abhay K.");
		bk.add(b2);
		Book b3 = new Book("Karmayoddha Granth", "Amit Shah");
		bk.add(b3);
		Book b4 = new Book("Politics of Opportunism", "R P N Singh");
		bk.add(b4);
		Book b5 = new Book("Celestial Bodies", "Jokha Alharthi");
		bk.add(b5);
		Book b6 = new Book("The Testaments", "Margaret Atwood");
		bk.add(b6);
		Book b7 = new Book("The Overstory", "Richard Powers");
		bk.add(b7);
		Book b8 = new Book("The Braille edition of the book Exam Warriors", "PM Narendra Modi");
		bk.add(b8);
		Book b9 = new Book("Mind-Master", "Viswanathan Anand and Susan Ninan");
		bk.add(b9);
		
		MyLibrary l = new MyLibrary(bk);
		
		l.addBook(new Book("algo4", "myAuthor"));
		
		System.out.println(l.books);
		l.issueBook(b4, "By Rohit");
		System.out.println(l.books);
		
		
	}

}


