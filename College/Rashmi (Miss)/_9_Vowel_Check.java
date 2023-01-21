import java.util.Scanner;

public class _9_Vowel_Check
{
	public static void main(String abc[])
	{
		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter a Number???");
		char a=input.next().charAt(0);
		if(a=='a'||a=='e'||a=='i'||a=='o'||a=='u'||a=='A'||a=='E'||a=='I'||a=='O'||a=='U')
			System.out.println(a+" is a Vowel");
		else
			System.out.println(a+" is Not a Vowel");
	}

}
