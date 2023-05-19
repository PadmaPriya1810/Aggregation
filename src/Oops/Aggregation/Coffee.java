package Oops.Aggregation;
//AGGREGATION (Dependant Class)

public class Coffee {
	
	//STATES-DATA MEMBERS
	String brand;
	String flavour;
	String quantity;
	double price;
	
	//CONSTRUCTORS
	Coffee()
	{
		
	}
	
	Coffee(String brand,String flavour,String quantity,double price)
	{
		this.brand=brand;
		this.flavour=flavour;
		this.quantity=quantity;
		this.price=price;
	}
	
	//BEHAVIOURS-FUNCTION MEMBERS
	public void detailsOfCoffee()
	{
		System.out.println("**** Details Of Coffee ****");
		System.out.println("Coffee Brand: "+brand);
		System.out.println("Flavour: "+flavour);
		System.out.println("Quantity: "+quantity);
		System.out.println("Price: "+price);
	}
	
}
