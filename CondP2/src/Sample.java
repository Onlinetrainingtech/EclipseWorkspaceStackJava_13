import java.util.Scanner;

class Foo
{
	int age,sal,tot,bns;
	Scanner sc=new Scanner(System.in);
	void get1()
	{
		System.out.println("Enter the age..");
		age=sc.nextInt();
		if(age>=60)
		{
			System.out.println("Enter the salary is::");
			sal=sc.nextInt();
			if(sal>=20000)
			{
				bns=sal+500;
				System.out.println("This is your salary is::"+bns);
			}
			else
			{
				bns=sal+1000;
				System.out.println("This is Your salary is::"+bns);
			}
		}
		else
		{
			System.out.println("Your age is low..");
		}
	}
}
public class Sample {

	public static void main(String[] args) {
	
		Foo f1=new Foo();
		f1.get1();
	}

}
