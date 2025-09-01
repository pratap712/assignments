package JavaNewFeatures;

public class sealedClass {

	sealed public class Vechile permits car {
		//A sealed class restricts which other classes can extend or implement it. 
		//You explicitly declare permitted subclasses using the permits clause.
		int a;
	}
	
	
	public final class car extends Vechile {
		// this class should be declared with below 3 methods
//		- sealed is the parent(vechile) deciding who the children are.
//		- final children say, “No grandkids.”
//		- non-sealed children say, “Anyone can be my child.”
//		- sealed children say, “I’ll choose my own kids.”
		int a;
		{ 
		 super.a = 10;
		 System.out.println("inside Car Class");
		}
		
	}
	
	// not permitted as vechile can only be extended by car as defined in vechile class
//	public class truck extends Vechile{
//		
//	}
//	
	public static void main(String[] args) {
		// Sealed Classes Java 17 + 
		
		Vechile v = new sealedClass().new Vechile();
		System.out.println(v.a); // prints 0 
		// Class Car initialization block will be loaded only
		//when you create object of class C
		
		car c = new sealedClass().new car();
		System.out.println(c.a); // prints 0 
		
		Vechile d = new sealedClass().new car();
		System.out.println(d.a); // prints 10 
		
	}

}
