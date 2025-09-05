package language.basics;

import java.util.Arrays;

public class Temp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			String s = "%2000";
			System.out.println(s.replaceAll(".[0-9.0-9]", ""));
		
			int arr[] = {1,2,3};

	        // add your code here
	        int d = 2;
	        
	        int arr1 []  = new int [d]; 
	        int j =0;
	        
	        for (int i =0 ;i <arr.length ; i++ ){
	            
	        	if(i<d)
	            	arr1[i] = arr[i];
	                
	            if(i+d<arr.length) {
	                arr[i] = arr[i+d];   
	            }else{
	                arr[i] = arr1[j];
	                j++;
	            }
	        }
	        
	        
	    
		        
		System.out.println(Arrays.toString(arr));
	}

}
