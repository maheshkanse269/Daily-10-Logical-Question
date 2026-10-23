package Day1;

import java.util.Scanner;

public class LargestNumber {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter first Number:");
		int num1 = sc.nextInt();
		System.out.println("Enter Second Number:");
		int num2 = sc.nextInt();
		System.out.println("Enter Third Number:");
		int num3 = sc.nextInt();
		
		if((num1>num2)&&(num1>num3)) {
			System.out.println("Number One is Grater:"+num1 );
		}
		
		else if((num2>num1)&&(num2>num3)) {
			System.out.println("Number Two is Gratter:" +num2);
		}
		
		else {
			System.out.println("Number tree is Gratter:" +num3);
		}
		
		
		
	}

}
