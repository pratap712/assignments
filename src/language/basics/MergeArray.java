package language.basics;

import java.util.Arrays;

public class MergeArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Suppose there are 2 arrays having integers. 
		 * Create array number 3 which have all elements from array 1 and array 2. there is 1 condition that you can use for loop only once while solving problem
			Input : arr1 : {1,2,3,4, 5} & arr2 : {6,7,8,9,10}
			Output : arr3 : {1,2,3,4, 5, 6,7,8,9,10}
		 */
		
		int arr1  []=  {1,2,3,4, 5};
		int arr2 [] = {6,7,8,9,10};
		
		int arr3 [] = new int [(arr1.length + arr2.length)];
		
		for (int i=0; i < (arr1.length + arr2.length) ; i++)
			if(i<arr1.length)
				arr3[i] = arr1[i];
			else
				arr3[i] = arr2[i-arr1.length];
		
		System.out.println(Arrays.toString(arr3));
	}

}
