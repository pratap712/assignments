package assignments;

import java.util.Arrays;

public class Assignment16_String2 {

	public static void main(String[] args) {


		/*
		 * Assignment: Write a program to search for all occurrences of a “Java” word in the paragraph and print their
			indexes.
			1. Divide into multiple words
			2. Find total number of occurrences
			3. Print count and Indexes of the word
		 * 
		 */
		
		String paragraph = "Java is a popular programming language. Java is used for webdevelopment, mobile applications, and more.";
		
		String words [] = paragraph.split(" ");
		String find = "Java";
		int count =0 ;
		int arr [] = new int [words.length];
		
		for(int i= 0 ;i<words.length;i++)
			if(find.equalsIgnoreCase(words[i].replaceAll("[^a-zA-Z]", ""))) {
				arr[count] = i;
				count++;
			}
		
		System.out.println("Total number of occurences for word '"+ find +"' are "+count +" there respective indexes are - "+ Arrays.toString(Arrays.copyOf(arr, count)));
		
		
	}

}
