package language.basics;

import java.util.ArrayList;
import java.util.List;

public class TrickyQue4 {

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		// Refer Class A and B at the end of file
		A a = new B();
		a.s(); //A.s -> method is static so reference of object comes into play -> static is more class oriented
		a.i(); // B.i -> normal overridden method so object plays a critical role
	
	
		// which of the following li declaration is valid and why
		
		//List<Object> lo = new ArrayList<String>(); // A -> invalid as type of both generics for type should be same
		@SuppressWarnings("unused")
		List<? super String> ls = new ArrayList<Object>(); // B -> any class which is parent of string is valid as per super  generic declaration
		@SuppressWarnings("unused")
		List<? extends Number> ln = new ArrayList<Integer>(); // C -> valid integer class extends number 
															 // As per generics declaration  class which extends number is valid combination of type
	
		
		// Swap Function with generics 
		
		// Important point to remember <?> - if you are using generics with wildcard it will let you read
		// but write operation is restricted as type is not determined at compile time
		/*
		 * List<?> list = new ArrayList<String>();
			Object item = list.get(0); // ✅ You can read
			list.set(0, item);         // ❌ Compile-time error item needs to be of same type as list not object

		 * The compiler doesn’t know what type ? actually is.
			It could be String, Integer, Double, etc.
			So it disallows set() because inserting any value might break type safety.
		 */
		// instead use <T> some Placeholder which will help in allowing both read and write operation
		/*
		 * public static <T> void swap(List<T> list, int i, int j) {
			    T temp = list.get(i);
			    list.set(i, list.get(j));
			    list.set(j, temp);
			}

		 */
		// imp point if you are using generics with restriction 
		// <? extends T> -> will let you read but won't let you write 
		/*
		 * public static <T> void swap(List<? extends T> list, int i, int j) {
			    T temp = list.get(i);        // ✅ You can read
			    list.set(i, list.get(j));    // ❌ Compile-time error
			    list.set(j, temp);           // ❌ Compile-time error
			}
			You can read elements as type T.
			
			But you cannot write to the list using set() because the actual list might be a subtype of T.
			
			Example: If list is List<Integer>, and T is Number, then inserting a Number (like a Double) would break type safety.
		 */
		
		
		// <? super T> -> will let you read with object and will let you write too by using casting.		
		/*
		 * public static <T> void swap(List<? super T> list, int i, int j) {
			    Object temp = list.get(i);   // ⚠️ Only safe to read as Object
			    list.set(i, (T) list.get(j)); // ✅ You can write with cast
			    list.set(j, (T) temp);        // ✅ You can write with cast
			}

		 */
		
		
	}

}



class A { 
	static void s() { 
		System.out.println("A.s"); 
	} 
	void i() { 
		System.out.println("A.i"); 
		}
	}
class B extends A { 
	static void s() { 
		System.out.println("B.s");
		}
	@Override void i() {
		System.out.println("B.i"); 
		}
	}

