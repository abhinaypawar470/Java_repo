import java.util.Scanner;

public class _35_Degree {
	
	public static void main(String args[]) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the Temperature in Fahrenheit ???");
		float fahren=input.nextFloat();
		float celsius=(fahren-32)*5/9;
		System.out.println("\nThe Temperature in Celsius is "+celsius+" Degree");
	}

}
