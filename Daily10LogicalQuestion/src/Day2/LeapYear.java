package Day2;

import java.util.Scanner;

public class LeapYear {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Year:");
		int year = sc.nextInt();
		
		if(year % 400 == 0) {
			System.out.println("Year is Leap Year.");
		}
		
		else if(year % 100 == 0) {
			System.out.println("Year Not Leap Year.");
		}
		
		else if(year % 4 == 0){
			System.out.println("Year is Leap Year.");
		}
		
		else {
			System.out.println("Year is Not Leap Year.");
		}
	}

}
