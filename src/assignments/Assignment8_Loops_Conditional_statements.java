package assignments;

import java.util.*;

public class Assignment8_Loops_Conditional_statements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Bank Transactions
			Positive value refers Credit and Negative refers Debit Transaction
			Transactions Amount
			1 50000
			2 -2000
			3 3000
			4 -15000
			5 -200
			6 -300
			7 4000
			8 -3000
			
			First Store all the transactions in any data structure of Your Choice from collections, and by using
			Loops and conditional statements
			1. Print total number of credit and debit transactions completed
			2. Print the total amount credited and debited in account
			3. Print total amount remaining at the end in Bank Account
			4. If any transaction limit exceeds +/- 10000 then print the message “Suspicious credit/ debit
			Transaction with Amount” and also print total number of suspicious transactions
		 */
		
		
		//  Store all transactions in Map
			
			Map <Integer,Integer>  m = new LinkedHashMap<Integer,Integer>();
			m.put(1,50000);
			m.put(2,-2000);
			m.put(3,3000);
			m.put(4,-15000);
			m.put(5,-200);
			m.put(6,-300);
			m.put(7,4000);
			m.put(8,-3000);
			
			System.out.println(m.toString());
			
			// 1. Print total number of credit and debit transactions completed
			// 2. Print the total amount credited and debited in account
			int credit = 0,debit = 0 ,suspicious = 0 ;
			int creditAmount =0 ,debitAmount = 0;
			
			List <Integer> suspKey = new ArrayList <Integer> ();
			
			for(int x:m.keySet()) {
				if (m.get(x) > 0) {
					credit++;
					creditAmount+=m.get(x);
				}else {
					debit++; 
					debitAmount+=m.get(x);
				}
				
				if (m.get(x)>10000) { //4. If any transaction limit exceeds +/- 10000 then print the message “Suspicious credit/ debit
					// Transaction with Amount” and also print total number of suspicious transactions
					suspicious++;
					suspKey.add(x);
				}else if(m.get(x)<-10000) {
					suspicious++;
					suspKey.add(x);
				}
				
			}
			
			System.out.println("++++++++++++++++++++++++++++");
			System.out.println("Total Number of Credit transactions are "+credit+"\nTotal Number of debit transactions are "+debit);
			System.out.println("++++++++++++++++++++++++++++");
			System.out.println("Total Amount Credited is "+creditAmount+"\nTotal Amount Debited is "+debitAmount);
			System.out.println("++++++++++++++++++++++++++++");
			//3. Print total amount remaining at the end in Bank Account
			// Total Amount at the end of all Transactions
			System.out.println("Total amount remaining in Bank Account is "+ (creditAmount-Math.abs(debitAmount)) );
			System.out.println("++++++++++++++++++++++++++++");
			System.out.println("Total number of suspious transactions are "+suspicious );
			System.out.println("+++++++++++++ Below is the list of Suspicious transactions +++++++++++++++");
			for(int x :suspKey) {
				System.out.println("Transaction number - "+ x +" Amount "+m.get(x));
			}
			System.out.println("++++++++++++++++++++++++++++");
	}

}
