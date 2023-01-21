
public class _37_Matrix_add {
	public static void main(String args[]) {
		int arr1[][]={{2,4},{2,4}};
		int arr2[][]={{6,8},{6,8}};
		int arr3[][]=new int[2][2];
		
		System.out.println("1st Matrix ::");
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr1.length;j++) {
				System.out.print(arr1[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("\n2nd Matrix ::");
		for(int i=0;i<arr2.length;i++) {
			for(int j=0;j<arr2.length;j++) {
				System.out.print(arr2[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("\nThe Sum of 2 Matrices ::");
		for(int i=0;i<arr3.length;i++) {
			for(int j=0;j<arr3.length;j++) {
				arr3[i][j]=arr1[i][j]+arr2[i][j];
				System.out.print(arr3[i][j]+" ");
			}
			System.out.println();
		}
	}
}
