package a_basics_Of_Java;

public class af_1dimm {

	public static void main(String[] args) {
		
		//calculate the percentage of marks obtained by students and put the remarks pass,....., fail
		//based on teh percentage obtained

String name[]= {"Ram", "Shaym", "Hari","Shita", "Gita", "Rita"};
int age[]= {21, 22, 23, 24, 25, 26};
int marks[]= {31, 41, 51, 61, 71, 81};

for (int i=0; i<=5; i++) {
	System.out.println("Student Name: "+ name[i]);
	System.out.println("Student age: "+ age[i]);
	System.out.println("Marks obtained out of 90: "+ marks[i]);
	System.out.println("Percentage of marks: "+ marks[i]*100/90 +"%");
	if (marks[i] < 40){
		System.out.println("Remarks: Fail");
		System.out.println(".............");
		System.out.println();
		}
	else if (marks[i]>=40 && marks[i]<=59) {
		System.out.println("Remarks: Second division");
		System.out.println(".............");
		System.out.println();
	}
	else {
		System.out.println("Remarks: First Division,  Congratulation");
		System.out.println(".............");
		System.out.println();
	}
}



	}

}
