package assignments;

import java.util.*;

public class Assignment4_Collections {

	public static void main(String[] args) {
			
		// Student Row 1 data
			Map <String,String> s1 = new LinkedHashMap <String,String> ();
			s1.put("Name", "John Doe");
			s1.put("Age", "Twenty");
			s1.put("Gender", "Male");
			s1.put("Roll Number", "SBA12345");
			s1.put("Grade", "A++");
			s1.put("Major", "Computer Science");
			s1.put("GPA", "A3.8");
			s1.put("Email", "john@example.com");
			s1.put("PAN Number", "SDF6543210");
			s1.put("Address", "123 Elm St");
			// System.out.println(s1);
		
			// Student row 2 data
			Map <String,String> s2 = new LinkedHashMap <String,String> ();
			s2.put("Name", "Jane Smith");
			s2.put("Age", "Twenty One");
			s2.put("Gender", "Female");
			s2.put("Roll Number", "SBA12346");
			s2.put("Grade", "B+");
			s2.put("Major", "Mathematics");
			s2.put("GPA", "A3.5");
			s2.put("Email", "jane@example.com");
			s2.put("PAN Number", "REW6543211");
			s2.put("Address", "456 Oak St");
			// System.out.println(s2);
			
			// Student row 3 data
			Map <String,String> s3 = new LinkedHashMap <String,String> ();
			s3.put("Name", "Mike Brown");
			s3.put("Age", "Twenty Two");
			s3.put("Gender", "Male");
			s3.put("Roll Number", "SBA12347");
			s3.put("Grade", "A+");
			s3.put("Major", "Physics");
			s3.put("GPA", "A3.9");
			s3.put("Email", "mike@example.com");
			s3.put("PAN Number", "TYR6543212");
			s3.put("Address", "789 Pine St");
			// System.out.println(s3);	
			
			
			//employee data row 1 
			Map <String,String> e1 = new LinkedHashMap <String,String> ();
			e1.put("Employee ID", "E001");
			e1.put("Name", "Alice Green");
			e1.put("Age", "Thirty");
			e1.put("Gender", "Female");
			e1.put("Department", "Engineering");
			e1.put("Position", "Software Engineer");
			e1.put("Salary", "75K Pounds");
			e1.put("Email", "alice@example.com");
			e1.put("PAN Number", "SDF6543210");
			// System.out.println(e1);	

			//employee data row 2
			Map <String,String> e2 = new LinkedHashMap <String,String> ();
			e2.put("Employee ID", "E002");
			e2.put("Name", "Bob Johnson");
			e2.put("Age", "Thirty Five");
			e2.put("Gender", "Male");
			e2.put("Department", "Marketing");
			e2.put("Position", "Marketing Manager");
			e2.put("Salary", "85K Pounds");
			e2.put("Email", "bob@example.com");
			e2.put("PAN Number", "REW6543211");
			// System.out.println(e2);	
			
			//employee data row 3 
			Map <String,String> e3 = new LinkedHashMap <String,String> ();
			e3.put("Employee ID", "E003");
			e3.put("Name", "Carol White");
			e3.put("Age", "Twenty Eight");
			e3.put("Gender", "Female");
			e3.put("Department", "Sales");
			e3.put("Position", "Sales Executive");
			e3.put("Salary", "65K Pounds");
			e3.put("Email", "carol@example.com");
			e3.put("PAN Number", "TYR6543212");
			// System.out.println(e3);	
			
			
			// Product data Row 1
			Map <String,String> p1 = new LinkedHashMap <String,String> ();
			p1.put("Product ID", "P001");
			p1.put("Name", "Laptop");
			p1.put("Category", "Electronics");
			p1.put("Price", "12K Pounds");
			p1.put("Stock Quantity", "Not Available");
			p1.put("Supplier", "Tech Supplies");
			p1.put("Warranty", "2 years");
			p1.put("Rating", "4.5 Stars");
			p1.put("Manufacturing Date", "Aug 2023");
			p1.put("Expiry Date", "Aug 2028");
			// System.out.println(p1);				
			
			// Product data Row 2
			Map <String,String> p2 = new LinkedHashMap <String,String> ();
			p2.put("Product ID", "P002");
			p2.put("Name", "Desk Chair");
			p2.put("Category", "Furniture");
			p2.put("Price", "150K Pounds");
			p2.put("Stock Quantity", "Two");
			p2.put("Supplier", "Office Depot");
			p2.put("Warranty", "1 year");
			p2.put("Rating", "4 Stars");
			p2.put("Manufacturing Date", "Sep 2024");
			p2.put("Expiry Date", "N/A");
			// System.out.println(p2);			
			

			// Product data Row 3
			Map <String,String> p3 = new LinkedHashMap <String,String> ();
			p3.put("Product ID", "P003");
			p3.put("Name", "Coffee Maker");
			p3.put("Category", "Kitchen");
			p3.put("Price", "75 Pounds");
			p3.put("Stock Quantity", "Two Hundred");
			p3.put("Supplier", "KitchenWorld");
			p3.put("Warranty", "6 months");
			p3.put("Rating", "4.2 Stars");
			p3.put("Manufacturing Date", "Jan 2025");
			p3.put("Expiry Date", "Jan 2027");
			// System.out.println(p3);	
			
			
			// Combining all details and grouping them in lists
			
			List <Map<String,String>> StudentList = new LinkedList<Map<String, String>> ();
			StudentList.add(s1);
			StudentList.add(s2);
			StudentList.add(s3);
			//System.out.println(StudentList);
			
			List <Map<String,String>> EmployeeList = new LinkedList<Map<String, String>> ();
			EmployeeList.add(e1);
			EmployeeList.add(e2);
			EmployeeList.add(e3);
			//System.out.println(EmployeeList);
			
			List <Map<String,String>> ProductList = new LinkedList<Map<String, String>> ();
			ProductList.add(p1);
			ProductList.add(p2);
			ProductList.add(p3);
			//System.out.println(ProductList);
			
			Map <String,List<Map<String,String>>> Data = new HashMap<String, List<Map<String,String>>>();
			Data.put("StudentDetails", StudentList);
			Data.put("EmployeeDetails", EmployeeList);
			Data.put("ProductDetails", ProductList);
			
			//System.out.println(Data);
			// get 1st employee department
			//System.out.println(Data.get("EmployeeDetails").get(0).get("Department"));
			
			// Assignment - print office depot in product details sheet supplier column for row 2
			System.out.println(Data.get("ProductDetails").get(1).get("Supplier"));
			
			
	}

}
