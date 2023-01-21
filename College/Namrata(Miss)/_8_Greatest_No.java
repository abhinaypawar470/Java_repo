import java.util.Scanner;

class _8_Greatest_No
{
	public static void main(String[] args)
	{
		Scanner myobj = new Scanner(System.in);
		System.out.println("Enter the Values???");
		int a[]=new int[7];
		for(int i=0;i<a.length;i++)
		{
			a[i]=myobj.nextInt();
		}
		for(int i=0;i<a.length-1;i++)
		{
			for(int j=0;j<a.length-1;j++)
			{
				if(a[j]>a[j+1])
				{
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		
		System.out.println("The largest No. = "+a[a.length-1]);
	}
}
