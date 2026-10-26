package Day2;

import java.util.Scanner;

public class SimpleCalculator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		System.out.println("Enter First Number:");
		int num1 = sc.nextInt();
			
		System.out.println("Enter Second Number.");
		int num2 = sc.nextInt();
		
		System.out.println("1 For Addition.");
		System.out.println("2 For Subtraction.");
		System.out.println("3 For Multiplication.");
		System.out.println("4 For Division.");
		
		System.out.println("Enter Option");
		int operation = sc.nextInt();
		
		switch (operation) {
		case 1:
			System.out.println(num1+num2);
			break;
			
		case 2:
			System.out.println(num1-num2);
			break;
			
		case 3:
			System.out.println(num1*num2);
			break;
			
		case 4:
			System.out.println(num1/num2);
			break;

		default:
			break;
		}
			
			
		
	}

}
