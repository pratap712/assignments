package assignments;

public class Assignment13_implementPowFunction {

	
	public static double pow  (double x, int n) {
		double temp = 1;
		
		if(n>0) {
			for (int i =0 ;i<n;i++)
				temp = temp*x;
		}
		
		if(n==0)
			return 1;
		
		if(n<0) {
			for( int i =0 ;i< n*-1;i++)
				temp = temp*x;
			
			temp = 1.0/temp;
		}
		
		return temp;
		
	}
	
	
	public static void main(String[] args) {
		
	//Implement pow(x, n), which calculates x raised to the power n (i.e., x n).	

		System.out.printf("%.5f \n",pow(2.10,5));
		
		
	}

}
