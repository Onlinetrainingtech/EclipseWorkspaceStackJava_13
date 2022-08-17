interface B1
{
	int empid=1001;
	void get1();
}
interface B2 
{
	int cid=2001;
	void get2();
}
class Demo implements B1,B2
{

	public void get2() {
		
		System.out.println("This B2 Interface is::"+cid);
		
	}

	public void get1() {
		
		System.out.println("This is B1 Interface is::"+empid);
		
	}
	
}
public class Sample {

	public static void main(String[] args) {
		
		Demo f1=new Demo();
		f1.get1();
		f1.get2();

	}

}
