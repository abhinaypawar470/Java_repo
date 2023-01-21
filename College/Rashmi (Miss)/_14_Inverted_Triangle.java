import java.util.Scanner;

public class _14_Inverted_Triangle 
{
	public static void main(String abc[])
	{
		Scanner input=new Scanner(System.in);
		System.out.println("How Many Rows ???");
		int z=input.nextInt();
		int y=z+z;

		System.out.println("\n\nInverted Pascal's Triangle\n");
		for(int i=1;i<=z;i++)
		{
			for(int j=1;j<=i;j++)
				System.out.print("  ");
			
			int k=1;
			while(k<=y)
			{
				if(k%2!=0)
					System.out.print("* ");
				else
					System.out.print("  ");
				k++;
			}
			y-=2;

			System.out.println();
		}
	}
}
