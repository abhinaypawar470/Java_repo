import java.util.Scanner;

public class _15_Left_Triangle
{
	public static void main(String abc[])
	{
		Scanner input=new Scanner(System.in);
		System.out.println("How many Rows ???");
		int z=input.nextInt();
		
		System.out.println("\n\nLeft Angle Triangle\n");
		for(int i=1;i<=z;i++)
		{
			for(int j=z;j>=i;j--)
				System.out.print("  ");
			for(int k=1;k<=i;k++)
				System.out.print("* ");
			System.out.println();
		}
	}
}
