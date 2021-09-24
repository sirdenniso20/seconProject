package question_4;

import java.util.Scanner;

public class temperatureConverter {

	public static void main(String[] args) {
		
		Scanner temp = new Scanner (System.in);
		
		System.out.print("Please Enter Temperature in Fahrenheit:");
		double tempConverter = temp.nextDouble();
		
		double celsius = (tempConverter-32)*5/9;
		
		System.out.println("The converted Fahrenheit temperature into Celsius is: 32"+celsius);
		

	}

}
