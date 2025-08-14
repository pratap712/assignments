package assignments;

public class Assignment3_EmpGroups {

	
	int EmpIds[];
	String EmpNames[];
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Assignment3_Employees Emp1 = new Assignment3_Employees(1234,"Bharath");
		Assignment3_Employees Emp2 = new Assignment3_Employees(1235,"ABC");
		Assignment3_Employees Emp3 = new Assignment3_Employees(1236,"XYZ");
		
		Assignment3_EmpGroups EmpArr1 = new Assignment3_EmpGroups();
		EmpArr1.EmpIds = new int [3];
		EmpArr1.EmpNames = new String [3];
		EmpArr1.EmpIds[0] = Emp1.EmpId;
		EmpArr1.EmpNames[0] = Emp1.EmpName;
		EmpArr1.EmpIds[1] = Emp2.EmpId;
		EmpArr1.EmpNames[1] = Emp2.EmpName;
		EmpArr1.EmpIds[2] = Emp3.EmpId;
		EmpArr1.EmpNames[2] = Emp3.EmpName;
		
		
		System.out.println("Employee Name : "+EmpArr1.EmpNames[0]+" , Employee Id : "+EmpArr1.EmpIds[0]);
		System.out.println("Employee Name : "+EmpArr1.EmpNames[1]+" , Employee Id : "+EmpArr1.EmpIds[1]);
		System.out.println("Employee Name : "+EmpArr1.EmpNames[2]+" , Employee Id : "+EmpArr1.EmpIds[2]);
	
	}

}
