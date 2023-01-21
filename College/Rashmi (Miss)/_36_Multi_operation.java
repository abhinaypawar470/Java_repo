import java.util.Scanner;

public class _36_Multi_operation {
	
	public static void main(String args[]) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter 3 Integer Values ???");
		int a=input.nextInt();
		int b=input.nextInt();
		int c=input.nextInt();
		
		System.out.println("\nThe Sum of 3 Integers is :: "+(a+b+c));
		System.out.println("The Average of 3 Integers is :: "+((a+b+c)/3));
		System.out.println("The Product of 3 Integers is :: "+(a*b*c));
		System.out.println("The Smallest among 3 Integers is :: "+Math.min(Math.min(a, b), c));
		System.out.println("The Largest among 3 Integers is :: "+Math.max(Math.max(a, b), c));
	}
}
