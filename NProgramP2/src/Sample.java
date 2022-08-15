
public class Sample 
{
	String pname="apple";//class or instance variable
	void get1()
	{
		int pid=1001;//local variable
		System.out.println("Your data is::"+pid);
	}
	void get2()
	{
		System.out.println("Your data is::"+pname);
	}
	void get3(int cid,String cname)//argument passing
	{
		System.out.println("Your Argument passing::"+cid+""+cname);
	}

	public static void main(String[] args) 
	{
		Sample s1=new Sample();
		s1.get1();
		s1.get2();
		s1.get3(2001,"mobile");

	}

}
