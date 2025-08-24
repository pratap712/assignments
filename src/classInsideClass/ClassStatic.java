package classInsideClass;

public class ClassStatic {
	
	
	static class ClassA{
		
		String A = "Static A";
		static String B = "Static A Other data";
		
		
		
		static class ClassB{
			String A = "Static B";
			static String C = "Static B other data";
			String E= new ClassStatic.ClassA().A;
			String F = B;  //directly Accessible to All static Methods as B is Static
			
		}
		
		class NonStatic{
			
			String D = "NonStatic";
			static String D1 = "Static variable in non static Class";
			String G = A; // direct Access
			String H = ClassStatic.ClassA.this.A; // Other way to Access A
			String I = B; // Direct Access to static and non static member
			// Access C of static Class B
			String J = new ClassStatic.ClassA.ClassB().C;
			// other way as static variable
			String K = ClassB.C;
			//non static member of ClassB so create obj to access
			String L = new ClassStatic.ClassA.ClassB().A;
			
		
		}
		
	}
	
	
	
	

}
