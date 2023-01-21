import java.util.Scanner;

public class _18_input_Mul_Table 
{
	public static void main(String abc[])
	{
		System.out.println("Enter the No.???");
		Scanner input=new Scanner(System.in);
		int a=input.nextInt();

		System.out.println("\n\nMultiplication Table of "+a+"\n");

		for(int i=1;i<=10;i++)
		{
			System.out.println(a+" * "+i+" = "+a*i);
		}
		
	}
}
