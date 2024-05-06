//same method used for multiple time with diferent parameters is called Method Overloading.
// useful for example when we have to calculate area of muljtiple surfaces like triangle, circle.

package e_StaticMethod;

public class lc5_MethodOverLoading {

	static int AddNumber(int a, int b) {
		return a+b;
	}
	
	static int AddNumber(int a, int b, int c) {
		return a+b+c;
	}
	
	public static void main(String[] args) {
		int a=3, b=4, c=7;
		System.out.println(AddNumber(a,b));
		System.out.println(AddNumber(a, b, c));

	}

}
