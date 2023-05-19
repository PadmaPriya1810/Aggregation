package Oops.Aggregation;
//AGGREGATION & COMPOSITION
public class Book {
	
	String bookname;
	double price;
	String genre;
	Author author;
	
	Book()
	{
		
	}
	
	Book(String bookname,double price,String genre,Author author)

	{
		this.bookname=bookname;
		this.price=price;
		this.genre=genre;
		this.author=author;
	}
	
	public void detailsOfBook()
	{
		System.out.println("*** Details Of Book ***");
		System.out.println(" Enter the Book Name : "+bookname);
		System.out.println(" Enter the Book Price : "+price);
		System.out.println(" Enter the Book Genre : "+genre);
		author.detailsOfAuthor();
	}
}
