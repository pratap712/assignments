package language.basics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SecondLargestEfficientSol {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> Li = new ArrayList<Integer>();
		Li.addAll(Arrays.asList(1,2,3,4,76,43,23,12,53,65,68,90));
		
		int max =Integer.MIN_VALUE;
		int secondMax = Integer.MIN_VALUE;
		
		if(Li.size() < 2) {
			System.out.println("List has only 1 element - Second max cannot be found ");
			return ;
		}
		
		boolean bSecondmaxFound = false;
		
		for(Integer x: Li) {
			
			if(x > max)
				max = x;
			
			if (secondMax < x && secondMax < max && x != max) {
				secondMax =x;
				bSecondmaxFound = true;
			}
			
		}
		
		if (!bSecondmaxFound)
			System.out.println("No second max found in supplied array");
		else {
			System.out.println("MAX value in Array - "+max);
			System.out.println("Second MAX value in Array - "+secondMax);
		}
	}

}
