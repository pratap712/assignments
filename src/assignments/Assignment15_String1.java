package assignments;

import java.util.function.*;

public class Assignment15_String1 {

	public static void main(String[] args) {
		/*
		 * Assignment: Write a program to perform the following tasks:
			1. Count the total number of words in the sentence.
			2. Print the sentence words in reverse order.
			3. Convert the first character of each word to uppercase and print original sentence
		 * 
		 */

		String sentence = "Java programming is fun and challenging";
		
		// count no of words in string
		System.out.println("Number of wordsin string are - "+sentence.strip().split(" ").length);
		
		//print words in reverse order 
		String arr [] = sentence.split(" ");
		String reverse  = "";
		for(int i =arr.length-1 ; i>= 0; i--) {
			if(i == arr.length-1 )
				reverse = arr[i];
			else	
				reverse = reverse+" "+arr[i];
		}
		
		System.out.println(reverse);
			
		//convert first character of each word in upper case
		String Ustring = "";
		Function<String, String> p = (x) -> x.toUpperCase().charAt(0)+x.substring(1,x.length());
		for(String x :arr) {
			if (Ustring.isEmpty())
				Ustring = p.apply(x);
			else
				Ustring = Ustring +" "+ p.apply(x);
		}
		
		System.out.println(Ustring);
		
	}

}
