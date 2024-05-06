package c_ClassAndObject;

public class A_car {
	//GLOBAL VERIABLE OR CLASS VERIABLE  OR ATTRIBUTE PROPERTY
	//the variables which are 
	//1. defined within the class (not within main method)
	//2. not defined within any Method/Constructor/block of code
	//3. not defined within any block of code out side main method or within class
	//BELOW ARE THE GLOBAL VERIABLE OR CLASS VERIABLES
	
	int mod;
	int wheel;
	
	public static void main(String[] args) {
		//OBJECT REFERENTIAL VERIABLES:
		//Veriables created to assign the object of the class is called object referential veriables
		// in below example [ car() ] are 3 objects within car class which are 
		//assign to variable a, b, c which are the OBJECT REFERENTIAL VERIABLES.
		
		A_car a = new A_car ();  //here 'a' is a referential veriable and Car() (in right hand side) is the new object.
		A_car b = new A_car ();
		A_car c = new A_car ();
		
		//Above "new car ()" are the 3 objects, and a, b, c are OBJECT REFERENTIAL VARIABLES;
		//these 3 objects commonly share the Global Variables (mod and wheel).
		
		
		//now lets assign values to the Global Veriable for all 3 objects (a, b and c)
		a.mod=2015;
		a.wheel=4;
				
		b.mod=2014;
		b.wheel=4;
		
		c.mod=2013;
		c.wheel=4;
		
		//now lets print them
		System.out.println(a.mod);
		System.out.println(a.wheel);
		System.out.println();
		System.out.println(b.mod);  //keep printing as required
		
		//THINGS TO REMEMBER ON HOW TO CREATE OBJECT
		//1. Create Global Veriable within Class (outside main method):  (eg: int mod)
		//2. create Objects and assign them to Object Referential Variables
		//3. Supply values to each Object Referential Variables for each objects
		//4. Now manipulate/print as required.
		

	}

}
