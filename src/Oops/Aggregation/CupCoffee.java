package Oops.Aggregation;

import java.util.Scanner;

//CUP COFFEE DRIVER CLASS

public class CupCoffee {
	static Scanner sc=new Scanner(System.in);
	
public static void main(String[] args) {
		
	System.out.println("ENTER THE CUP DETAILS");
	System.out.println("Enter the Cup Brand:");
	String brand=sc.nextLine();
	
	System.out.println("Enter the Cup Colour:");
	String colour=sc.nextLine();
	
	System.out.println("Enter the Cup Size:");
	String size=sc.nextLine();
	
	
	System.out.println("Enter the Cup Price:");
	double price=sc.nextDouble();
	
	Cup c=new Cup(brand,colour,size,price);
	c.detailsOfCup();

	
	System.out.println("\n ENTER THE COFFEE DETAILS \n");
	System.out.println("Enter the Coffee Brand:");
	String coffbrand=sc.nextLine();
	sc.nextLine();
	
	System.out.println("Enter the Coffee Flavour:");
	String coffcolour=sc.nextLine();
	
	
	System.out.println("Enter the Coffee Quantity:");
	String coffqty=sc.nextLine();
	
	
	System.out.println("Enter the Coffee Price:");
	double coffprice=sc.nextDouble();
	
	c.pourCoffee(new Coffee(coffbrand,coffcolour,coffqty,coffprice));
	c.detailsOfCup();
	
	
}
}
