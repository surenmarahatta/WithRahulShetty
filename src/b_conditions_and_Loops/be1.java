package b_conditions_and_Loops;

public class be1 {

	public static void main(String[] args) {
		int age = 18;
		switch (age) {
		case 17:  
			System.out.println("1 more year to be eligible fot vote");
		break;
		
		case 18:  
			System.out.println("eligible to vote ");
			System.out.println("eligible to smoke too");
		break;
		
		case 21:  
			System.out.println("eligible to drink now onward.  But dont DUI");
		break;
		
		case 68:  
			System.out.println("eligible to file a retirement");
		break;
		
		default:  //when no condition sasisgy
			System.out.println("condition not matched");

		}
		
	}

}
