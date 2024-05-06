package b_conditions_and_Loops;

public class lb7_whileLoop {

	public static void main(String[] args) {
		// WhileLoop:  
		//run a block of code until the condition is satisfy
		// keep in mind in this loop, first it will check the condition, if pass then only start executing the statement
//		syntax:  
//			while(condition) {
//				statement;
//				change in condition 
//			}
		
		//practice:  print all odd numbers from 1 to 100
		int i=1;
		System.out.println("below are the odd numbers from 1 to 100");
		while(i <=100) {
			System.out.println(i);
			i=i+2;
		}

	}

}
