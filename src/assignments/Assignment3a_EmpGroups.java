package assignments;

public class Assignment3a_EmpGroups {
	
	int [] Emdids;
	String [] EmpNames;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Assignment3a_EmpGroups EmpG1 = new Assignment3a_EmpGroups();
		EmpG1.Emdids = new int [3];
		EmpG1.EmpNames = new String[3];
		
		EmpG1.Emdids[0] = new Assignment3a_Employee().EmpId1;
		EmpG1.Emdids[1] = new Assignment3a_Employee().EmpId2;
		EmpG1.Emdids[2] = new Assignment3a_Employee().EmpId3;
		
		EmpG1.EmpNames[0] = new Assignment3a_Employee().EmpName1;
		EmpG1.EmpNames[1] = new Assignment3a_Employee().EmpName2;
		EmpG1.EmpNames[2] = new Assignment3a_Employee().EmpName3;
		
		System.out.println("Employee Name : "+EmpG1.EmpNames[0]+" , Employee Id :"+EmpG1.Emdids[0]);
		System.out.println("Employee Name : "+EmpG1.EmpNames[1]+" , Employee Id :"+EmpG1.Emdids[1]);
		System.out.println("Employee Name : "+EmpG1.EmpNames[2]+" , Employee Id :"+EmpG1.Emdids[2]);
		
	}

}
