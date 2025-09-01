package language.basics;

public class TrickyQue3 {

	@SuppressWarnings("finally")
	static int f1() {
		  try { return 1; }
		  finally { return 2; }
		}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(f1());
		
		// concept finally is always executed even though you are returning 1 from try block and haulting execution
		//  finally block will be executed to free up resources utilized so be careful while returning any thing from finally block
		
		
		// Finally block won;t be executed in following case as we are terminating java program execution in try block
		// this is equivalent to program execution getting stopped at run time
		
		 try { System.exit(0); } 
		 finally { System.out.println("Finally"); } 
		 System.out.println("I am not getting executed as JVM is shut down...Program terminated by Try Block!!!" );
		 
		 
		 // below code is unreacheable till line 23 and 24 is commented
		 
		
		// runtime error in switch using enum
		enum E { A, B }
		// E e = null; // throws Error 
		E e = E.A; // works fine will print A on console
		switch (e) {
		  case A -> System.out.println("A");
		  case B -> System.out.println("B");
		}
		
		
		
	}

}
