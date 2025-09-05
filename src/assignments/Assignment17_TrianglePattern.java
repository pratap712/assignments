package assignments;

public class Assignment17_TrianglePattern {
	
	private static void drawTriangle(int n) {
		
			for(int i =1 ;i<n+1;i++)
				System.out.println("*".repeat(i));
	}

	public static void main(String[] args) {

			/*
			 * Assignment: Write a program to print * in triangle pattern
				1. If I will pass int rows = 5 then it should print triangle with 5 Rows
				*
				**
				***
				****
				*****
			 * 
			 */

		Assignment17_TrianglePattern.drawTriangle(7);		
		
	}

}
