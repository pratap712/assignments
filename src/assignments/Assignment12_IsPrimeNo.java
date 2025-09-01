package assignments;

import java.io.*;

public class Assignment12_IsPrimeNo {
	
	
	public static boolean isPrime(int No) {	
		
		if (No < 2 ) 
			return false;
		
		if(No==2)
			return true;
		
		if (No % 2 ==0)
			return false;


		for(int i = 3 ; i< No/2 ;i += 2) {
			if(No % i == 0)
				return false;
		}
		
		return true;
		
	}

	public static void main(String[] args) throws Exception {
		
		// Given a number n, determine whether it is a prime number or not. A prime number is a
		// number greater than 1 that has no positive divisors other than 1 and itself.

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		int No = Integer.parseInt(s);
		
		System.out.println(isPrime(No));

		
	}

}
