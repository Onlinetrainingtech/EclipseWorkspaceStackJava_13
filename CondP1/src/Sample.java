import java.util.Scanner;

class Demo
{
	int a;
	Scanner sc=new Scanner(System.in);
	void get1()
	{
		System.out.println("Enter the a value is::");
		a=sc.nextInt();
		
		if(a%2==0)
		{
			System.out.println("This is even..");
		}
		else
		{
			System.out.println("This is Odd.");
		}
	}
}
public class Sample {

	public static void main(String[] args) {
		
		Demo f1=new Demo();
		f1.get1();

	}

}
