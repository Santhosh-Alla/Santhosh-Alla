package starPrograms;

public class Program1 {

	public static void star() {

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println("");
		}
	}

	public static void star1() {

		for (int i = 5; i >= 0; i--) {
			for (int j = 0; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println("");
		}
	}

	public static void star2() {
		for (int i=0;i<=4;i++) {
			//System.out.print("*");	
			for(int j=3;j>=i;j--) {
				System.out.print(" ");
			}
			for(int k = 0; k<=i;k++) {
			System.out.print("*");
			}
			System.out.println("");
		}
	
		
	}
	
	public static void star3() {
		for(int i=5;i>=0;i--) {
			for(int j=0;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
	public static void star4() {
		for (int i=3;i<=5;i++) {
			for(int j=5;j>=i;j--) {
				System.out.print(" ");
				
			}
			for (int k=3;k<=i;k++) {
				System.out.print("*");
				
			}
			for (int l=0;l<i-3;l++) {
				System.out.print("*");
				
			}
			System.out.println("");
		}
		
	}
	
	public static void star5() {
		for (int i=0;i<=5;i++) {
			for(int j=6;j>=i;j--) {
				System.out.print(" ");
			}
			for(int k=0;k<=i;k--) {
				System.out.print("*");

				
			}
			System.out.println("");

			
		}
	}
	

	public static void main(String[] args) {
		star5();
		// star1();

	}

}
