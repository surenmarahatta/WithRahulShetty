//NON STATIC METHOD:  NEED TO CREATE AN OBJECT TO CALL NON-STATIC METHOD
//Define the Method outside Main-Method (either before  or after the Main-Method)

package d_NonStaticMethod;

public class db_NonStaticMethod {

	public static void main(String[] args) {
		db_NonStaticMethod a = new db_NonStaticMethod();  //created this new object just to call the NonStatic Method
		
		a.ABC();
		
		int p=a.DEF();   //we  got a value 30 from method DEF(), so we need a variable (p) to hold this value, same for String return type too
		System.out.println(p);  
		
		int q = a.GHI(5, 9);
		System.out.println(q);
		
	}
	
	
	//Method with NO PARAMETER and NO RETURN TYPE
	public void ABC() {
		System.out.println("this is an exemple of method with no parameter and no return type");
		String name = "Ram";
		System.out.println("My name is "+ name);
	}
	
	
	//Method with NO PARAMETER and YES RETURN TYPE
	public int DEF() {
		int a = 10, b=20;
		int c= a+b;
		
		return c;
	}
	
	
	//Method with YES PARAMETER AND YES RETURN TYPE
	public int GHI(int x, int y) {
		int z=x+y;
		
		return z;
	}
	
}
