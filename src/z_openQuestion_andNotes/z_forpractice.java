package z_openQuestion_andNotes;

public class z_forpractice {

	public static void main(String[] args) {
		System.out.println("this program is to generate the multipication table of first 9 numbers");
		System.out.println("");
		for(int j=1; j<=9; j++) {
			System.out.println("below is the multipication table of "+ j);
			for (int i=1; i<=10; i++) {
				System.out.println(j+" X "+ i+" = "+ j*i);
			}
			System.out.println(" ");
		}

	}

}
