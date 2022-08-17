class Demo
{
	void get1(int empid)
	{
		System.out.println("Your data is::"+empid);
	}
	void get1(int cid,String cname)
	{
		System.out.println("Your data is::"+cid+""+cname);
	}
}
public class Sample {

	public static void main(String[] args) {
		
		Demo f1=new Demo();
		f1.get1(1001);
		f1.get1(2001,"mobile");

	}

}
