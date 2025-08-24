package classInsideClass;

import classInsideClass.ClassStatic.ClassA.ClassB;
import classInsideClass.ClassStatic.ClassA.NonStatic;

public class ClassStaticMain {

	public static void main(String[] args) {

		// Access Class -> Static Class variable 
		System.out.println(new ClassStatic.ClassA().A);
		
		// Access Class ->Static A->Static B variable A
		System.out.println(new ClassStatic.ClassA.ClassB().A);
		
		// Access Class ->Static A->Static B variable E
		System.out.println(new ClassStatic.ClassA.ClassB().E);
		// Access Class ->Static A->Static B variable F
		System.out.println(new ClassStatic.ClassA.ClassB().F);
		
		//Static variable Access
		//Access Class ->Static A->Static B static variable C
		System.out.println(ClassB.C);
		
		
		
		// Access Class ->Static A->NonStatic variable D
		System.out.println(new ClassStatic.ClassA().new NonStatic().D);
		
		System.out.println(NonStatic.D1);
		// similar to above line
		System.out.println(ClassStatic.ClassA.NonStatic.D1);

		
		
		
		
	}

}
