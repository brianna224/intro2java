/****************************************************************************************************************************************************
* CrazySigns
*****************************************************************************************************************************************************
* The project is to write a program that will compute the total cost for a sign based on its number of sides, length, area, and number of characters.
* Brianna Patrick
* 03/04/21
* 255 003
****************************************************************************************************************************************************/
import java.util.Scanner;

public class CrazySigns {
	public static void main(String[] args) {
		
	Scanner input = new Scanner(System.in);
	
	/*********************************
	* declare and initialize variables
	**********************************/
	double n = 0;
	double s = 0;
	double area = 0;
	double total = 0;
	double numChar = 0;
	int a;
	String answer;
	String answer1 = "no";
	
	do {
		/******************************************
		* prompt user to enter the number of sides
		*******************************************/
		System.out.println("Enter the number of sides to your polygon:");
		n = input.nextDouble();
		
		/*********************************************
		* prompt user to enter the length of each side
		**********************************************/
		System.out.println("Enter the length of each side:");
		s = input.nextDouble();
		
		/************************
		* calculate area of shape
		*************************/
		area = ((n * s * s) / (4 * Math.tan(Math.PI/n)));
		
		/*******************************************
		* prompt user to enter the string on the sign
		*******************************************/
		System.out.println("Enter the string you would like on your sign:");
		input.nextLine();
		String string = input.nextLine();
		
		/*********************************************
		* calculate the number of non-blank characters
		*********************************************/
		for(a = 0; a < string.length(); a++) {
		if(string.charAt(a) != ' ') 
				numChar++;
		}
		
		/****************************************************
		* calculate and output total cost of sign to console
		*****************************************************/
		total = ((2.78 * area) + (1.64 * numChar));
		System.out.printf("$%.2f%n", total);
		
		/********************************
		* prompt user enter no to exit
		********************************/
		System.out.println("Would you like to create another sign? Enter no to exit.");
		answer = input.next();
		
	} while(answer.compareToIgnoreCase(answer1) > 0 || answer.compareToIgnoreCase(answer1) < 0);
	}
}