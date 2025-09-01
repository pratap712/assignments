package language.basics;

import java.util.*;

public class ListPairsforSuminArray {

	public static List<List<Integer>> uniquePair(List<Integer> Li , int target){
	
		List<List<Integer>> L = new  ArrayList<List<Integer>>();
		
		for(Integer i=0; i < Li.size();i++) {
			for (Integer j = i+1  ;j<Li.size();j++) {
				if(Li.get(i) + Li.get(j) == target) {
					Integer max = Li.get(i) > Li.get(j) ? Li.get(i) : Li.get(j);
					Integer min = Li.get(i) < Li.get(j) ? Li.get(i) : Li.get(j);
					List<Integer> L1 = new  ArrayList<Integer>();
					L1.add(max);
					L1.add(min);
					if (!L.contains(L1))
						L.add(L1);
				}
			}
		}
		
		
		return L;
	}
	
	
	
	public static void main(String[] args) {
		/*
		 * "Design a method in Java that takes a list of integers and returns a list of all pairs
		 *  that sum up to a given target. Each pair should be unique, and order shouldn't matter."
		 * 
		 * 	 sample input - nums = [1, 2, 3, 4, 5, 6] target = 7
		 *   Output: [[1, 6], [2, 5], [3, 4]]
		 *   
		 */

			List<Integer> Li = new ArrayList<Integer>( Arrays.asList(1,1,1,1)); 
			int target = 2;
			
			List<List<Integer>> L = uniquePair(Li,target);
			System.out.println(L);
			
	}

}
