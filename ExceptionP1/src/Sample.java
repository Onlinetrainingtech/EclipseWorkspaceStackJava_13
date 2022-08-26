class Demo
{
	void get1()
	{
		try
		{
		int a=100/0;
		System.out.println("Your value is::"+a);
		}
		catch(ArithmeticException t)
		{
			System.out.println("Please see the error"+t);
		}
		get2();
	}
	void get2()
	{
		System.out.println("This is get2 method..");
	}
}
public class Sample {

	public static void main(String[] args) {
		
		Demo t1=new Demo();
		t1.get1();

	}

}
