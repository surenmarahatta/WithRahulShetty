//tract customer's transection and display current balance

package c_ClassAndObject;

public class c_bankCustomer {
	
	String name;
	double balance;
	double deposite;
	double withdraw;
	double currentBalance;
	

	public static void main(String[] args) {
		c_bankCustomer c1 = new c_bankCustomer();
		c_bankCustomer c2 = new c_bankCustomer();
		
		c1.name="ram";
		c1.balance=20000.00d;
		c1.deposite=1000.00d;
		c1.withdraw=0.00d;
		c1.currentBalance=c1.balance+c1.deposite-c1.withdraw;
		
		c2.name="shaym";
		c2.balance=50000.00d;
		c2.withdraw=2000.00d;
		c2.currentBalance=c2.balance+c2.deposite-c2.withdraw;
		
		System.out.println("current balance of "+c1.name+" is "+c1.currentBalance);
		System.out.println("currentl balance of "+c2.name+ " is "+ c2.currentBalance);

	}

}
