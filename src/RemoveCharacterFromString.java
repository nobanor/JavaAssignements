package WeekTwoMonday;

import java.util.Scanner;

public class RemoveCharacterFromString {

	public static void main(String[] args) 
	{
		// Write a method to remove a given character from a string.
		//E.g. remove all 'a' from Averange should return vernge
		Scanner sc = new Scanner (System.in);
		System.out.println("Please enter a word and a letter: ");
		
		String userInput = sc.next();
		String letterAsString = sc.next();
		char letter = letterAsString.charAt(0);
		
		String result = removeChar(userInput, letter);
		System.out.println(result);
		
		char [] word = {'A', 'v', 'e', 'r', 'a', 'n', 'g', 'e'};
		System.out.println(removeCharFromArray(word, 'a'));

	}
	
	//Write some method: 
	//modifier    => public static
	//return type => String 
	//method name => removeChar
	//Parameter   => String and char
	
	public static String removeChar(String word, char letter)
	{
		
		//1. we need to loop 
		//  from start to end of the word 
		//2. we need to make comparison if statements 
		//3. how do we remove char when found  
			//3.1 Don't add to the result string 
		
		String result ="";
		word = word.toLowerCase(); // word is not a parantheses because it is primitive type 
		letter = Character.toLowerCase(letter); // letter is in parentheses because it is a reference
		
		for (int i = 0; i < word.length(); i++) 
		{
			//2. we need to make comparison if statements 
			//3. how do we remove char when found  
				//3.1 Don't add to the result string 
			if (letter != word.charAt(i))
			{
				result = result + word.charAt(i);			
			}
			
		}			
		return result;
	}
	
	public static char [] removeCharFromArray(char [] word, char letter) 
	{
		letter = Character.toLowerCase(letter);

		String result = "";
		for (int i=0; i<word.length; i++)
		{
			char lowerCaseLetter = Character.toLowerCase(word[i]);
			if (letter != lowerCaseLetter)
			{
				result += word [i];
			}
		}
		
		return result.toCharArray();
	}
}
