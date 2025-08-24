package classInsideClass;

public class ClassA {

	String A = "ClasssA";
	String B = "Class A data 2";
	
	// way to Access Class B From Class A
	ClassB ObjB = new ClassB(); // this gives Class Access to all member of class B
	
	
	class ClassB{
		
		String A = "ClasssB";
		String C = "Class B data 2";
		// ideally you can directly access any data member of A
		//which are non private 
		// in our case we have used same name so Accessing it by ClassName.this.A
		void AccessClassAdata() {
			System.out.println(ClassA.this.A);
			System.out.println(B);
		}
		
		class ClassC{
			
			String A = "ClasssC";
			
			void AccessClassAdatainC() {
				System.out.println(ClassA.this.A);
				System.out.println(B);
			}
			void AccessClassBdata() {
				System.out.println(ClassB.this.A);
				System.out.println(B);
				
				//Access ClassB method
				ClassB.this.AccessClassAdata();
				//Or you can directly call
				AccessClassAdata();
			}
			
			
			
			
		}
	}
	


}
