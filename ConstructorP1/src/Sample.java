class Product
{
	Product()
	{
		System.out.println("Default Constructor..");
	}
	Product(int pid)
	{
		System.out.println("Param Constructor.."+pid);
	}
	void get1()
	{
		System.out.println("This is normal method..");
	}
}
public class Sample {

	public static void main(String[] args) {
		
		Product f1=new Product();
		new Product(1001);
		f1.get1();

	}

}
