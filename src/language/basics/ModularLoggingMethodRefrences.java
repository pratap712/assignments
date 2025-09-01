package language.basics;

import java.util.*;

public class ModularLoggingMethodRefrences {

	public static void main(String[] args) {


		List<String> sectors = List.of("AI", "Green Energy", "Fintech"); //immutable list 
		
		// if you want to modify it to mutable use this instead
		sectors = new ArrayList<String>(sectors);
		sectors.stream()
		       .peek(System.out::println) // passthrough logging
		       .map(String::toUpperCase)
		       .forEach(System.out::println);


		
	}

}
