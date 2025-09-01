package language.basics;

import java.util.Arrays;
import java.util.Stack;

public class LinkedList1 {
	
	int x;
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		
	
		int [] arr = {2,5,1,2,9};
		
		System.out.println(Arrays.stream(arr).max().getAsInt());
		
	     Stack<Integer> s = new Stack<Integer>();
	        Arrays.stream(arr).forEach(x->s.push(x));
		System.out.println(s);
		
		
	}
}
