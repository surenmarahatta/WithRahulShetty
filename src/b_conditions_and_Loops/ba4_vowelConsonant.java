package b_conditions_and_Loops;
import java.util.Scanner;
public class ba4_vowelConsonant {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		//find if a number is even/odd, positive/negative/zero
		//find if the character is vowel or consonant
		
		System.out.print("Enter a number "); int an = input.nextInt();
		System.out.print("Enter a character "); String ch = input.next();
		input.close();  //this will closed the input scanner method which was opened in previous line
		
		if (ch=="a" || ch=="e" || ch=="i" || ch=="o" || ch=="u") {
			System.out.println("The character is vowel");
		}
		else {
			System.out.println("the character is consonent");
		}
		
		if (an%2==1) {
			System.out.println("The number "+an+ " is odd");
			}
		else {
			System.out.println("the number "+an+" is even");
		}
		
		
		if (an<0) {
			System.out.println("the number "+ an+ " is negative");
		}
		else if (an==0) {
			System.out.println("the number "+an+ " is 0");
		}
		else {
			System.out.println("the number "+an+ " is positive");
		}
		
	}

}
