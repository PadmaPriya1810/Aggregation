package Oops.Aggregation;

public class Sim {
	
	String service_provider;
	double price_per_min;
	double balance;
	
	Sim()
	{
		System.out.println("Buy a New Sim");
	}
	
	Sim(String service_provider,double price_per_min,double balance)
	{
		this.service_provider=service_provider;
		this.price_per_min=price_per_min;
		this.balance=balance;
	}
	
	public void detailsOfSim()
	{
		System.out.println("Service Provider : "+service_provider);
		System.out.println("Price Per Min :Rs. "+price_per_min);
		System.out.println("Balance :Rs. "+balance);
	}

}
