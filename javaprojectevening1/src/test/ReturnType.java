package test;

public class ReturnType {
	
	
	public static int values[] = new int[3];
	public static int caladd() {
		int a = 20;
		int b = 30;
		int c = a+b;
		values[0] = a+b;
		return c;
	}
	public static int calSub() {
		int a = 50;
		int b = 70;
		int c = b - a;
		return c;
	}
	public static int finalalue() {
		int c  = caladd() - calSub();
		return c;
	}
	public static String names() {
		String sirname = "Alla ";
		String firstanme = "Uday";
		return sirname+firstanme;
	}

	public static void main(String[] args) {
		
		System.out.println(finalalue());
		String finalName = names();
		System.out.println(finalName);
		
		
		
	}
	

}
