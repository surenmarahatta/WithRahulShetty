package a_basics_Of_Java;
import java.util.Scanner;
public class az_UserInput {

	public static void main(String[] args) {

Scanner input = new Scanner(System.in);

	
//this program is to accept personal details and populate them in consolidated form

	System.out.println("Please enter Personal detail"); 
	System.out.print("Gender/prefix (Mr./Miss/Mrs)");    String G = input.next();
	System.out.print("First Name: ");   String Fname = input.next();
	System.out.print("Last Name: ");    String Lname = input.next();
	String Frname=Fname.toUpperCase();
	String Lsname=Lname.toUpperCase();
	System.out.println("please enter your address");
	System.out.print("block#: ");  int block = input.nextInt();
	System.out.print("Street Name: ");  String street = input.next();
	System.out.print("City: ");  String City = input.next();
	System.out.print("State: "); String State = input.next();
	input.close();
	
	System.err.println(".............................");
		
	System.out.println("Full name: "+ G+" "+Frname+" "+Lsname);
	System.out.println ("Full Address: " + block +" "+ street+City+(" ")+State); 
	//block (G) is int so cannot concat with string with this process hence used + operator
			

	}

}
