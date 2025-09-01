package JavaNewFeatures;

public class RecordClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		point P = new point(2, 3);
		point P1 = new point(3, 3);
		
		System.out.println(P.equals(P1));
		System.out.println(P.x());
		System.out.println(P.y());
		System.out.println(P.toString());
		System.out.println(P.hashCode());
		System.out.println(P.sum());
	}

}

//Record class - Auto-generates constructor, getters, equals, hashCode, and toString.
 record point(int x ,int y){ 
	 
	 public int sum() {return this.x + this.y;}
	 
 }
 
 
 
