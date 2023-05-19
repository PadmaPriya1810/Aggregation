package Oops.Aggregation;
//AGGREGATION & COMPOSITION
public class Author {
	String authorname;
	int age;
	Address adrs;
	
	Author()
	{
		
	}
	Author(String authorname,int age)
	{
		this.authorname=authorname;
		this.age=age;
	}

	//HELPER METHOD
	public void addAuthorAddress(Address adrs)
	{
		if(this.adrs==null)
		{
			this.adrs=adrs;
			System.out.println("Author Address Added");
		}
		else
		{
			System.out.println("Author Address Already Printed");
		}
	}
	
	public void detailsOfAuthor()
	{
		System.out.println("*** Details Of Author ***");
		System.out.println(" Author Name : "+authorname);
		System.out.println(" Author Age : "+age);
		//If Author Address Present already Print Author Address
		
		//Else If Required use helper() -addAuthorAddress()
		if(this.adrs!=null)
		{
			adrs.addressOfAuthor(); // Can access Address Class
		}
	}
}
