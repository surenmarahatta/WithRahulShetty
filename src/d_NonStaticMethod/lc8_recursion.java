//Recursion:  
//	while defining a function, if same function is called within it, than it is called Recursion
// the recursion function generates, an infinite loop  and we need to specify the condition to break the loop 
//which is called BASE CASE.
//lets take an example of a program to print Hi for 5 times then print Done at the end

package d_NonStaticMethod;

public class lc8_recursion {
	static int number(int n) {
		if (n==0) {						//this is BASE CASE
			System.out.println("Done");
		}
		else {							//this is BASE CASE
			System.out.println(n+".Hi");
			number(n-1);
		}
		return n;
	}
	
	public static void main(String[] args) {
	number(5);
		}

}
