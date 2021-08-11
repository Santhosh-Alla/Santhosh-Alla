package test;


public class Practice3 {

	static int a = 5;
	static int b = 9;
	int c = 2;
	int d = 0;
	int e = 0;

	public void add() {
		d = a + b;
		System.out.println("D vlue is :" + d);
		System.out.println("Now I am in Practice 3 add method");

	}

	public void sub() {
		e = c + d;
		System.out.println("E value is :" + e);

	}
	public static void testMethod() {
		System.out.println("I am in practce 3 test method");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Practice3 NS = new Practice3();
		NS.sub();
		System.out.println(NS.d);
		NS.add();

	}

}
