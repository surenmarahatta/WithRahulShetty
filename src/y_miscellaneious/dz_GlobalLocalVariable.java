//Global Veriable/Class Variable:  Variable declear in class level.
//To call Global we need to create an object of the class.
//
//Local Veriable:  Variable declear within any block of code, Method, Constructor is called Local Variable, it can be called
//within the same block easily (no need to create object)

package y_miscellaneious;

public class dz_GlobalLocalVariable {
	
	//below are global variable
	int gv = 5;
	String Global_name = "ram";

	public static void main(String[] args) {
		//below is Local variable
		int j = 10;
		String Lname = "shaym";
		
		System.out.println("j veriable inside main method is equal to "+ j);
		System.out.println(Lname);
		
		//create object to access global/class veriable
		dz_GlobalLocalVariable a = new dz_GlobalLocalVariable();
		System.out.println(a.gv + a.Global_name);
		
		//Accessing test() method [since this is non static method, accessing via object]
		a.test();
		

	}

	//lets create a function and declear some veriables there
	public void test() {
		int j = 15;  //this j variable is confined with this test() method only, it has nothing to do with j veriable in main method
		String Mname= "hari";
		System.out.println("the name inside test() method is "+Mname);
		System.out.println("j veriable inside the test method is equal to "+j);    
		
	}
}
