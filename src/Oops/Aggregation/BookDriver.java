package Oops.Aggregation;
//AGGREGATION & COMPOSITION
import java.util.Scanner;

public class BookDriver {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println(" Enter the Author Details ");
		System.out.println(" Author Name : ");
		String authorname=sc.nextLine();
		
		System.out.println(" Author Age : ");
		int age=sc.nextInt();
		
		Author author=new Author(authorname,age);
		
		System.out.println(" Enter the Author Address ");
		System.out.println("Door Number : ");
		int doorno=sc.nextInt();
		sc.nextLine();
		
		System.out.println("Street Name : ");
		String street=sc.nextLine();
		//sc.nextLine();
		
		System.out.println("City : " );
		String city=sc.nextLine();
		//sc.nextLine();
		
		System.out.println("State : ");
		String state=sc.nextLine();
		//sc.nextLine();
		
		System.out.println("Country : ");
		String country=sc.nextLine();
		
		
		author.addAuthorAddress(new Address(doorno,street,city,state,country));
		//author.detailsOfAuthor();
		
		
		System.out.println("Enter the Book Details ");
		System.out.println(" Enter the Book Name : ");
		String bookname=sc.nextLine();
		System.out.println(" Enter the Book Price : ");
		double price=sc.nextDouble();
		sc.nextLine();
		System.out.println(" Enter the Book Genre : ");
		String genre=sc.nextLine();
		//sc.nextLine();
		author.detailsOfAuthor();
		Book b=new Book(bookname,price,genre,author);
		b.detailsOfBook();
		
	}

}
