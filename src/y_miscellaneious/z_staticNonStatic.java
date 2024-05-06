//Note that, to call NON static method we need to create object 
//and to call static method we have 2 ways:  call directly and calling by class name.
//to call static veriable too

package y_miscellaneious;

public class z_staticNonStatic {

	String name = "tom";  //non static global variable
	static int age = 25;  //static global variable
	
	
	
	public static void main(String[] args) {
		
		//call Static Methods
		sum();  //direct calling
		z_staticNonStatic.sum();     //calling by class name
		
		//call static global veriable
		System.out.println(age);      //direct calling
		System.out.println(z_staticNonStatic.age);   //calling by class name
		
		
		
		//call non static methods and veriables:  NEED AN OBJECT FIRST
		z_staticNonStatic a =new z_staticNonStatic();
		
		//call non static veriable, only direct method (no call by class)
		System.out.println(a.name);   //direct calling the global non static veriable
		a.sendMail();  //direct calling the non static method

	}

	
	
	public void sendMail() {     //a non static method
		System.out.println("this is from sendMail method, a non static method");
	}
	
	public static void sum() {   //a Static method
		System.out.println("this is from sum method, a static method");
	}
	
}
