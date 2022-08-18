abstract class Demo
{
	abstract void get1();
}
class Foo extends Demo
{

	void get1() {
		
		System.out.println("This is abstract method");
		
	}
	
}
public class Sample {

	public static void main(String[] args) {
		
		Foo f1=new Foo();
		f1.get1();

	}

}
