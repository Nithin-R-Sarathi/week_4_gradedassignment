package com.driver.gl;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import utilities.Book;
public class BookStore {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Book> books=new ArrayList<Book>();//ArrayList contains all books.
		Book book1=new Book("Think and grow Rich", "Self-Help");
		book1.setId(1);book1.setPrice(500);
		Book book2=new Book("Getting things done", "Self-Help");
		book2.setId(2);book2.setPrice(350 );
		Book book3=new Book("Wings of Fire", "Horror");
		book3.setId(3);book3.setPrice(1000);
		Book book4=new Book("Can't hurt me", "Motivational ");
		book4.setId(4);book4.setPrice(2000);
		Book book5=new Book("The Savior", "Romance");
		book5.setId(5);book5.setPrice(200);
		Book book6=new Book("Carrie", "Autobiography");
		book6.setId(6);book6.setPrice(250);
		Book book7=new Book("The Martian", "Autobiography");
		book7.setId(7);book7.setPrice(250);
		Book book8=new Book("Gandhi", "Sci-Fi");
		book8.setId(8);book8.setPrice(1000);
		Book book9=new Book("Animal Farm ", "Political Satire");
		book9.setId(9);book9.setPrice(200);
		Book book10=new Book("To Kill a Mockingbir", "Classics");
		book10.setId(10);book10.setPrice(200);
		books.add(book1);
		books.add(book2);
		books.add(book3);
		books.add(book4);
		books.add(book5);
		books.add(book6);
		books.add(book7);
		books.add(book8);
		books.add(book9);
		books.add(book10);
		books.forEach(
				(book)->System.out.println("Id->"+book.getId()+" Name->"+book.getName()+
				" Price->"+book.getPrice()+" Genre->"+book.getGenre()));
		
		double averagePrice=(books.stream().mapToDouble((eachBook)-> eachBook.getPrice()).sum())/
				(books.stream().count());
		System.out.println("\nThe average price of all the books in bookstore is --> "+averagePrice);
		
		System.out.println("\nTotal number of books in library is --> "+books.size());
		
		List<String>namesStartsWith= books.stream().filter(s->s.getGenre().equals
				("Autobiography")).map(s->s.getName()).collect(Collectors.toList());
		
		System.out.println("\nAutobiographies -->"+namesStartsWith);
		
		long distinctChars =books.stream().map(Book::getGenre).distinct().count();
		System.out.println("\ncount of distinct genre is --> "+distinctChars);
		}
	}