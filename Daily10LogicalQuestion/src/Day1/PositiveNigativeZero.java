package Day1;

import java.util.Scanner;

public class PositiveNigativeZero {
	public static void main(String[] args) {
		
	
	Scanner sc = new Scanner(System.in);
	int num= sc.nextInt();
	
	if(num>0)
	{
		System.out.println("Number is Positive.");
	}
	
	if(num<0) {
		System.out.println("Number is Nigative.");
	}
	
	if(num == 0)
	{
		System.out.println("Number is Zero.");
	}

}
}
