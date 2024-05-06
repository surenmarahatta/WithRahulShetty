//  lets talked about 2 of the disadvantages of the array
//  1. numbers of index (or elements) are pre fixed and cannot be added/remove later
//	  to overcome this issue we have a concept of COLLECTION FRAMEWORK LIKE ARRAYLIST, HASHTABLE AND MAP VIEW which we will study later

//  2. an array accept elements having same dayatype only. 
//	  to overcome this issue we have a concept of OBJECT ARRAY, which we are discussing here.

package a_basics_Of_Java;

public class af_object_array {

	public static void main(String[] args) {
		System.out.println
		("Object array allows us to use elements of different datatypes within a single array, look at the example below");
		
		Object a[]= {"tom", 25, 12.33, 1/19/1990, 'M', "London"};
		System.out.println("total length of the given array is "+a.length);
		for (int i=0; i< a.length; i++) {
			System.out.println(a[i]);
						
		}

	}

}
