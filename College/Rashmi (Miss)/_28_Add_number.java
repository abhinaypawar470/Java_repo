import java.util.Scanner;

public class _28_Add_number {
	
	public static int Calculate(int x, int y)
	{
		int z=x+y;
		return z;
	}

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter 2 Values ???");
		int x=input.nextInt();
		int y=input.nextInt();
		System.out.println("\nThe Sum is "+Calculate(x, y));
	}
}
