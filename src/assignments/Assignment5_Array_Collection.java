package assignments;

import java.util.*;

public class Assignment5_Array_Collection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//1. Create Lists with area of top 5 largest cities. Print the total area of the 3rd and 4th
		//cities combined.
		
		List <Double> AreaOfCity = new LinkedList<Double>();
		AreaOfCity.add(5500.25);
		AreaOfCity.add(5000.05);
		AreaOfCity.add(3500.00);
		AreaOfCity.add(3000.5);
		AreaOfCity.add(1000.25);		
		System.out.println("Total Area of 3rd and 4th city is : "+(AreaOfCity.get(2)+AreaOfCity.get(3)));
		
		//2. Create a set of the top 10 most visited tourist attractions in the world and print out all
		// of them and its size.
		
		Set <String> touristDest = new HashSet<String>();
		touristDest.add("Taj Mahal");
		touristDest.add("Great Wall of China");
		touristDest.add("Pyramids of Giza");
		touristDest.add("Niagra Falls");
		touristDest.add("Eiffel Towers");
		touristDest.add("Statue of Liberty");
		touristDest.add("Statue of Unity");
		touristDest.add("Northern Lights");
		touristDest.add("Golden Temple");
		touristDest.add("Hanging Garden");
		
		System.out.println("Printing all tourist attractions in Set ...\n"+touristDest.toString());
		System.out.println("size of Set - "+touristDest.size());
		
		//3. Create an array of 10 numbers (any 10 numbers) and print out the Average of 5th and
		// 6th Value.
		
		int arr[] = {23,33,44,55,66,12,33,52,64,67};
		System.out.println("Average of 5th and 6th value of array is "+ (arr[4]+arr[5])/2); //66+12 / 2
		
		//4. Create a list of the top 5 highest-grossing movies of all time and print out the third
		//movie on the list.
		
		List  <String> movieList = new ArrayList<String>();
		movieList.add("Dangal");
		movieList.add("Bahubali");
		movieList.add("Pushpa");
		movieList.add("KGF");
		movieList.add("Jawan");
		
		System.out.println("3rd Movie in list is "+movieList.get(2));
		
	}

}
