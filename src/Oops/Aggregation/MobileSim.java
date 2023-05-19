package Oops.Aggregation;

import java.util.Scanner;

public class MobileSim {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		
		System.out.println("ENTER THE MOBILE DETAILS");
		System.out.println(" Enter the Mobile Brand: ");
		String brand=sc.nextLine();
		
		System.out.println(" Enter the Mobile Price:Rs. ");
		double price=sc.nextDouble();
		System.out.println(" Enter the Mobile Colour: ");
		String colour=sc.next();
		System.out.println(" Enter the Number Of Camera: ");
		int camera=sc.nextInt();
		sc.nextLine();
		Mobile m=new Mobile(brand,price,colour,camera);
		
		System.out.println("ENTER THE SIM1 DETAILS");
		
		System.out.println(" Enter the Service Provider: ");
		String serviceprovider1=sc.nextLine();
		
		System.out.println(" Enter the Call Price Per Minute:Rs. ");
		double sim1_price_per_min=sc.nextDouble();
		
		
		System.out.println(" Enter the Balance:Rs. ");
		double sim1_balance=sc.nextDouble();
		
		
		Sim s1=new Sim(serviceprovider1,sim1_price_per_min,sim1_balance);
		
		
		System.out.println("ENTER THE SIM2 DETAILS");
		
		System.out.println(" Enter the Service Provider: ");
		String serviceprovider2=sc.nextLine();
		sc.nextLine();
		System.out.println(" Enter the Call Price Per Minute:Rs. ");
		double sim2_price_per_min=sc.nextDouble();
		
		System.out.println(" Enter the Balance:Rs. ");
		double sim2_balance=sc.nextDouble();
		
		Sim s2=new Sim(serviceprovider2,sim2_price_per_min,sim2_balance);
		
		System.out.println("*** SIM1 ***");
		s1.detailsOfSim();
		System.out.println("*** SIM1 ***");
		s2.detailsOfSim();
		
		m.insertSim1(s1);
		m.insertSim2(s2);
		
		System.out.println("Select SIM To Call:\n 1.SIM1 \n 2.SIM2\n ");
		
		int choice=sc.nextInt();
		
		switch(choice)
		{
		case 1:
		{
			System.out.println("Enter How Many Minutes: ");
			int min=sc.nextInt();
			m.callFromSim1(min);
		}
		break;
		
		case 2:
		{
			System.out.println("Enter How Many Minutes: ");
			int min=sc.nextInt();
			m.callFromSim2(min);
		}
		break;
		
		default:
		{
			System.out.println("Invalid choice");
		}
	}
	

	}
}

