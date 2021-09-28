/********************************************************************************************
* Lab06
* write a program that will output two triangles consisting of astericks using nested loop
* Brianna Patrick
* 03/03/21
* 255 003
*********************************************************************************************/
public class NestedLoopTriangle {
	public static void main(String[] args) {
	
	/**************************************************************
	* j and a determine the number of astericks printed on each row
	* n is number of row
	**************************************************************/
		int j = 0;
		int b;
		for(int n = 0; n < 10; n++) {
			for(int a = 0; a <= j; a++) {
				System.out.print("*");
			}
			j += 2;
			System.out.print("\n");
		}
		
	/*******************************************************
	* print second triangle
	* b determines the leading spaces printed for each row
	********************************************************/
		j = 0;
		for(int n = 0; n < 10; n++) {
			for(b = 0; b < 10 - n; b++) {
				System.out.print(" ");
			}
			for(int a = 0; a <= j; a++) {
				System.out.print("*");
			}
			j += 2;
			System.out.print("\n");
		}
	} 	
}