interface B
{
	int empid=1001;
	void get1();
}
class Demo implements B
{

	public void get1() {
		
		System.out.println("Your value is::"+empid);
		
	}
	void get2()
	{
		System.out.println("This is normal method..");
	}
	
}
public class Sample {

	public static void main(String[] args) {
		
		
		Demo f1=new Demo();
		f1.get1();
		f1.get2();

	}

}
