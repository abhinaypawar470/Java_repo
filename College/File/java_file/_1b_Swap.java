package java_file;

import java.util.Scanner;

public class _1b_Swap {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter 2 Values???");
		int a=input.nextInt();
		int b=input.nextInt();
		System.out.print("Before Swapping....\n"+"A="+a+"\nB="+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.print("\n\nAfter Swapping....\n"+"A="+a+"\nB="+b);
	}

}
