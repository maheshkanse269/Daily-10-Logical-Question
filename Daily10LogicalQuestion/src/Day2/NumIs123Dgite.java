package Day2;

import java.util.Scanner;

public class NumIs123Dgite {
	public static void main(String[] args) {
		
		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter Your Number.");
		int num = sc.nextInt();
		
		if(num>0&&num<=9) {
			System.out.println("One Digit.");
		}
		
		else if(num>=10&&num<=99) {
			System.out.println("Two Digit.");
		}
		
		else if(num>=100&&num<=999) {
			System.out.println("Tree Digit.");
		}
		
		else {
			System.out.println("Wrong Input.");
		}
		
		
	}

}
