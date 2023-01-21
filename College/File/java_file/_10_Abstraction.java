package java_file;

abstract class Result {
	abstract float percentage(float x[]);
	abstract float sum(float x[]);

	void display(float a[]) {
		System.out.println("Your Scores...");
		System.out.println("OOC \t::\t"+a[0]);
		System.out.println("DBMS \t::\t"+a[1]);
		System.out.println("IMP \t::\t"+a[2]);
		System.out.println("DMF \t::\t"+a[3]);
		System.out.println("CPS \t::\t"+a[4]);
		System.out.println("\nYour Percentage is "+percentage(a));
	}
}

class Working extends Result {
	float percentage(float x[]) {
		float per=(sum(x)/500)*100;
		return per;
	}
	
	float sum(float x[]) {
		float temp=0;
		for(int i=0;i<x.length;i++)
			temp+=x[i];
		return temp;
	}
}

public class _10_Abstraction {

	public static void main(String[] args) {
		float arr[]= {91,84,65,50,77};
		Working obj=new Working();
		obj.display(arr);
	}

}
