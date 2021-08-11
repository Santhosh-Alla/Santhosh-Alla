package test;
/**
 * Class for to check vowel in the given string
 * @author Santhosh
 *
 */

public class VowelCheck {
	
	public static void check1() {
		char a ='a';
		char e = 'e';
		char I = 'i';
		char o = 'o';
		char u = 'u';
		
		String str1="java";
		
		for(int i=0; i<str1.length();i++) {
			
			if((str1.charAt(i)==u)||(str1.charAt(i)==e)||(str1.charAt(i)==I)||(str1.charAt(i)==o)||(str1.charAt(i)==a)) {
				System.out.println("Vowel is available in the given string : "+str1.charAt(i)+  "   position is  "+ (i+1));
			}
		}
	}
	
	public static void check2() {
		String Vowels = "aeiou";
		String word = "Test";
		
		for(int i = 0; i<Vowels.length();i++) {
			
			for(int j = 0; j<word.length(); j++) {
				
				if(Vowels.charAt(i)==word.charAt(j)) {
					System.out.println("Vowel is available in the given string");
				}
			}
		}
	}
	
	public static void main(String[] args) {
		check1();
	}
}
