package assignments;

public class Assignment7_ConditionalStatement {

	int creditScore;
	double income;
	String name;
	boolean isEmployed;
	double debtToIncome;
	
	 Assignment7_ConditionalStatement(String name,int creditScore,double income,boolean isEmployed,double debtToIncome){
		this.creditScore =  creditScore;
		this.income = income;
		this.name = name;
		this.isEmployed = isEmployed;
		this.debtToIncome = debtToIncome;
		
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * A bank evaluates loan applicants based on the following criteria:
			1. Credit Score:
			o If the credit score is above 750, the loan is automatically approved.
			o If the credit score is between 650 and 750, additional checks are performed.
			o If the credit score is below 650, the loan is denied.
			2. Income:
			o For credit scores between 650 and 750, the customer’s income must be at least $50,000
			for the loan to be considered.
			
			3. Employment Status:
			o If the customer’s income is at least 50,000, the system checks whether the customer is
			employed.
			o If the customer is unemployed, the loan is denied.
			4. Debt-to-Income Ratio:
			o If the customer is employed, the system checks the debt-to-income (DTI) ratio.
			o If the DTI ratio is less than 40%, the loan is approved.
			o If the DTI ratio is 40% or greater, the loan is denied.
			
			Now based on below details, print whether user is eligible to get the loan or not
			customerName = "John Doe";
			creditScore = 720;
			income = 55000.0;
			isEmployed = true;
			debtToIncomeRatio = 35.0;
		 */
		
		// Create Objet initialize all parameters 
		Assignment7_ConditionalStatement LoanApplicant = new Assignment7_ConditionalStatement("John Doe", 750, 55000.0,true, 35.0);
		
		
		//  Credit Score Based Filtering
		
		if (LoanApplicant.creditScore > 750) {
			System.out.println("Congrats!!!"+LoanApplicant.name+",Your Loan Application is Approved!!");
		}else if (LoanApplicant.creditScore > 650 && LoanApplicant.creditScore <= 750) {
			System.out.println("Your Loan Application is getting Processed Further....");
			// Filter based on income 
			if(LoanApplicant.income > 50000) {
				System.out.println("Income Checks Passed Sucesfully...");
				
				// Filter based on Employment Status
				if(LoanApplicant.isEmployed) {
					System.out.println("Employment Status Checks Passed Sucesfully...");
					//Filter based on Debt to income ratio
					if (LoanApplicant.debtToIncome < 40) {
						System.out.println("Debt to Income Ratio Checks Passed Sucesfully...");
						System.out.println("Congrats!!!"+LoanApplicant.name+",Your Loan Application is Approved!!");
					}
					else {
						System.out.println("Sorry !!! "+LoanApplicant.name+",Your Loan Application is Rejected - Debt to income ratio Check Failed");
					}
					
				}else {
					System.out.println("Sorry !!! "+LoanApplicant.name+",Your Loan Application is Rejected - Employment Stauts Check Failed");
				}
				
			}else {
				System.out.println("Sorry !!! "+LoanApplicant.name+",Your Loan Application is Rejected - Income < 50,000");
			}
			
		}else {
			System.out.println("Sorry !!! "+LoanApplicant.name+",Your Loan Application is Rejected");
		}
		
		
	}

}
