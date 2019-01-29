/*Write a program to convert every even position to upper case and every odd position to 
lower case. eg input "Banana" output :"bAnAnA" or input "StLouis" output:"sTlOuIs"*/

package weekOneFriday;

import java.util.Scanner;

public class UppercaseAndLowercase {

	public static void main(String[] args) 
	{
		System.out.println("Enter a word ");
		Scanner in = new Scanner (System.in);
		
		String Str = in.nextLine();
		
		String newStr = "";
		
		for (int i = 0; i < Str.length(); i++) 
		{
			
			if (i% 2 == 0) 
			{
				newStr += Str.toLowerCase().charAt(i);
			}
			else 
			{
				newStr += Str.toUpperCase().charAt(i);
			}
			
		}
		System.out.println(newStr);
	}

}
