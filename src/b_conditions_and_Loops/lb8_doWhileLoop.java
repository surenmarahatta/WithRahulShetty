package b_conditions_and_Loops;

public class lb8_doWhileLoop {

	public static void main(String[] args) {
		// Do while loop:
		// unlike while loop, it will execute initial statement first then start changing and checking condition
		//syntax
//		do {
//			statement
//			change in condition
//			while condition
//		}
		
	//eg:  print all even numbers from 1 to 100 using do-while loop
		
		int i=2;
		do {
			System.out.println(i);
			i=i+2;
		}
		while(i<=100);

	}

}
