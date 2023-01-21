import java.util.Scanner;

public class _12_Pascal_Triangle
{
	public static void main(String abc[])
	{
		Scanner input=new Scanner(System.in);
		System.out.println("How Many Rows ???");
		int z=input.nextInt();
		int y=1;

		System.out.println("\n\nPascal's Triangle\n");
		for(int i=z;i>=1;i--)
		{
			for(int j=1;j<=i;j++)
				System.out.print(" ");
			
			int k=1;
			while(k<=y)
			{
				if(k%2!=0)
					System.out.print("*");
				else
					System.out.print(" ");
				k++;
			}
			y+=2;
			
			System.out.println("");
		}
	}
}
