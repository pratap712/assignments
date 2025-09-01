package language.basics;

public class SwitchExpression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 2;
		int y = switch (x) {
		  case 1 -> 10;
		  case 2 -> { int z = x * 3; yield z; }  // yield new keyword introduced in switch 
		  // to return value of expression
		  default -> 0;
		};
		System.out.println(y);
		
		
		// Instanceof concept 
		
		/// before java 16
		///Object obj = "Hello";
		//if (obj instanceof String) {
		//    String s = (String) obj; // Redundant explicit cast
		//    System.out.println(s.length());
		//}

		
		String s = "hello";

		
		if ( s instanceof Object q) { // Java 16 a new variable be created at run time of type s 
									//which is valid for code block only by instanceof keyword
									// 
			System.out.println(q);
			System.out.println(q.getClass());
		}
		
		// deeper evaluation of instanceof 
		
		Object o = "Pratap";
		if (o instanceof String a && (a = a.toUpperCase()) != null) {
		  System.out.println(a); // new copy is created which is valid for this block only
		  // O/P -> PRATAP 
		}
		System.out.println(o); // remains same -> o/p Pratap
		// System.out.println(a);  // not accessible outside the block
		
		
	}

}
