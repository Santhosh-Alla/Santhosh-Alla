package test;

public class ConditionalStatementPractice1 {
	
	public static void main(String[] args) {
		ifpractice(1,1);
	}

	public static void ifpractice(int a,int b) {
		if (a > b) {
			System.out.println("A-b value is :"+(a - b));
		} else if (b > a) {
			System.out.println("B-A value is :"+(b - a));
		} else {
			System.out.println("a=b");
		}
	}

}
