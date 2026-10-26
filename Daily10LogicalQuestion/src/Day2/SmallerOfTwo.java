package Day2;

import java.util.Scanner;

public class SmallerOfTwo {
	public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Your First Number.");
	int num1 = sc.nextInt();
	
	System.out.println("Enter Your Second Number.");
	int num2 = sc.nextInt();
	
	if(num1<=num2) {
		System.out.println("First Number Is Smaller.");
	}
	
	else {
		System.out.println("Second Number is Smaller.");
	}
	
	}

}
