package language.basics;

import java.util.*;

public class SecondLargestinList {

	public static void main(String[] args) {

		List<Integer> Li = new ArrayList<Integer>();
		Li.addAll(Arrays.asList(1,2,3,4,76,43,23,12,53,65,68,90));
		TreeSet<Integer> Hash = new TreeSet<Integer>(); // sorted order 
		Hash.addAll(Li);
		
		if (Hash.size() < 2 ) {
			System.out.println("enough elements are not present in array");
			return ;
		}
		
		System.out.println("unique values in ascending order "+ Hash);
		
		Iterator<Integer> I = Hash.descendingIterator();
		I.next();
		System.out.println("Second Largest integer is "+I.next());
		
	}

}
