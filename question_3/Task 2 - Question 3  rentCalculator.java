package question_3;

import java.util.Scanner;

public class rentCalculator {

	public static void main(String[] args) {


	
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter your monthly rent:    ");
		double monthlyRent =  sc.nextDouble();
			
		
		System.out.print("Enter your Water bill amount:");
		double waterBillFee = sc.nextDouble();
			
			
		System.out.print("Enter your Parking Fee:       ");
		double parkingFee = sc.nextDouble();
			
		System.out.println();
			
		double totalMonthlyRent = monthlyRent+waterBillFee+parkingFee;
   
			System.out.println("Your Total Monthly Rent is:  "+ totalMonthlyRent);
			sc.close();	
	} 
		
	
	}


