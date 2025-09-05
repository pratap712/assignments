package assignments;


public class Assignment14_TimeToBuyStock {

	private static int maxprofit(int [] arr) {
		
		int maxprofit = 0;
		
		for(int i = 0 ; i<arr.length;i++) {
			for(int j =i+1; j<arr.length;j++) {
					int temp = arr[i] < arr[j] ? arr[j] - arr[i] :0;
					if(maxprofit < temp )
						maxprofit = temp;
				}
		
		}
		
		if (maxprofit>0)
			return maxprofit;
		else
			return 0;
	}
	
	public static void main(String[] args) {


		/*
		 * Best Time to Buy and Sell Stock
			You are given an array prices where prices[i] is the price of a given stock on the ith day.
			You want to maximize your profit by choosing a single day to buy one stock and choosing
			a different day in the future to sell that stock.
			Return the maximum profit you can achieve from this transaction. If you cannot achieve
			any profit, return 0.
		 */
		
		int [] prices = {7,1,5,3,6,4};
		
		System.out.println(prices.toString());
		
		System.out.println(maxprofit(prices));
		

	}

}
