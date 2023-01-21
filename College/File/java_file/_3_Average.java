package java_file;

public class _3_Average {

	public static void main(String[] args) {
		float arr[]= {27,71,39,85,13,69,77};
		float temp=0;
		System.out.println("Calculating AVERAGE.......");
		for(int i=0;i<7;i++)
		{
			temp=temp+arr[i];
		}
		float avg=temp/7f;
		System.out.println("\n\nThe AVERAGE of 7 Values is :: "+avg);
	}

}
