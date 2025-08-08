package assignments;

import java.util.Date;

public class Assignment1_DataTypes {

	public static void main(String[] args) {
	
       //1. Temperature of a city in degrees Celsius: 25.5
		float temperature = 25.5f; // 4 bytes - storage upto 6-7 decimals
		System.out.println("Current Temperature is "+ temperature);
		
	  //2. Whether a customer has placed an order: true or false
		boolean bOrderPlaced = true;
		System.out.println("is my order placed"+ bOrderPlaced);
		
	 //3. Person's phone number: "123-456-7890"
		long mobileNo = 1234567890l;
		System.out.println("your mobile no is - "+ mobileNo);
		String sMobileNo = "123-456-7890";
		System.out.println("your formated mobile no is - "+ sMobileNo);
		
	//4. Amount of money in a customer's bank account: 1000.50	
		double sBalance = 1000.50;
		System.out.printf("Your Bank Account balance is - %.2f ",sBalance);
		
	//5. Person's email address: "john.doe@example.com"
		String sEmail = "john.doe@example.com";
		System.out.println("Your email address is - "+sEmail);
		
	//6. Coordinates of a location (latitude, longitude): 37.7749, -122.4194
		double latitude = 37.7749;
		double longitude = -122.4194;
		System.out.printf("Coordinates for your location (latitude, longitude): - %.4f , %.4f \n",latitude,longitude);
	
	//7. Person's marital status: true or false
		boolean bMaritalStatus = false;
		System.out.println("Your Maritial Status is - "+bMaritalStatus);
		
	// 8. Person's occupation: "Software Engineer"
		String sOccupation = "Software Engineer"; 
		System.out.println("Your Occupation is "+ sOccupation);
		
	// 9. Person's favourite colour: "Blue"
		String sFcolor = "Blue";
		System.out.println("Your Favourite Color is "+sFcolor);
		
	// 10.Current year: 2023
		Date d = new Date();
		// you can similarly use %tm -> month %td-> day 
		System.out.printf("Current year is %tY \n",d);
		
	// 11.Number of followers on a social media platform: 1,000,000
		int dFollowers = 1000000;
		System.out.printf("your socia media Followers are :%,d\n",dFollowers);
		
	// 12.Rating of a movie: 7.5
		float MovieRating = 7.5f;
		System.out.println("Rating of this Movie is "+MovieRating);
		
	// 13.Person's blood type: 'A'	
		char bloodGroup = 'A';
		System.out.println("Your Blood Group is -"+bloodGroup);
		
	//14.Title of a book: "To Kill a Mockingbird"
		String title = "To Kill a Mockingbird";
		System.out.println("Title of this book is "+title);
		
	//15.Number of employees in a company: 500
		int empCount = 500;
		System.out.println("Number of employees in your company is "+empCount);
	
	//16.Time of an event: 2:30 PM
		String time = "2:30 PM";	
		System.out.println("Time of the event is -"+time);
	
	//17.Name of a country: "United States"
		String Country = "United States";
		System.out.println("Name of that Country is "+Country);
	
	//18.Person's eye color: "Brown"
		String eyeColor = "Brown";
		System.out.println("His Eye Color is "+eyeColor);
		
	//19.Person's birthplace: "New York City"
		String birthPlace = "New York City";
		System.out.println("His Birth Place is "+birthPlace);
	
	//20. Distance between two cities: 200.5
		float Distance = 200.5f;
		System.out.println("Distance between those cities is "+Distance);
		
	}

}
