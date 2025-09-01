package language.basics;

import java.util.*;

public class MountainDetectionArray {

	public static void main(String[] args) {
		
		int arr[] = {1, 2, 1, 2, 3, 4, 5, 3, 2, 4, 6, 8, 9, 10, 9, 8, 7, 10, 12, 14, 15, 16, 17, 18, 19, 10, 5, 2};
		
		// Find ascending indexes in Array
		TreeMap <Integer,List<Integer>> AscMap = new TreeMap<Integer,List<Integer>>();

		// Ascending segment detection
        for (int i = 0; i < arr.length - 1; i++) {
            int start = i;
            int length = 0;

            while (i < arr.length - 1 && arr[i] < arr[i + 1]) {
                i++;
                length++;
            }
            
            if (length > 0) {
                AscMap.computeIfAbsent(length, k -> new ArrayList<>()).add(start);
                System.out.println(AscMap);
            }
            
            
        }

        	// System.out.println(AscMap);

	}

}
