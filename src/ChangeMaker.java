package WeekTwoMonday;

import java.util.Scanner;

public class ChangeMaker {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Welcome to the Change Maker Calcuator");
		System.out.println("Plese enter amount change amount in cents");
		
		//Prompt user to enter cents 
		double cents = sc.nextDouble();
		
		
		//Get quarters
		cents = getQuarters(cents);
		//Get dimes
		cents = getDimes(cents);
		//Get nickels
		cents = getNickels(cents);
		//Get pennies
		cents = getPennies(cents);
		
			
		
	}
	
	public static double getQuarters(double cents)
	{
		double change = cents%25;
		double quarters = (cents - change) / 25;
		System.out.println ((int) quarters + "quarters");
		return change;
	}
	public static double getDimes(double cents)
	{
		double change = cents%10;
		double dimes = (cents - change) / 10;
		System.out.println ((int) dimes + "dimes");
		return change;
	}
	public static double getNickels(double cents)
	{
		double change = cents%5;
		double nickels = (cents - change) / 5;
		System.out.println ((int) nickels + "nickels");
		return change;
	}
	public static double getPennies(double cents)
	{
		double change = cents%1;
		double pennies= (cents - change) / 1;
		System.out.println ((int) pennies + "pennies");
		return change;
	}

}
