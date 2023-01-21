import java.util.Scanner;

public class _25_Average
{
	public static void main(String abc[])
	{
		Scanner input=new Scanner(System.in);
		float arr[]=new float[10];
		float temp=0;
		System.out.println("Enter 10 Values ???");
		for(int i=0;i<10;i++)
		{
			arr[i]=input.nextFloat();
			temp=temp+arr[i];
		}
		float avg=temp/10f;
		System.out.println("\n\nThe AVERAGE of 10 Values is "+avg);
	}
}