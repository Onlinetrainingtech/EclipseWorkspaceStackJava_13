class Demo
{
	String pname="apple";//instance variable
	int cid=2001;
	void addProduct()
	{
		 int pid=1001;//local variable
		 System.out.println("This is local variable::"+pid);
		 
	}
	void addCategory()
	{
		System.out.println("AddCategory is::"+pname+""+cid);
	}
}
public class Sample {

	public static void main(String[] args) {
		
		Demo f1=new Demo();
		f1.addProduct();
		f1.addCategory();

	}

}
