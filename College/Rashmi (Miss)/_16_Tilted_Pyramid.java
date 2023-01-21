import java.util.Scanner;

public class _16_Tilted_Pyramid
{
	public static void main(String abc[])
	{
		Scanner input=new Scanner(System.in);
		System.out.println("How many Rows (Enter Even No.) ???");
		int z=input.nextInt();
		
		System.out.println("\n\nTilted Pyramid\n");
		for(int i=1;i<=(z+1)/2;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		for(int i=((z+1)/2)-1;i>=1;i--)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
