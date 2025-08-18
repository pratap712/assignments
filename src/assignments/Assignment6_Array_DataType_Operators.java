package assignments;

public class Assignment6_Array_DataType_Operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * 1. Create two arrays to store student names ["Suresh","Mahesh","Naresh"] and
		 * marks [75, 80, 82] Add 10 marks to each students using assignment operators and
		 * store it into another array, after adding 10 marks identify the average marks of all
		 * students
		 */
		
		String studentName[] = {"Suresh","Mahesh","Naresh"};
		int marks [] = {75, 80, 82};
		
		int updatedMarks [] = new int[3];
		updatedMarks[0] = marks[0]+10;
		updatedMarks[1] = marks[1]+10;
		updatedMarks[2] = marks[2]+10;
		
		System.out.println("Updated Marks of Students");
		System.out.println(studentName[0] +" : "+updatedMarks[0] );
		System.out.println(studentName[1] +" : "+updatedMarks[1] );
		System.out.println(studentName[2] +" : "+updatedMarks[2] );
		System.out.printf("Average Marks : %.1f \n", (updatedMarks[0]+updatedMarks[1]+updatedMarks[2])/3.0);
		
		
		
	}

}
