package b_conditions_and_Loops;

public class lb5_BreakAndContinue {

	public static void main(String[] args) {


//		BREAK STATEMENT:  it is use to exit loop or switch statement. 
//		it stop the loop immediately once the given condition pass and move the control outside the loop
//		syntax:
//			if(condition) {
//				break;
//			}

		//below is an example of break
		for(int i=1; i<=10; i++) {
			if(i>5) {
				break;
			}
			System.out.println("value of i now is "+ i);
		}
		
//		CONTINUE STATEMENT:  It will skip one iteration on the loop
//		syntax: 
//			if (condition) {
//				continue
		
		//below is an example of Continue 
		for (int a=1; a<=10; a++) {
			if(a==5) {             // with this statement this code skip printing 5
				continue;
			}
			System.out.println("value of a now is "+a);
		
			}
	}

}
