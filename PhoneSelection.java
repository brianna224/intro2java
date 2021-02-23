/****************************************************************************************************************************
* PhoneSelection
*****************************************************************************************************************************
* The lab is to create a program that takes as input a single letter and displays the corresponding digit on the telephone.
* Brianna Patrick
* 02/17/21
* 255 003
****************************************************************************************************************************/
import java.util.Scanner;

public class PhoneSelection {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		/**************************************
		* prompt user to enter a single letter
		***************************************/
		System.out.println("Enter a single letter, and I will tell you what the corresponding digit is on the telephone");
		
		char letter = input.next().charAt(0);
		
		char letter1 = Character.toUpperCase(letter);
		
		/***********************************************************************************
		* output the corresponding digit to the user's letter using multiple if statements
		***********************************************************************************/
		if(letter1 == 'A' || letter1 == 'B' || letter1 == 'C')
			System.out.println("The digit 2 corresponds to the letter " + letter1 + " on the telephone.");
		else if(letter1 == 'D' || letter1 == 'E' || letter1 == 'F')
				System.out.println("The digit 3 corresponds to the letter " + letter1 + " on the telephone.");
		else if(letter1 == 'G' || letter1 == 'H' || letter1 == 'I')
				System.out.println("The digit 4 corresponds to the letter " + letter1 + " on the telephone.");
		else if(letter1 == 'J' || letter1 == 'K' || letter1 == 'L')
				System.out.println("The digit 5 corresponds to the letter " + letter1 + " on the telephone.");
		else if(letter1 == 'M' || letter1 == 'N' || letter1 == 'O')
				System.out.println("The digit 6 corresponds to the letter " + letter1 + " on the telephone.");
		else if(letter1 == 'P' || letter1 == 'Q' || letter1 == 'R' || letter1 == 'S')
				System.out.println("The digit 7 corresponds to the letter " + letter1 + " on the telephone.");
		else if(letter1 == 'T' || letter1 == 'U' || letter1 == 'V')
				System.out.println("The digit 8 corresponds to the letter " + letter1 + " on the telephone.");
		else if (letter1 == 'W' || letter1 == 'X' || letter1 == 'Y' || letter1 == 'Z')
				System.out.println("The digit 9 corresponds to the letter " + letter1 + " on the telephone.");	
		/********************************************************************************
		* display that there is no matching digit when non-alphabetic charcter is entered
		*********************************************************************************/
		else
			System.out.println("No matching digit.");
		
	}
}