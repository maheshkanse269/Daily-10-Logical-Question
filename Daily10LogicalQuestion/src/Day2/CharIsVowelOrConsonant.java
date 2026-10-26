package Day2;

import java.util.Scanner;


public class CharIsVowelOrConsonant {
	public static void main(String[] args) {
		
	
	Scanner sc  = new Scanner(System.in);
	System.out.println("Enter Character.");
	char ch = sc.next().charAt(0);
	
	if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') {
		System.out.println("Vowel.");
	}
	
	else if(ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U') {
		System.out.println("Vowel.");
	}
	
	else if(ch >= 'A' && ch <='Z') {
		System.out.println("Consonant.");
	}
	
	else if(ch >= 'a' && ch <='z') {
		System.out.println("Consonant.");
	}
	
	else {
		System.out.println("Not a Alphbet.");
	}
	}
}
