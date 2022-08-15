import java.util.Scanner;

class Sample
{
	int empid;
	String empname;
	Scanner sc=new Scanner(System.in);
	void input()
	{
		System.out.println("Enter the empid::");
		empid=sc.nextInt();
		System.out.println("Enter the empname::");
		empname=sc.next();
	}
	void display()
	{
		System.out.println("Your empid is::"+empid);
		System.out.println("Your empname is::"+empname);
	}
}

public class Demo {

	public static void main(String[] args) 
	{
		Sample f1=new Sample();
		f1.input();
		f1.display();

	}

}
