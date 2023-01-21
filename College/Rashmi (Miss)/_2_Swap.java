import java.util.Scanner;

public class _2_Swap
{
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter 2 Values???");
		int a=input.nextInt();
		int b=input.nextInt();
		System.out.print("Before Swapping....\n"+"A="+a+"\nB="+b);
		int c=a;
		a=b;
		b=c;
		System.out.print("\n\nAfter Swapping....\n"+"A="+a+"\nB="+b);
	}
}
