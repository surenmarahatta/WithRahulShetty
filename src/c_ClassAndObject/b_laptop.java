//Write a java program to create a class Laptop with properties [id, name, ram] and create 3 objects of it and print all details

package c_ClassAndObject;

public class b_laptop {

	int id;
	String name;
	int ram;
	
	public static void main(String[] args) {
		b_laptop suren = new b_laptop();
		b_laptop pooja = new b_laptop();
		b_laptop Aadrika = new b_laptop();

		suren.name="hp";
		suren.id=123;
		suren.ram=8;
		
		pooja.name="samsung";
		pooja.id=234;
		pooja.ram=12;
		
		Aadrika.name="Dell";
		Aadrika.id=345;
		Aadrika.ram=16;
		
		System.out.println("suren's laptop is "+suren.name+ ", the id is "+suren.id+" it has the memory of "+suren.ram+"gb.");
		System.out.println("Pooja's laptop is "+pooja.name+ ",the id is "+pooja.id+" it has the memory of "+pooja.ram+"gb.");
		System.out.println("Aadrika's laptop is "+Aadrika.name+ ", the id is "+Aadrika.id+" it has the memory of "+Aadrika.ram+"gb.");
		
	}

}
