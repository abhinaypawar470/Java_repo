import java.util.Scanner;

public class _29_Average {
	
	public static float Calculate(int x, int y, int z)
	{
		int a=x+y;
		float avg=a/3;
		return avg;
	}

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter 3 Values ???");
		int x=input.nextInt();
		int y=input.nextInt();
		int z=input.nextInt();
		System.out.println("\nThe Average is "+Calculate(x,y,z));
	}

}
