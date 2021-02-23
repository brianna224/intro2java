/*****************************************************************************************
* NumberSum
******************************************************************************************
* The project is to write a program that determines if a number is modularly divisible by 
  11, 9, or 6 based on user's input or by randomly generating a 5-digit number.
* Brianna Patrick
* 02/19/21
* 255 003
*******************************************************************************************/
import java.util.Scanner;

public class NumberSum {
	public static void main(String[] args) {
		/********************
		* create a scanner
		*********************/
		Scanner input = new Scanner(System.in);
		
		/******************************************************************************
		* prompt user to either enter a 5-digit number or use a random number generator
		*******************************************************************************/
		System.out.println("Would you like to randomly enter a number (1) or enter it yourself (2).");
		
		int procedure = input.nextInt();
		
		int d1 = 0;
		int d2 = 0;
		int d3 = 0;
		int d4 = 0;
		int d5 = 0;
		int numberSum = 0;
		int result = 1;
		
		/*******************************************************************************************************************
		* a 5-digit random number is generated going through procedure 1(random number generator) or 2(user enters themself)
		********************************************************************************************************************/
		if(procedure == 1) {
			d1 = 1 + (int)(Math.random() * 10);
			d2 = (int)(Math.random() * 10);
			d3 = (int)(Math.random() * 10);
			d4 = (int)(Math.random() * 10);
			d5 = (int)(Math.random() * 10);
			
			System.out.println("" + d1 + d2 + d3 + d4 + d5);
			
			/************************************************************************************************
			* prompts user if they would like to see if the 5-digit random number is divisible by 11, 9 or 6
			*************************************************************************************************/
			System.out.println("Would you like to see if this number is divisible by 11, 9 or 6. Enter the number you would like to divide this number by.");
			int modNum = input.nextInt();
			
			/*****************
			* use number sum
			*****************/
			numberSum = (5 * d1 + 4 * d2 + 3 * d3 + 2 * d4 + 1 * d5);
			
			/*********************************************************************************************************************************
			* if user enters 6, 9, or 11 see if the 5-digit number is divisible by one of them and display if the number is divisible or not
			**********************************************************************************************************************************/
			if(modNum == 6) {
			result = numberSum % 6;
				if(result == 0)
				System.out.println("" + d1 + d2 + d3 + d4 + d5 + " is divisible by " + modNum + ".");
				else
				System.out.println("" + d1 + d2 + d3 + d4 + d5 + " is not divisible by " + modNum + ".");
			}
			else if(modNum == 9) {
			result = numberSum % 9;
				if(result == 0)
				System.out.println("" + d1 + d2 + d3 + d4 + d5 + " is divisible by " + modNum + ".");
				else
				System.out.println("" + d1 + d2 + d3 + d4 + d5 + " is not divisible by " + modNum + ".");
			}
			else if(modNum == 11) {
			result = numberSum % 11;
				if(result == 0)
				System.out.println("" + d1 + d2 + d3 + d4 + d5 + " is divisible by " + modNum + ".");
				else
				System.out.println("" + d1 + d2 + d3 + d4 + d5 + " is not divisible by " + modNum + ".");
			}
			else 
			System.out.println("incorrect input");
		}
		else if(procedure == 2) {
			System.out.println("Enter a 5-digit number.");
			
			int userNum = input.nextInt();
			
			if(userNum >= 10000 && userNum <= 99999) {
			d1=	userNum / 10000;
			d2= (userNum % 10000) / 1000;
			d3= (userNum % 1000) / 100;
			d4= (userNum % 100) / 10;
			d5= (userNum % 10);
			
			/************************************************************************************************
			* prompts user if they would like to see if the 5-digit random number is divisible by 11, 9 or 6
			*************************************************************************************************/
			System.out.println("Would you like to see if this number is divisible by 11, 9 or 6. Enter the number you would like to divide this number by.");
			int modNum = input.nextInt();
			
			/*****************
			* use number sum
			*****************/
			numberSum = (5 * d1 + 4 * d2 + 3 * d3 + 2 * d4 + 1 * d5);
			
			/*********************************************************************************************************************************
			* if user enters 6, 9, or 11 see if the 5-digit number is divisible by one of them and display if the number is divisible or not
			**********************************************************************************************************************************/
			if(modNum == 6) {
				result = numberSum % 6;
				if(result == 0)
				System.out.println("" + d1 + d2 + d3 + d4 + d5 + " is divisible by " + modNum + ".");
				else
				System.out.println("" + d1 + d2 + d3 + d4 + d5 + " is not divisible by " + modNum + ".");
			}
			else if(modNum == 9) {
				result = numberSum % 9;
				if(result == 0)
				System.out.println("" + d1 + d2 + d3 + d4 + d5 + " is divisible by " + modNum + ".");
				else
				System.out.println("" + d1 + d2 + d3 + d4 + d5 + " is not divisible by " + modNum + ".");
			}
			else if(modNum == 11) {
				result = numberSum % 11;
				if(result == 0)
				System.out.println("" + d1 + d2 + d3 + d4 + d5 + " is divisible by " + modNum + ".");
				else
				System.out.println("" + d1 + d2 + d3 + d4 + d5 + " is not divisible by " + modNum + ".");
			}
			else 
			System.out.println("incorrect input");
			}
			else 
				System.out.println("incorrect input");
		}
		else 		
			System.out.println("incorrect input");
	}
}
