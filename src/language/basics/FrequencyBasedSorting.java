package language.basics;

import java.util.*;

public class FrequencyBasedSorting {

	
	public static List<Integer> FreqSort(List<Integer> Li ){
		
		List <Integer> L = new ArrayList <Integer>();
		
		if ( Li.size() == 0) {
			System.out.println("Invalid Input List is Empty ");
			return L;
		}
		
		TreeMap<Integer,Integer> Map = new TreeMap <Integer,Integer>();
		
		// find frequency of each element
		for(Integer x : Li) {
			if (Map.containsKey(x))
				Map.replace(x, Map.get(x)+1);
			else
				Map.put(x,1);
		}
		System.out.println(Map);
		
		// Arrange Elements according to there frequency
		TreeMap<Integer,String> MapFreq = new TreeMap <Integer,String>();
		
		for (Integer x : Map.keySet()) {
			
			if (MapFreq.containsKey(Map.get(x))) {
				MapFreq.replace(Map.get(x), MapFreq.get(Map.get(x)) +","+ Integer.toString(x));
			}else
				MapFreq.put(Map.get(x), Integer.toString(x));
	
		}
		System.out.println(MapFreq);
		
		// create a list
		for(Integer x :MapFreq.descendingKeySet()) {
			String arr[] = MapFreq.get(x).split(",");
			for (String z:arr) {
				for (Integer i = x ; i>0 ;i--)
					L.add(Integer.parseInt(z));
			}
		}
		
		return L;

	}
	
	public static void main(String[] args) {
		
		/*
		 * "Given a list of integers, return a new list sorted by frequency of each number in descending order. 
		 * If two numbers have the same frequency, sort them by their value in ascending order."
		 * 
		 * sample input out put
		 * i/p -> [4, 5, 6, 5, 4, 3]
		 * o/p -> Output: [4, 4, 5, 5, 3, 6]
		 */

		List <Integer> Li = new ArrayList<Integer>(Arrays.asList(1, 2, 2, 3, 3, 4));
		System.out.println(FreqSort(Li));
		
		
	}

}
