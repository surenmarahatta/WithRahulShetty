package a_basics_Of_Java;

public class aa_DataTypesAndSize {

	public static void main(String[] args) {
			
	//below are some common DataTypes in java with examples
	//1. Premative datatype:  Predefined in jave,  veriable/identifier starts with lower case and always have value
		//		a.	Boolean
		//		b.	Numerical:  Integer [int], Long,  Short,  Byte
		//		c.	Character [char]
		//		d.	Floating points:  Float, Double
		
	//1. Non Premative datatype:  Create and defined by programmer (except String),  
		//veriable/identifier starts with Uppercase case and may not contain any value like 
		//		a.	String
		//		b.	Array
		//		c.	Class, Methods
		
		
	//Identifier and keyword:   
		//name given to package, class, method, veriable are called IDENTIFIER.  For example in below program num, letter
		//fname, marks, interest are identifier
		//where as predefined reserved words in Java with special meaning and functions are called KEYWORDS.  Fo example
		//in this program int, char, String, double, public, static, void all Keywords.

	System.out.println("below are some of the example of premative datatypes, except String, which is non premative");	
	int num = 10;
	char letter = 'r';  
	String fname = "surendra";    // remember char should be enclosed within '', and string within ""
	double marks = 5.47;
	float interest = 3.669f;
	boolean myCard = true;   //remember boolean doesnt enclosed within '' or ""
	
	//there are some more datatypes, refer below for it.  for more details go google.
	
	System.out.println("lets print some of their value, as below");
	System.out.println(num + " is assigned to a veriable num");
	System.out.println("an alphabet r is assign to a veriable "+ letter);
	
		
	/* .......sizes of data types
	 * byte  -  1byte
	 * short -  2 bytes
	 * int   -  4 bytes
	 * long  -  8 bytes
	 * float -  4 bytes
	 * double-  8 bytes
	 * boolean- 1 bytes
	 * char  -  2 bytes
	.............. */
	
	//please refer to w3 school for more detail about this
	
}
}
