package language.basics;

public class TrickyQue1 {

	static void f(Object o) { System.out.println("Object"); }
	static void f(String c) { System.out.println("CharSequence"); }
	static void f(CharSequence c) { System.out.println("CharSequence"); }
	static void test() { f(null); }
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TrickyQue1.test(); // String will be printed
		
		/*
		 * The compiler follows a rule: if a method's parameter type is a subtype of another method's parameter type,
		 *  the compiler chooses the method with the subtype parameter.
		 * In this case, String is a more specific type than CharSequence,
		 * and CharSequence is more specific than Object.
		 * 
		 * 
		 * Object (base) -> charsequence(interface) -> String implements charseq
		 * String is more specific type 
		 * overloading is compile time so compiler follows simple logic most specific type needs to be called rather than general type
		 * 
		 * if you comment String overloaded call -> it will print -> char sequence -> as this is more specific than object
		 * 
		 *
		 */
		
		
	}

}
