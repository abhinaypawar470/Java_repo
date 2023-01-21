package java_file;

import java.util.Scanner;

public class _2a_Fibonacci {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("How many Elements of Fibonacci Series to Print from 0 ???");
		int a=input.nextInt();
		int full=10;
		int fib[]=new int[a];
		fib[0]=0;
		fib[1]=1;
		System.out.println("\n\nFibonacci Series\n");
		System.out.print("0\t1\t");
		
		for(int i=2;i<a;i++)
		{
			fib[i]=fib[i-1]+fib[i-2];
			System.out.print(fib[i]+"\t");
			if(i==full)
			{
				System.out.println();
				full+=10;
			}
		}
	}
}
