/********************************************************************************************
* Lab06
* write a program that will compute the sum of all the integers between 1 and user's number
* Brianna Patrick
* 03/03/21
* 255 003
********************************************************************************************/
import java.util.Scanner;
public class CountLoop {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		/******************************
		* Prompt user to enter a number
		******************************/
		System.out.print("Enter a number:");
		int userNum = input.nextInt();
		
		int n = 1;
		int sum = 0;
		
		/***********************************************************************
		* calculate the sum of integers from 1 to user's number using while loop
		************************************************************************/
		while(userNum >= 0 && n <= userNum) {
			sum += n;
			n++;
		}
		
		/***********************************************************
		* the sum is only print out if the user's number is positive
		************************************************************/
		if(userNum >= 0)
		System.out.println(sum);
	
		System.out.println(" ");
		
		sum = 0;
		
		/**********************************************************************
		* calculate the sum of integers from 1 to user's number using for loop
		**********************************************************************/
		for(n = 1; userNum >= 0 && n <= userNum; n++) {
			sum += n;
		}
		
		/***********************************************************
		* the sum is only print out if the user's number is positive
		************************************************************/
		if(userNum >= 0)
		System.out.println(sum);
	
		System.out.println(" ");
		
		n = 1;
		sum = 0;
		
		/**************************************************************************
		* calculate the sum of integers from 1 to user's number using do-while loop
		**************************************************************************/
		do {
			sum += n;
			n++;
		} while(userNum >= 0 && n <= userNum);
		
		/***********************************************************
		* the sum is only print out if the user's number is positive
		************************************************************/
		if(userNum >= 0)
		System.out.println(sum);
	
		System.out.println(" ");
	}
}
