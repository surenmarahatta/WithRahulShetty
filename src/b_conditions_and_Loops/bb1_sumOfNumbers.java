//this program is to find the sum of first 100  numbers

package b_conditions_and_Loops;

public class bb1_sumOfNumbers {

	public static void main(String[] args) {
		int sum=0;
		for(int a=0; a<=100; a++) {
			sum=sum+a;
		}
		System.out.println("sum of first 100 numbers is "+ sum);
		
		
		int sumEven=0;
		for(int i=0; i<=100; i=i+2) {
			sumEven=sumEven+i;
		}
		System.out.println("sum of first 100 even numbers is "+ sumEven );
		
		
		int sumOdd=0;
		for(int j=1; j<=100; j=j+2) {
			sumOdd=sumOdd+j;
		}
		System.out.println("sum of rist 100 odd number is "+ sumOdd);
		
				
	}

}
