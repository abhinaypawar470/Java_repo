import java.util.Scanner;

public class _19_Star_Right_Triangle
{
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
		System.out.println("How many Rows???");
		int a=input.nextInt();
		
		System.out.println("\n\nRight Triangle!!!\n");
		for(int i=1;i<=a;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
