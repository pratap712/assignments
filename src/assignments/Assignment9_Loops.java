package assignments;

import java.util.*;

public class Assignment9_Loops {
	
		int empid;
		String name;
		double baseSalary;
		double experience;
		double rating;
		
		Assignment9_Loops(int empid,String name,double baseSalary,double experience,double rating){
			
			this.empid = empid ;
			this.name = name;
			this.baseSalary = baseSalary;
			this.experience = experience;
			this.rating = rating;
			
		}

	public static void main(String[] args) {
		
		/*
		 * Employee Table
			S.No Name Base Salary Experience (Years) Year-End Rating (Out of5)
			1 Alice Johnson 75000.0 5.1 4.2
			2 Bob Smith 68000.0 3.2 3.8
			3 Carol Davis 82000.0 7.1 4.5
			4 David Brown 90000.0 10.2 2.5
			5 Eva Green 60000.0 2.4 3.5
			
			Hike 
			Rating % of base Salary as variable pay Bonus
			> =4.0 15.0 1500
			>=3 && < 4 10.0 1200
			< 3.0 3.0 300
			
			Extra Perks
			Employees with Experience >= 5 Years get extra Reward of 5000;
		 */
		
		
		// create a Array of Employees
		Assignment9_Loops[] arr = new Assignment9_Loops[5];
		
		// store data of employees  
		arr[0] = new Assignment9_Loops(1,"Alice Johnson",75000.0, 5.1, 4.2 );
		arr[1] = new Assignment9_Loops(2,"Bob Smith", 68000.0, 3.2, 3.8);
		arr[2] = new Assignment9_Loops(3,"Carol Davis", 82000.0, 7.1, 4.5);
		arr[3] = new Assignment9_Loops(4,"David Brown", 90000.0, 10.2, 2.5);
		arr[4] = new Assignment9_Loops(5,"Eva Green", 60000.0, 2.4, 3.5);
		
		double hike[] = new double [arr.length]; 
		
		
		for (int i=0 ;i<arr.length;i++) {
			
			if(arr[i].rating >= 4.0) 
				hike[i] = arr[i].baseSalary * 0.15 + 1500; // hike 15% of base + 1500
			else if(arr[i].rating >= 3.0 && arr[i].rating < 4.0)
				hike[i] = arr[i].baseSalary * 0.1 + 1200; // hike 10% of base + 1200
			else
				hike[i] = arr[i].baseSalary * 0.03 + 300; // hike 3% of base + 300
			
			//perk / reward for long service
			if(arr[i].experience >= 5)
				hike[i] += 5000;
			
		}
		
		
		// Store Hike percentage in map with emp name and print them
		Map <String,Double> EmpHikeList = new LinkedHashMap <String,Double> ();
		for (int i= 0 ; i < arr.length ; i++ )
			EmpHikeList.put(arr[i].name, (hike[i]/arr[i].baseSalary)*100);
		
//		System.out.println(EmpHikeList.toString());
//		System.out.println();
		
		System.out.println("************ Employee Hike List ************");
		for(String empname :EmpHikeList.keySet() )
			System.out.printf("%-15s %.2f \n",empname, EmpHikeList.get(empname) );
		
	}

}


