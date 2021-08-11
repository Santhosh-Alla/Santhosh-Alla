package test;
/**
 * LogicalOperatorsTest
 * @author Santhosh
 *
 */

public class LogicalOperatorsTest {

	public static void main(String[] args) {
		int a=8,b=4,c=-10;
		System.out.println("(a<b)&&(b>c)-->"+((a<b)&&(b>c)));
		System.out.println("(a==b)||(b!=c)-->"+((a==b)||(b!=c)));
		System.out.println("!(b<=(-a))-->"+!(b<=a));

		
	}

}
