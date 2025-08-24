package assignments;

public class Assignment10_Array_Loops {

	
	private static int [] BubbleSort(int arr1[]) {
		
		for (int j = 0 ; j<arr1.length-1 ; j++  ) {
			
			for (int i = 0; i < arr1.length-1 ; i++ ) {
				if(arr1[i] > arr1[i+1]) {
					arr1[i] = arr1[i] + arr1[i+1];
					arr1[i+1]= arr1[i]-arr1[i+1];
					arr1[i] = arr1[i] - arr1[i+1];
				}
			}
		}
		
		
		return arr1;
	}
	
	public static void main(String[] args) {

		/*
		 * Given values are 12 ,34,11,36,87,98,93.
		 *	Store the values in Array and Print second and third largest number from the above values without
		 *	using collections and default sort methods
		 */
		
		int arr[] = {12 ,34,11,36,87,98,93};
		
		arr = Assignment10_Array_Loops.BubbleSort(arr);
		for(int x:arr)
		System.out.println(x);
	
		System.out.println("second and third largest number are - "+arr[arr.length-2]+" "+arr[arr.length-3] );
	
	}

}
