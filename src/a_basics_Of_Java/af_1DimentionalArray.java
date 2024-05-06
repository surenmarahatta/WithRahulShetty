package a_basics_Of_Java;

public class af_1DimentionalArray {

	public static void main(String[] args) {
		//Array:  allocate similar types of multiple values within a single variables
		//while declearing a array,a square brickate [] should be placed either right after the data type or veriable
		//and all values of the veriable should be enclosed within {}, 
		//for eg. int[] a ={1, 4, 3, 8},     string[] name= {"ram", "shaym", "hari"}  
		//OR  int a[] ={1, 4, 3, 8},     string name[] = {"ram", "shaym", "hari"}
		//the array index is counted as 0, 1, 2... 
		//there are 2 differenty types of array:  One dimentional array and Two dimensiotnal array
		
		// WE ARE NOW FOCUSING ON ONE DIMENTIONAL ARRAY
		//syntax:
		//	string[] furniture ={"table", "bed", "chair"};
		//	int price[] = {50, 100, 25};
		//	here price[0] represent 50 and furniture[2] represent "chair"
		 		

		String Student[] = { "name1", "name2", "name3", "name4", "name5", "name6", "name7"};  
		int ages[] = { 21, 22, 23, 24, 25, 26, 27};
		
		System.out.println(Student[5]);  //print 6th index of the array that is  'name6'

		//for (int i=0; i<=6; i++) {  
		//or
		for (int i=0; i<=Student.length; i++) {  
			//gives expected result including error message 
//			here the array has 7 elements so, Student.length =7 (i.e i<=7)
//			but total array index are 0, 1, 2, 3, 4, 5, 6 and 7 does not have any value
//			hence it will throu an error message as well.
//			to get rid of error message  either remove '=' from condition (i.e i<Student.length)
//			or reduce 1 (i.e i.e i<-Student.length-1)
			
			System.out.println(Student[i]); // array index start with 0
			System.out.println(ages[i]);
		}
		

	}

}
