package assignments;

public class Assignment11_Loops_Array {

	
	static void printPyramid(int num) {
		
		
		// first half of pyramid
		for (int j = 1 ; j<=num;j++) {
		
			// print spaces 
			for(int i=0;i<num-j;i++) {
				System.out.print(" ");
			}
			
			for(int i = 1 ; i<=j;i++) {
				// print number
				System.out.print(i);
				if(i+1<=j) 
					// print space in between if there are multiple entries 
					System.out.print(" ");
			}
			 
			System.out.print("\n");
			
		}
		
		
		//second half of pyramid
		for (int j = num-1 ; j>0;j--) {
			
			// print spaces 
			for(int i=0;i<num-j;i++) {
				System.out.print(" ");
			}
			
			for(int i = 1 ; i<=j;i++) {
				System.out.print(i);
				if(i+1<=j) 
					System.out.print(" ");
			}
			 
			System.out.print("\n");
			
		}		
		
	}
	
	public static void main(String[] args) {
		
		/*
		 * Print the numbers in diamond-shaped pyramid of numbers.
		 * Pattern should be as below.
		 */
		
		Assignment11_Loops_Array.printPyramid(5);
		
		
	}

}
