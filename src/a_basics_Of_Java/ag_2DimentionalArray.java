package a_basics_Of_Java;

public class ag_2DimentionalArray {

	public static void main(String[] args) {
//		lets create a matrix of size 3x4 (3rows and 4columns) first, below is an example
		
		String x[][] = new String[3][4];
		
//		now lets add value for each elements
		
		//1st row
		x[0][0]="A";
		x[0][1]="B";
		x[0][2]="C";
		x[0][3]="D";
		
		//2nd row
		x[1][0]="A1";
		x[1][1]="B1";
		x[1][2]="C1";
		x[1][3]="D1";
		
		//3rd row
		x[2][0]="A2";
		x[2][1]="B2";
		x[2][2]="C2";
		x[2][3]="D2";		
			
//now to print some of the elements
		System.out.println("element in 2nd row and 4th column is "+x[1][3]);
		
//now lets find the length of row and column
		System.out.println("row length is "+x.length);
		System.out.println("column length at 1st row is "+x[0].length);
		System.out.println("column length at 2nd row is "+x[1].length);
		System.out.println("....................");
		
//		now lets print all elements of the array
		
		for (int r=0; r<x.length; r++) {
			System.out.println("below is the elements for row "+(r+1));
			for(int c=0; c<x[r].length; c++) {
				System.out.println(x[r][c]);
			}
			System.out.println(" ");
		}
	}

}
