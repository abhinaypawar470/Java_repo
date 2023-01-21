package java_file;

class Degree {
	void getDegree() {
		System.out.println("I got a Degree.");
	}
}

class Undergraduate extends Degree {
	@Override
	void getDegree() {
		super.getDegree();
		System.out.println("I am an Undergraduate.");
	}
}

class Postgraduate extends Degree {
	void getDegree() {
		System.out.println("I am a Postgraduate.");
	}
}

public class _9_Method_overriding {

	public static void main(String[] args) {
		Undergraduate student=new Undergraduate();
		Postgraduate student2=new Postgraduate();
		student.getDegree();
		student2.getDegree();
	}

}
