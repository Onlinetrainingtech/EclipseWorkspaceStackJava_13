class Demo
{
	void get1()//throws NullPointerException
	{
		try
		{
		String name=null;
		System.out.println("Length of String is::"+name.length());
		}
		catch(NullPointerException r)
		{
			System.out.println("Please check the variable");
		}
	}
}
public class Sample {

	public static void main(String[] args) {
		
		Demo f1=new Demo();
		f1.get1();

	}

}
