import java.util.Scanner;

class Demo
{
	int empid[]=new int[5];
	int i,n;
	Scanner sc=new Scanner(System.in);
	void get1()
	{
		System.out.println("Enter the n value::");
		n=sc.nextInt();
		for(i=0;i<=n;i++)
		{
			System.out.println("Enter the array value is::");
			empid[i]=sc.nextInt();
		}
	}
	void get2()
	{
		for(i=0;i<=n;i++)
		{
			System.out.println("I value is::"+empid[i]);
		}
	}
}
public class Sample {

	public static void main(String[] args) {
		
        Demo f1=new Demo();
        f1.get1();
        f1.get2();
	}

}
