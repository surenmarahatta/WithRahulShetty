package b_conditions_and_Loops;

public class bb_loops {

	public static void main(String[] args) {
	
		
//		three types of loops in Java
//		1. for loop
//			syntax
//			for (initial condition; final condition; chanage in condition) {   //the loop will run until the final condition is true
//				<action to perform>
//			}
//		
//		
//		2. while loop
//			syntax
//			initial condition;
//			while(final condition) {    //the loop will run until the final condition is true
//				<action to perform>;
//				change in condition;
//			}
//		DISADVNATAGE OF WHILE LOOP:  user does not get syntax error message if 'change in condition' statement is missing
//		and the loop keep on running for infinite numbers of time
//
//
//		3. do while loop
//			syntax
//			initial condition;
//			do {
//				<action to perform>;
//				final condition			//the loop will run until the final condition is true
//			}

		//below program is to print even numbers from 1 to 100
		int a=2;
		for (a=2; a<=100; a=a+2){
				System.out.println(a);
			}
				
//			here a=2 is called initialization part
//			a<=100 is called conditional part
//			a=a+2 is called incrimental/decrimental part
	}

}
