package b_conditions_and_Loops;

public class bc_nestedLoop {

	public static void main(String[] args) {
		
		// Nested Loop"
		//loop inside loop (like subquery in sql).  Inner loop will execute first then outer loop
		//if age >=21 and gender ="male", then you are eligible to marry
		
		for (int b=1; b<=7; b++) {
			System.out.println();
			System.out.println("BELOW IS THE MULTIPICATION TABLE OF " + b);
			for (int a=1; a<=10; a++) {
				System.out.println(b+ " X " + a + " = " + a*b);
				if (a>=5) {     //this is just to print upto 5 only
				   break;
				}
			}
		}
		
	}

}
