package language.basics;

public class TrickyQue6 {

	public static void main(String[] args) throws ClassNotFoundException {	
		System.out.println(C.X); 
		System.out.println(D.Y); 
		
		System.out.println("=================");
		
		Class<?> c1 = String.class;
		Class<?> c2 = Class.forName("java.lang.String");
		System.out.println(c1 == c2);
		
		/*
		 * Concept - 
		 * Both c1 and c2 refer to the exact same Class object 
		 * representing java.lang.String. 
		 * The Java Virtual Machine (JVM) maintains a unique Class
		 * object for each class that is loaded.
		 * 
		 */
		
	}
}


class C { 
	static final int X = 42; 
	// will be considered as constant value by compiler as it is primitive type 
	// due to this static block won't be initialized
	static { 
		System.out.println("C.init"); 
	} 	
}
class D {
	static final Integer Y = 42; // this is non primitive type so compiler won't treat is as simple constant 
	//Class will be loaded at runtime
	
	static { 
		System.out.println("D.init"); 
	} 
}
 