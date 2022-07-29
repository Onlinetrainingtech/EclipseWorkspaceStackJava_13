import java.util.Scanner;

class Demo
{
	int pid,qty;
	String pname;
	Scanner sc=new Scanner(System.in);
	void addProduct()
	{
		System.out.println("Enter the pid and qty::");
		pid=sc.nextInt();
		qty=sc.nextInt();
		System.out.println("Enter the Pname is::");
		pname=sc.next();
	}
	void viewProduct()
	{
		System.out.println("Your value is::"+pid+""+pname+""+qty);
	}
}
public class Foo {

	public static void main(String[] args) {
		
		Demo f1=new Demo();
		f1.addProduct();
		f1.viewProduct();

	}

}
