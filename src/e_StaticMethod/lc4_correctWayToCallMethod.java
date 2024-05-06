//below is the correct way on how to call Method with parameter and return type
//(while calling the Metho, assign the Method to a veriable and print the veriable)
//program to add 2 numbers.

package e_StaticMethod;

public class lc4_correctWayToCallMethod {
static int AddTwoNumbers(int num1, int num2) {
	int result = num1 +num2;
	return result;
}
	public static void main(String[] args) {
//		int a=1, b=2;
		int finalresult= AddTwoNumbers(2, 3);  //
		//the result returnted by a method called AddTwoNumbers will be stored at the veriable called finalresult;
		System.out.println(finalresult);
		System.out.println(AddTwoNumbers(2, 3));  //not the good practice to call, always follow line# 10.  this is good practice only when return type is void
		

	}

}
