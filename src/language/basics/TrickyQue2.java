package language.basics;

public class TrickyQue2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Auto Boxing Caching
		Integer a = 127, b = 127;
		Integer c = 128, d = 128;
		System.out.println(a == b);  // true -> auto caching of literals till -128 to 127 so ref a and b are pointing to same object
		System.out.println(c == d); // false -> out of range for auto caching by java complier so new objects are created for literals
		
		System.out.println("==============");
		
		// NAN what it will print
		double x = Double.NaN;
		System.out.println(x == x); // False Explained below
		System.out.println(Double.compare(x, x) == 0); 
		System.out.println(Double.isNaN(x)); // true
		
		/*
		 * Line  18 x==x
		 *  == operator should not be used with decimals as in binary exact representation storage creates an issue 
		 *  which results in number getting truncated this creates issues later 
		 *   ==  check for exact equality  -> decimal->bin and bin to decimal might generate some difference due to this it creates issues
		 *   
		 *  NaN (Not a Number): Comparing any value, including NaN itself, with NaN using == will always result in false.
		 *	Positive and Negative Zero: While +0.0 and -0.0 are considered equal by ==, some operations might treat them differently.
		 *  same applies for .equals method
		 *  
		 *  
		 *  Line 19 
		 *  Double.compare(x, x) -> evaluates to 0 as both are equal 
		 *  This is by design, to make sorting and ordering consistent. 
		 *  If compare(a, b) didn’t return 0 for two NaNs,
		 *  it would break things like Collections.sort() or TreeSet. 
		 *   
		 *  
		 */
		
		System.out.println("==============");
		
		
		//3 String constants
		String s1 = "a";
		String s2 = "b";
		final String s5 = "a";
		final String s6 = "b";
		String s3 = s1 + s2;
		String s4 = "a" + "b";
		String s7 = s5 + s6;
		System.out.println(s3 == "ab"); //false 
		System.out.println(s4 == "ab"); //true
		System.out.println(s7 == "ab"); //true
		
		/*
		 * s4 == "ab" → Always true "a" + "b" is a compile-time constant.
		 * The compiler folds it into "ab" during compilation.
		 * Both s4 and "ab" point to the same interned string in the string pool.
		 * 
		 * s3 == "ab" -> a new object is created at run time  so they are not equal 
		 * as s3 is reference to a new object and "ab" is different object 
		 * 
		 * 
		 * s7 -> True as both s5 and s6 are final 
		 * s7 == "ab" → true in this case
         * Normally, s5 + s6 is evaluated at runtime, producing a new String object.
		 * But because s5 and s6 are both final, the compiler can optimize and treat s5 + s6 as a constant expression.
		 * So s7 is also folded into "ab" at compile time, and interned.
		 * This optimization is allowed by the Java Language Specification (§15.28), 
		 * which states that constant expressions involving final variables initialized with constant values can be folded at compile time.
		 * 
		 */
		
		
		
		
		
	}

}
