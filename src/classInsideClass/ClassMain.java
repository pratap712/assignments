package classInsideClass;

public class ClassMain {

	public static void main(String[] args) {

		ClassA Obj = new ClassA();
		System.out.println(Obj.A);
		
		//Accessing ClassB's Variable C
		System.out.println(Obj.ObjB.C);
		
		
		
		System.out.println(Obj.new ClassB().A);
		// equivalent object creation for above line
		ClassA.ClassB Obj1 = new ClassA().new ClassB();
		System.out.println(Obj1.A);
		
		//Access data members of Class A by creating methods 
		//without creating Class A Object inside Class B
		Obj1.AccessClassAdata();
		
		System.out.println(Obj.new ClassB().new ClassC().A);
		// equivalent object creation for above line
		ClassA.ClassB.ClassC Obj2 = new ClassA().new ClassB().new ClassC();
		System.out.println(Obj2.A);
		
		Obj2.AccessClassAdatainC();
		Obj2.AccessClassBdata();

		
		
		
		
		
		
		
	}

}
