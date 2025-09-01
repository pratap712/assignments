package language.basics;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Optional;

public class TrickyQue5 {

	@SuppressWarnings({ "unused" })
	public static void main(String[] args) {
		
//		Object[] arr = new String[1]; // works perfectly as object class is base class 
//		arr[0] = 12; // run time exception as array is expecting string type of items

		/// important point about hash map
		///it works with key immutability contract as 
		///hashmap will check for unique hash code of key if your key is modified post adding 
		///item to hashmap it will calculate incorrect hash code and look for key value pair
		///this will result into null value
		///
		
		
		Map<Integer, Integer> m = new HashMap<>(Map.of(1,1, 2,2, 3,3));
		for (Integer k : m.keySet())
			if (k == 2)
				m.remove(k); // A -> unsafe gives concurrent modification error as 
		///When you modify the collection (the Map in this case)
		/// while iterating over it using a standard iterator, 
		///the iterator detects this change and throws a ConcurrentModificationException.
		/// This is a safety mechanism to prevent unpredictable behavior 
		///that could arise from concurrent modifications. 
		///Removing an element via the Map's remove() method directly 
		///within the loop is considered a structural modification that 
		///invalidates the iterator.
		
		for (Iterator<Integer> it = m.keySet().iterator(); it.hasNext(); )
		  if (it.next() == 3)
			  it.remove(); // B -  safe to remove element won't throw exception
		
		
		/// optional concept java utils package instead of null this is used 
		Optional <String> p = Optional.empty();
		
	}

}
