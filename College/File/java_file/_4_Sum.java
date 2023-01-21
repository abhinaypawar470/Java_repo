package java_file;

import java.util.Scanner;

public class _4_Sum {
	float sum[]=new float[5]; 

	public static void main(String[] args) {
		_4_Sum obj=new _4_Sum();
		obj.input();
	}
	
	void input() {
		Scanner read=new Scanner(System.in);
		System.out.println("Enter 5 Values ???");
		for(int i=0;i<sum.length;i++) {
			sum[i]=read.nextFloat();
		}
		System.out.println("\n\nThe SUM of 5 elements is :: "+sum());
	}
	
	float sum() {
		float temp=0;
		for(int i=0;i<sum.length;i++) {
			temp+=sum[i];
		}
		return temp;
	}
}
