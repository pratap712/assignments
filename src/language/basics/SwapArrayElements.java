package language.basics;

import java.util.Arrays;

public class SwapArrayElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Swap immediate elements in array
		 *	Input : array : {18,45, 7,10,5}
		 *	Output : array :{45,18,10,7,5}
		 */
		
		int arr [] = {18,45, 7,10,5};
		
		for(int i=0; i<arr.length;i++) {
		
			// swap number without third variable when i is odd
			if (i%2 !=0) { 
				arr[i-1] = arr[i]+arr[i-1];
				arr[i] = arr[i-1] - arr[i];
				arr[i-1]= arr[i-1]-arr[i]; 
			}	
			
		}
		
		System.out.println(Arrays.toString(arr));
		
	}

}
