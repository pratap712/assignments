package language.basics;

public class Abstract {

	
	
	abstract class abc{
		abstract void print();
		int p = 10;
	} 
	
	class c extends abc{

		int p =20;
		
		void print() {
			// TODO Auto-generated method stub
			System.out.println( p );
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Abstract.c a = new Abstract().new c();
		
		a.print();
		
	}

}
