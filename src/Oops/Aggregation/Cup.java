package Oops.Aggregation;
//NORMAL CLASS

public class Cup {
	
//STATES-DATA MEMBERS
	String brand;
	String colour;
	String size;
	double price;
	
	Coffee coff; 
	
//	CONSTRUCTORS
	Cup()
	{
		
	}

	Cup(String brand,String colour,String size,double price)
	{
		this.brand=brand;
		this.colour=colour;
		this.size=size;
		this.price=price;
	}
	
//BEHAVIOURS-FUNCTION MEMBERS
	public void detailsOfCup()
	{
		System.out.println("Cup Brand: " +brand);
		System.out.println("Cup Colour: " +colour);
		System.out.println("Cup Size: " +size);
		System.out.println("Cup Price: " +price);
		
		if(this.coff!=null)
		{
			coff.detailsOfCoffee();
		}
		
	}
	
//HELPER METHOD
	public void pourCoffee(Coffee coff)
	{
		if(this.coff==null)
		{
			this.coff=coff;
			System.out.println("Pour Coffee into the Cup");
		}
		else
			System.out.println("Coffee is Already Poured");
	}
}