package a_basics_Of_Java;
public class ad_typeCasting {

	public static void main(String[] args) {
	
		/* TYPE CASTING
		 this is the process of changing one data type into another. Sometime we write a code to address specific kind of 
		 data in out application, but we might encounter different type of data in real world
		 Hence by converting data from one type to another we can save some memory space in the server or 
		 reduce the risk of data lost.  There are 2 types of casting
		 
		 1. Widening Casting or implicit conversion:  from lower size of data into larger size 
		 for eg, int (4bytes) to float (8 bytes). Since destination datatype has more memory space 
		 then in source it has less chances of data being loss.  So this conversion happen automatically.
		 
		 2. Narrow Casting or explicit conversion:  from Higher size to lower size.
		 for eg float (8 bytes) to short (2 bytes).  Since data transfer from higher memory space to lower
		 there is more chances of data being lost.  So java do not do this process automatically and we 
		 have to specify the target datatype manually		 
		 */

	
		System.out.println("WIDENING CASTING:  datatype converted from int to double");
		int a =3;
		double d2=a;  //no need to specify destination data type, it will convert automatically
		System.out.println(a+"---"+d2);
		
		
		System.out.println("NARROW CASTING:  datatype converted from double to int");
		double d1=4d;
		int a1=(int)d1;  //need to specify destination data type "(int)d1" manually 
		System.out.println(a1);
		
		//above is an example of converting datatype from int to doouble or Vs. both are numerical values
		//but if we need to convert from number to characters like int/float into string and vs  
		
		// from numerical to character		
		float p =20.8f;
		int i = 21;
		String s = "3456";

		//convert float p into string
		String q=String.valueOf(p);  
		System.out.println("float p (=20.8f) converted to string is--"+q);
		
		//convert int i into string
		String j = String.valueOf(i);
		System.out.println("int i (=21) converted into string is--"+ j);
		
		//convert String s into int or  double [we can use either .valueOf()  or .parseInt()]
		int k= Integer.valueOf(s);
		System.out.println("string s (=3456) converted into int is --"+ k);
		
		int l = Integer.parseInt(s);
		System.out.println("string converted to an int and the int value is:" + " " + l);
	
	}

}
