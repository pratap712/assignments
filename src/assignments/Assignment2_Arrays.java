package assignments;

public class Assignment2_Arrays {

	public static void main(String[] args) {


		/*
		 * 1. Create a 3D array to represent the following data:
			o Semesters as the first dimension.
			o Subjects and Status/Marks as the second dimension.
			o Actual values for Subject Names and Marks as the third dimension.
		 */
		
		String arrMarkList [][][] = new String [5][7][2];
		
		arrMarkList[0][0][0] = "Sem1";
		arrMarkList[0][1][0] = "Mathematics I";
		arrMarkList[0][1][1] = "Pass(78)";
		arrMarkList[0][2][0] = "Physics";
		arrMarkList[0][2][1] = "Pass(85)";
		arrMarkList[0][3][0] = "Chemistry";
		arrMarkList[0][3][1] = "Fail(21)";
		arrMarkList[0][4][0] = "Computer Programming";
		arrMarkList[0][4][1] = "Pass(74)";
		arrMarkList[0][5][0] = "Engineering Drawing";
		arrMarkList[0][5][1] = "Pass(88)";
		arrMarkList[0][6][0] = "Basic Electrical Eng.";
		arrMarkList[0][6][1] = "Pass(79)";
		

		
		arrMarkList[1][0][0] = "Sem2";
		arrMarkList[1][1][0] = "Mathematics II";
		arrMarkList[1][1][1] = "Pass(82)";
		arrMarkList[1][2][0] = "Mechanics";
		arrMarkList[1][2][1] = "Pass(77)";
		arrMarkList[1][3][0] = "Environmental Sci";
		arrMarkList[1][3][1] = "Pass(93)";
		arrMarkList[1][4][0] = "Basic Electronics";
		arrMarkList[1][4][1] = "Fail(19)";
		arrMarkList[1][5][0] = "Engineering Physics";
		arrMarkList[1][5][1] = "Fail(24)";
		arrMarkList[1][6][0] = "Engineering Graphics";
		arrMarkList[1][6][1] = "Pass(90)";
		
		arrMarkList[2][0][0] = "Sem3";
		arrMarkList[2][1][0] = "Data Structures";
		arrMarkList[2][1][1] = "Pass(88)";
		arrMarkList[2][2][0] = "Discrete Mathematics";
		arrMarkList[2][2][1] = "Pass(81)";
		arrMarkList[2][3][0] = "Digital Electronics";
		arrMarkList[2][3][1] = "Pass(76)";
		arrMarkList[2][4][0] = "Operating Systems";
		arrMarkList[2][4][1] = "Fail(32)";
		arrMarkList[2][5][0] = "Signals and Systems";
		arrMarkList[2][5][1] = "Pass(85)";
		arrMarkList[2][6][0] = "Object-Oriented Prog.";
		arrMarkList[2][6][1] = "Pass(78)";
		
		arrMarkList[3][0][0] = "Sem4";
		arrMarkList[3][1][0] = "Algorithms";
		arrMarkList[3][1][1] = "Pass(91)";
		arrMarkList[3][2][0] = "Computer Networks";
		arrMarkList[3][2][1] = "Pass(73)";
		arrMarkList[3][3][0] = "Database Systems";
		arrMarkList[3][3][1] = "Fail(19)";
		arrMarkList[3][4][0] = "Microprocessors";
		arrMarkList[3][4][1] = "Pass(80)";
		arrMarkList[3][5][0] = "Communication Eng.";
		arrMarkList[3][5][1] = "Pass(76)";
		arrMarkList[3][6][0] = "Software Engineering";
		arrMarkList[3][6][1] = "Pass(87)";
		
		arrMarkList[4][0][0] = "Sem5";
		arrMarkList[4][1][0] = "Probability Stats";
		arrMarkList[4][1][1] = "Pass(86)";
		arrMarkList[4][2][0] = "Machine Learning";
		arrMarkList[4][2][1] = "Pass(88)";
		arrMarkList[4][3][0] = "Compiler Design";
		arrMarkList[4][3][1] = "Pass(84)";
		arrMarkList[4][4][0] = "Theory of Computation";
		arrMarkList[4][4][1] = "Pass(95)";
		arrMarkList[4][5][0] = "Embedded Systems";
		arrMarkList[4][5][1] = "Pass(73)";
		arrMarkList[4][6][0] = "Computer Graphics";
		arrMarkList[4][6][1] = "Pass(90)";
		
// print arr		
//		for(int i=0 ; i<5;i++) {
//			for(int j=0;j<7;j++) {
//				for(int k=0;k<2;k++)
//					if(arrMarkList[i][j][k] != null) {
//					System.out.printf("%-5s \t",arrMarkList[i][j][k]);
//					}
//			}
//			System.out.println();
//		}
//		
		
		
		/*
		 * 2. From the array:
			o Print Semester 2 Subject 4 and Subject 5 names.
			o Print the Status/Marks of Semester 4 Subject 3 and Subject 6.
		 */
		
		System.out.println("Semester 2 Subject 4 and Subject 5 names are "+arrMarkList[1][4][0]+" , "+arrMarkList[1][5][0]);
		
		System.out.println("Status/Marks of Semester 4 Subject 3 and Subject 6. are "+arrMarkList[3][3][1]+" , "+arrMarkList[3][6][1]);
	}

}
