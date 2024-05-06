//the resturant sell only mo:mo, soda and beer
//write a program to generate bill for customer based on what they ordered

package c_ClassAndObject;

public class b_Resturant {
	int momo;
	int soda;
	int beer;

	public static void main(String[] args) {
		b_Resturant customer1 = new b_Resturant();
		b_Resturant customer2 = new b_Resturant();
		
		float Rmomo = 15.5f;
		float Rsoda = 2.5f;
		float Rbeer = 4.25f;
		//keep adding customer as necessity
		
		customer1.momo=2;  //2 plate of momo
		customer1.soda=1;
		customer1.beer=2;
		
//		customer2.momo=2;
//		customer2.beer=2;
//		customer2.soda=1;
		
		System.out.println("Imaginry momo House");
		System.out.println("momo: "+customer1.momo+"...@"+Rmomo+ "---$"+ Rmomo*customer1.momo);
		System.out.println("soda: "+customer1.soda +"...@"+Rsoda+"---$"+Rsoda*customer1.soda);
		System.out.println("beer: "+customer1.beer +"...@"+Rbeer+"---$"+Rbeer*customer1.beer);
		
	}

}
