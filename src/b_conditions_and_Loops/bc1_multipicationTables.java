//this program is to generate the multipication table of first 7 numbers.

package b_conditions_and_Loops;

public class bc1_multipicationTables {

	public static void main(String[] args) {
		for(int j=1; j<=7; j++) {
			System.out.println("below is the multipication table of "+ j);
			for(int i=1; i<=10; i++) {
				System.out.println(j+" x "+i+" = "+j*i);
			}
			System.out.println("...................");
		}

	}

}
