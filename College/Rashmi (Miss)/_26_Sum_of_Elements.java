
public class _26_Sum_of_Elements {
	public static void main(String abc[]) {
		int arr[]= {23,56,79,69,1,17,45,99,12,34};
		int temp=0;
		System.out.println("The Given Elements are ::");
		for(int i=0;i<10;i++)
			System.out.print(arr[i]+"  ");
		for(int i=0;i<10;i++)
			temp+=arr[i];
		System.out.println("\n\nThe Sum of Elements is "+temp);
	}
}
