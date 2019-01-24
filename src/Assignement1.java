/*
1. Write a method to prompt the user to enter the radius of the circle 
	then calculate the area and circumference of the circle.
   
2. Write a method to prompt the user for base-width and height of a triangle,
   then calculate the area of the Triangle.
   
3. Write a method to prompt the user for a number then display check if the number is Even or Odd.
   https://docs.oracle.com/javase/tutorial/java/nutsandbolts/if.html  
   
4. Write a method to prompt the user for an Integer then display the same value with one decimal place. 
   e.g., user enter "15 " result is: "You entered 15, the new value is 15.0".
   
5. Write a method to prompt the user for a letter of the alphabet and display it's numerical value. 
	
6. Write a method to prompt the user for a double then display the value as a whole number. 
	
   e.g., user enter "15.8" result is:  "You entered 15.8, the new value is 16".
   e.g., user enter "15.4" result is:  "You entered 15.4, the new value is 15".
   
7. Write a method to prompt the user for 4 digits representing a year. 
   Then determine If Year Is a Leap Year.
   */

package WeekOne;

import java.util.Scanner;

public class Assignement1 {

	public static void main(String[] args) {
		final double PI  = 3.14159;
		
		Scanner in = new Scanner (System.in);
		
		calculateCircumsferenceOfTheCircle (PI, in);
		calculateAreaOfTheTriange(in);
		getEvenOrOdd(in);
		castIntToDouble(in);
		convertCharToNumerical(in);
		roundDecimalToWhole(in);
		findLeapYear(in);
		
		

	}
	
public static void calculateCircumsferenceOfTheCircle (final double PI, Scanner in) {
			
			//Prompt user to enter radius
		System.out.println("Please enter radius of the circle to compute area");
			
		double radius = in.nextDouble();
		double area = radius * radius * PI;
			
		System.out.println("The area for the circle with radius of " + radius + " is " + area);
	}

public static void calculateAreaOfTheTriange (Scanner in) {
		
		System.out.println("");
		System.out.println("Hello. This program will compute area of the triangle. ");
		
		System.out.println("Please enter base-width of the triangle");
		double base = in.nextDouble();
		
		System.out.println("Please enter height of a triangle");
		double height = in.nextDouble();

		double area = (base * height) / 2;
		
		System.out.println("The are of the triangle where base is " + base + " and height is " + height + " is equal to " + area +".");
		
	}
public static void getEvenOrOdd (Scanner in) {
	
		System.out.println("");
		System.out.println("Please enter a number to determine if it is even or odd ");
		
		int number = in.nextInt();
		
		if (number % 2 == 0) {
			System.out.println("Your number is even");
		}
		else {
			System.out.println("Your number is odd");
		}
	}
	
public static void castIntToDouble (Scanner in) {
	
		System.out.println("");
		System.out.println("Please enter a whole number: ");
		
		int a = in.nextInt();
		double b  = (double) a;
		
		System.out.println("Your number converted to decimal: " + b);
	}
	
public static void convertCharToNumerical (Scanner in) {
		
		System.out.println("");
		//Prompt user to enter letter that will be converted to numerical
		System.out.println("Please enter letter from the alphabet to display it's numberical value"); 
		
		
		char character = in.next().charAt(0);
		int numerical = (int) character;
		
		System.out.println("Corresponding numerical value to charachter entered is " + numerical);
	}
	
public static void roundDecimalToWhole(Scanner in) {
		System.out.println("");
		System.out.println("Please enter a decimal number to be converted into whole number: ");
		
		double number = in.nextDouble();
		
		int numberTruncated = (int) number;

		if(number - numberTruncated >= 0.5) {
			
		numberTruncated++;
		}
		
		System.out.println();	
		System.out.println("The decimal value " + number + " rounded to the nearest whole number is equal to " + numberTruncated);
		System.out.println();
	}
	
public static void findLeapYear (Scanner in) {
		System.out.println("");
		System.out.println("Please enter a year to determine if it is a leap year");
		
		int theYear = in.nextInt();
		
		if (theYear < 100) {
			if (theYear > 40) {
				theYear = theYear + 1900;
			}	
			else {
				theYear = theYear + 2000;
			}
		}

		if (theYear % 4 == 0) {
			if (theYear % 100 != 0) {
				System.out.println("IT IS A LEAP YEAR");

			} else if (theYear % 400 == 0) {
				System.out.println("IT IS A LEAP YEAR");
		     
			} else {
		        System.out.println("IT IS NOT A LEAP YEAR");
		     
				}
			} else {
				System.out.println("IT IS NOT A LEAP YEAR");	   
				}
		
		}

}
