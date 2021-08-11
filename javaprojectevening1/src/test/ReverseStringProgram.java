package test;

public class ReverseStringProgram {
	
	public static void printWord() {
		String name = "Test name";
		
		for(int i=name.length()-1;i>=0;i--) {
			
				System.out.println(name.charAt(i));
		}
	}
	public static void main(String[] args) {
		printWord();
	}
}
