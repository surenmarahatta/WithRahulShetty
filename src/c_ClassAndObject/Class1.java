package c_ClassAndObject;

public class Class1 {

	public static void main(String[] args) {
	//to access veriable num1, which exist in another class 'Class2' (within this same package), first we
		//need to create a copy of Class2, here copying Class2 is nothing but creating an instance of Class2
		//technically we say this as creating an object of Class2
		//to create an instance/object of any class we use operator called 'new'
		
		Class2 obj1=new Class2();
		Class2 obj2=new Class2();
		//to access the veriable num1 which is in Class2, we need to use a dot operator along with created object (obj1)
		int a=obj1.kitchen;
		System.out.println(a);
		
		String name=obj1.GetMyName();
//		int b=obj1.myRoom;  //in class2, access modefier for myRoom is Private, hence it threw error message while trying to access through this class

	}

}

