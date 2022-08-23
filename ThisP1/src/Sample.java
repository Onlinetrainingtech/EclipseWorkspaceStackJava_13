class Demo
{
	int cid;
	String cname;
	void get1(int c1,String c2)
	{
		this.cid=c1;
		this.cname=c2;
		System.out.println("This is your get1 data is::"+cid+""+cname);
	}
	void get2()
	{
		System.out.println("This is your get2 data is::"+cid+""+cname);
	}
}
public class Sample {

	public static void main(String[] args) {
		
		Demo f1=new Demo();
		f1.get1(1001,"apple");
		f1.get2();

	}

}
