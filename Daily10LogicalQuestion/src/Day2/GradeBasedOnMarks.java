package Day2;

import java.util.Scanner;

public class GradeBasedOnMarks {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Marks.");
		int marks = sc.nextInt();
		
		if(marks > 90) {
			System.out.println("A");
		}
		
		else if(marks > 75  && marks < 89) {
			System.out.println("B");
		}
		
		else if(marks > 60  && marks < 74) {
			System.out.println("C");
		}
		
		else if(marks > 35  && marks < 59) {
			System.out.println("D");
		}
		
		else {
			System.out.println("Fails");
		}
	}

}
