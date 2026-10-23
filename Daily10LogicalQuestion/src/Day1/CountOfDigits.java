package Day1;

import java.lang.reflect.Array;
import java.util.Scanner;

public class CountOfDigits {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = 0;
		System.out.println("Enter Your Number:");
		int num=sc.nextInt();
		while(num != 0)
		{
			num=num/10;
			count++;
		}
		
		System.out.println("Count is:" +count);
	
		
		
		
	}

}
