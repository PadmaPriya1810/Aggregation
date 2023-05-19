package Oops.Aggregation;
//AGGREGATION & COMPOSITION
public class Address {
	int doorno;
	String street;
	String city;
	String state;
	String country;
	
	Address()
	{
		
	}
	
	Address(int doorno,String street,String city,String state,String country)
	{
		this.doorno=doorno;
		this.street=street;
		this.city=city;
		this.state=state;
		this.country=country;
	}

	public void addressOfAuthor()
	{
		System.out.println("**** Author Address ****");
		System.out.println("Door Number :" +doorno);
		System.out.println("Street Name :" +street);
		System.out.println("City :" +city);
		System.out.println("State :" +state);
		System.out.println("Country : "+country);
	}
}
