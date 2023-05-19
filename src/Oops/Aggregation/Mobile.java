package Oops.Aggregation;

import java.util.Scanner;

public class Mobile {
	static Scanner sc=new Scanner(System.in);
	String brand;
	double price;
	String colour;
	int camera;
	Sim s1;
	Sim s2;
	
	Mobile()
	{
		System.out.println("Buy a New Mobile");
	}
	
	Mobile(String brand,double price,String colour,int camera)
	{
		this.brand=brand;
		this.price=price;
		this.colour=colour;
		this.camera=camera;
	
	}
	
	public void detailsOfMobile()
	{
		System.out.println("Mobile Brand: "+brand);
		System.out.println("Mobile Price:Rs. "+price);
		System.out.println("Colour: "+colour);
		System.out.println("Number Of Camera: "+camera);
		s1.detailsOfSim();
		s2.detailsOfSim();
	}
	
	public void insertSim1(Sim s1)
	{
		if(this.s1==null)
		{
			this.s1=s1;
			System.out.println("New Sim1 Inserted");
		}
		else
		{
			System.out.println("Already has Sim1");
			System.out.println("Already Inserted Sim1 Details:");
			s1.detailsOfSim();
		}
	}
		public void insertSim2(Sim s2)
		{
			if(this.s2==null)
			{
				this.s2=s2;
				System.out.println("New Sim2 Inserted");
			}
			else
			{
				System.out.println("Already has Sim2");
				System.out.println("Already Inserted Sim2 Details:");
				s2.detailsOfSim();
			}
		
	}		
		
	public void callFromSim1(int min)
	{
		double price_to_pay;
		this.s1.price_per_min=s1.price_per_min;
		price_to_pay=min*s1.price_per_min;
		System.out.println("Price to Pay:Rs. "+price_to_pay);
		s1.balance=s1.balance-price_to_pay;
		System.out.println("Current Balance :Rs. "+s1.balance);
	}	
	
	public void callFromSim2(int min)
	{
		double price_to_pay;
		this.s2.price_per_min=s2.price_per_min;
		price_to_pay=min*s2.price_per_min;
		System.out.println("Price to Pay:Rs. "+price_to_pay);
		s2.balance=s2.balance-price_to_pay;
		System.out.println("Balance Amount:Rs. "+s2.balance);
	}	
}
