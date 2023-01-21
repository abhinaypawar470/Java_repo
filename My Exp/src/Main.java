
class Baap{
	int x=10;
	void swagat() {
		System.out.println("Swagat hai aapka...");
	}
}
class  Beta extends Baap{
	@Override
	void swagat() {
		System.out.println(super.x);
		super.swagat();
		System.out.println("Swagat hai re tera lavdu...");
	}
}


public class Main {
	static void print(Baap a) {
		a.swagat();
	}

	public static void main(String[] args) {
		Baap obj=new Baap();
		obj.swagat();
		//print(obj);
		new Beta().swagat();
	}

}
