package test;

public class Practice2 {
	
	  static String name1 = "Narasimham";
	
	public static void test2() {
		System.out.println("I am in test2");
	}
	
	public static void test3() {
		String name = "Santosh";
		int i = 10;
		char c = 's';
		System.out.println("I am in test3"+name1);
		
	}
	public static void main(String[] args) {
		Practice2 obj = new Practice2();
		test2();
		obj.test3();
		System.out.println(obj.name1);
		Practice3 NS = new Practice3();
		NS.add();
		NS.testMethod();
	}
	
}

