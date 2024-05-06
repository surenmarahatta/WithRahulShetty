package e_StaticMethod;

public class lc3_NoReturnTypeWithParameter {
	
//	No Return type and have parameter/Argument
//	When a Parameter is passed to a Method it is called Argument.  below is to understand syntax
//	- declair the datatype and veriable as parameter (no values only veriable).
//	- specify how the veriables will be manupulated/calculated to obtain the result.
//	- supply value to the veriables while calling the Method.
	
//below program is to find and print Grade

	
	static void findGrade(int a) {   //here 'a' is the paremeter
		if (a<40) {
			System.out.println("Fail");
		}
		else if (a>=40 && a<=55) {
			System.out.println("Grade C");
		}
		else if (a>55 && a<=70) {
			System.out.println("Grade B");
		}
		else if (a>70 && a<=85) {
			System.out.println("Grade A");
		}
		else {
			System.out.println("Distinction");
		}
	}
	
	public static void main(String[] args) {
		
		findGrade(91);				// here 71 is the argument
		
	}

}
