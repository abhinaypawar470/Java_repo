
class X{
	X(int x){
		System.out.println(x);
	}
	X (){
		System.out.println("without parameter X constructor");
	}
}

class Y extends X{
	Y(int x,int y){
		super(x);
		System.out.println(y);
	}
	Y (){
		//super();
		System.out.println("without parameter Y constructor");
	}
	void hi() {
		System.out.println("hello world");
	}
}

class Z extends Y{
	/*Z(int x,int y,int z){
		super(x,y);
		System.out.println(z);
	}*/
	Z (){
		//super();
		System.out.println("without parameter Z constructor");
	}
	void hi() {
		super.hi();
		System.out.println("bye world");
	}
}

public class test {

	public static void main(String[] args) {
		//Z obj=new Z(1,2,3);
		Z obj1=new Z();
		//obj.hi();
	}

}
