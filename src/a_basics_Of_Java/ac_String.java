package a_basics_Of_Java;

public class ac_String {

	public static void main(String[] args) {
		// String are use to store multiple characters within the variable
		//for example "test", or "this is a test"
		
		//below is the basic example
		String Fn= "Surendra";
		String Ln= "Marahatta";
		String Fname =Fn.toUpperCase();  //.toUpperCase convert the string Fn to upper case
		String Lname =Ln.toUpperCase();
		System.out.println("my full name is"+" "+ Fname + " " + Lname);

		
		// there are following methods of string which we can use for different purpose
		
		//charAt():  To find the character at specific position.  remember the count start with 0, not 1
		System.err.println("............................");  
		System.out.println("this will find the character at porition 3 in the fname which is- " + "'"+Fname.charAt(3)+"'");
		System.out.println ("this will find character at portion 3, 5, 7 in the last name, which "
				+ "are- " + Lname.charAt(3) +", "+ Lname.charAt(5) +" and " + Lname.charAt(7));
		System.out.println("this will find the total length of the String, which is  "+ Fn.length());
		
		//concat():  to concate multiple strings and veriables
		System.out.println("my full name is"+ " " + Fname +" "+Lname);
		
	/*
		-Learn some other methods in String from 
		(https://javaguide.technologychannel.org/introduction-and-basics/string-in-java/) 
		which includes 
		string length, 
		toUpperCase, 
		toLowerCase etc.
		
		 */
		 
		 
	}

}
