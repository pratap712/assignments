package language.basics;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.logging.Logger;

public class HelloWorld {

	
	
	HelloWorld() {
		
	}
	
	public static void main(String args[]) {

		System.out.println("Hello World!!");
		
		// print statements - println ->  writes content on line and moves to next line
		System.out.println("Hi Pratap");
		
		// print -> writes content on line and keeps cursor on same line
		System.out.print("Hello ");
		System.out.print("Pratap"); // prints on same line aas that of hello
		System.out.print("\n");  // prints a new line
		
		
		//printf - for printing content is specific format
		System.out.printf("Hello %s,how are you today ?" , "Pratap");
		System.out.println();
		
		// formating in tabular form 
		// %-7s is used to add white spaces at right side if string is less than 7 characters
		System.out.printf("%-7s %-2s\n" , "Name","email");
		System.out.printf("%-7s %-2s\n" , "Pratap","pratap.jumale@gmail.com");
		// add spaces before string 
		// %10s represents if string is less than 10 characters add white spaces before it 
		System.out.printf("%10s","Pratap");
		System.out.println();
		
		// Java in built logger
		// console output displayed in Red Color
		Logger.getLogger("P1").info("Custom Logg");
		Logger.getLogger("P1").warning("Custom Warning");
		
		//Printwriter - to print content in files
		
		try {
			PrintWriter pw = new PrintWriter("E:\\Selenim_2025\\Automation_Training\\PrintLog.txt");
			pw.println("log line 1");
			pw.println("log line 2");
			pw.println("log line 3");
			pw.println("log line 4");
			pw.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//print error through Sys.err
		System.err.println("Error Object  - Sample Error!!!");
		
		// comments in java
		
		/*
		 * 
		 * Multi 
		 * line
		 * comment
		 * 
		 */
		
		/**
		 * 
		 * Documentation comment
		 * @author Pratap
		 * File->export->Java doc these comments will be visible in project documentation
		 */
		
		
		
		
		
		
	}
	
}
