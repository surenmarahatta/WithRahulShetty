//this program is to find the area of circle, square and rectangle using method orvrloading 
//[use non static method]

package d_NonStaticMethod;

public class dc1_findArea {
	
	public static void main(String[] args) {
	//create an object to access all non static methods
		dc1_findArea a = new dc1_findArea();
		
		
		double ac= a.area();
		System.out.println("area of circle is "+ac);
		
		int as=a.area(5);
		System.out.println("area of square is "+as);
		
		//this is the shortest way to call Method, but above is the most accurate and highly followed way.
		System.out.println("area of rectangle is "+a.area(3, 6));  
		
	}
	//area of circle
	public double area() {
		int r=5;
		double a= 3.14*r*r;
		
		return a;
	}
	
	//area of square
	public int area (int l) {
	int a=l*l;
	
	return a;
	}
	
	//area of rectangle
	public int area (int l, int b) {
		int a= l*b;
		
		return a;
	}
	
}
