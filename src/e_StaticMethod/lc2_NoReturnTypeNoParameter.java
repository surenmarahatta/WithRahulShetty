package e_StaticMethod;

public class lc2_NoReturnTypeNoParameter {

	public static void main(String[] args) {


//		
//		
//		a. Syntax:  No Return type and no parameter
//		To define Method (outside of Main-Method):
//		static returnType methodName(){
//			ENTIRE CODE HERE
//			return value   //avoid this line if the return type is void
//		}
//		
//		Syntax to call Method (Inside Main-Methos):
//			simply write method name followed by () and terminated by ;
//		
//below program is to find and print Grade
		
		findGrade();
		
	}
	
static void findGrade(){
	int a =25;
	if (a<40) {
		System.out.println("Fail");
	}
	else if (a>=40 && a<=55) {
		System.out.println("Grade C");
	}
	else if (a>55 && a<=70) {
		System.out.println("Grade B");
	}
	else if (a>70 && a<=85) {
		System.out.println("Grade A");
	}
	else {
		System.out.println("Distinction");
	}
}

}
