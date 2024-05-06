//same method used for multiple time within the same class with diferent parameters is called Method Overloading.
//either different numbers of paramater or same numbers of parameter but different data types
// useful for example when we have to calculate area of mulltiple surfaces like triangle, circle.
//NOTE:  we cannot create a method within a method.
//main Method can be overloaded  (but we never do it)

package d_NonStaticMethod;

public class dc_MethodOverloadingNonStatic {

	public static void main(String[] args) {

		dc_MethodOverloadingNonStatic a = new dc_MethodOverloadingNonStatic();
		
		a.sum();
		a.sum(5);
		a.sum(3, 7);

	}

	public void sum() {
		System.out.println("no parameter");
	}
	
	public void sum(int a) {
		System.out.println(a);
	}
	
	public void sum (int i, int j) {
		System.out.println(i+j);
	}
}
