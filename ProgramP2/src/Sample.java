
public class Sample 
{

	void get1()
	{
		System.out.println("This is Get-1 method");
	}
	void get2()
	{
		System.out.println("This is Get-2 method");
	}
	
}

class Demo
{
	public static void main(String[] args)
	{
		
          Sample f1=new Sample();//creating the object
          //f1.get1();
          f1.get2();
	}

}
