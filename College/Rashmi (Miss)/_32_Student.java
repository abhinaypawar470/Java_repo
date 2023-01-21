import java.util.Scanner;

public class _32_Student {
	
	int roll;
	String name, Class;
	int marks[]=new int[5];
	float percentage;
	
	public float readdata() {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter Name, Roll No. and Class Respectively ???");
		name=input.next();
		roll=input.nextInt();
		Class=input.next();
		
		System.out.println("\nEnter the Marks for 5 Subjects ???");
		for(int i=0;i<5;i++)
			marks[i]=input.nextInt();
		return calculate();
	}
	
	public float calculate() {
		int temp=0;
		for(int i=0;i<5;i++)
			temp=temp+marks[i];
		percentage=(float)temp/500*100;
		return percentage;
	}
	
	public void displayData() {
		System.out.println("\n\nName :: "+name);
		System.out.println("Roll No. :: "+roll);
		System.out.println("Class :: "+Class);
		System.out.println("Percentage :: "+percentage);
	}
	
	public static void main(String abc[]) {
		_32_Student obj=new _32_Student();
		System.out.println("\n\nThe Percentage is "+obj.readdata());
		obj.displayData();
	}

}
