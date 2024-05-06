//THIS IS A PRACTICE FOR EXPLICIT AND IMPLICIT TYPE CONVERSION

package a_basics_Of_Java;

public class ad1 {

	public static void main(String[] args) {
		
		System.out.println("below is how we convert int into double");
		int a =10;
		double b = a;
		System.out.println("'a' as a int datatype = "+ a + " and 'b' as a double databype = " + b );
		
		System.out.println("...................");
		
		System.out.println("below is how we convert double into int");
		double x = 22.33;
		int y = (int) x;   
		System.out.println("'x' as a double datatype is "+x + " and 'y' as a int datatype is "+ y);
			

	}

}
