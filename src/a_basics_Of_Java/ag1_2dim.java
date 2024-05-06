package a_basics_Of_Java;

public class ag1_2dim {

	public static void main(String[] args) {
		int a[][]= new int [3][4];
		
		//1st row
		a[0][0]=00;
		a[0][1]=01;
		a[0][2]=02;
		a[0][3]=03;
		
		//2nd row
		a[1][0]=10;
		a[1][1]=11;
		a[1][2]=12;
		a[1][3]=13;
		
		//3rd row
		a[2][0]=20;
		a[2][1]=21;
		a[2][2]=22;
		a[2][3]=23;
		
		System.out.println("total numbers of row in this array is "+a.length);
		System.out.println("total numbers of columns in this array is "+a[0].length);
		System.out.println(" ");
		
		for (int r=0; r<a.length; r++) {
			System.out.println("row# "+(r+1));
			for (int c=0; c<a[0].length; c++) {
				System.out.println(a[r][c]);
			}
			System.out.println("  ");
			
		}
		

	}

}
