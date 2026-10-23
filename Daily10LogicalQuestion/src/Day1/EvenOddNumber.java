package Day1;

import java.util.Scanner;

public class EvenOddNumber {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Number:");
		int num=sc.nextInt();
		
		if(num % 2 == 0) {
			System.out.println("Number is Even:"+num);
		}
		
		else {
			System.out.println("Number is Odd:" +num);
		}
		
				
	}

}
