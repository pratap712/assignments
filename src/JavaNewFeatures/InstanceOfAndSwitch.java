package JavaNewFeatures;

public class InstanceOfAndSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String obj = "123";
		
		if (obj instanceof String s) { // Auto copies obj to s in local scope for usage
			// a new copy of obj is created is only valid for this block as it is local 
			//to it
		    System.out.println(s.toUpperCase());
		}
		
	}

}
