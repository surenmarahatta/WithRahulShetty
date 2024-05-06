//find the sum of array elements by using Method.
//please note.  WE SHOULD AVOID USING [] FOR ARRAY VARIABLE IN ARGUMENT.

package e_StaticMethod;

public class lc6_ArrayInMethod {
	
	static int myMethod(int numbers[]) {
		int sum=0;
		for (int i=0; i<=4; i++) {
			sum=sum + numbers[i];		
		}
		return sum;
	}

	public static void main(String[] args) {
		int numbers[]= {1, 2, 3, 4, 5};
		int finalResult=myMethod(numbers);  //not number[], here just number 
		System.out.println(finalResult);
		
//		System.out.println(myMethod(numbers));
	}

}
