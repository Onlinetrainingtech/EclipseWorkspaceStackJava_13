import java.util.Scanner;

class Demo
{
	int inp;
	Scanner sc=new Scanner(System.in);
	void get1()
	{
		System.out.println("Enter the inp value is::");
		inp=sc.nextInt();
		
		if(inp%2==0)
		{
			System.out.println("Even"+inp);
		}
		else
		{
			System.out.println("Odd"+inp);
		}
	}
	void get2()
	{
		int age,sal,bns;
	     System.out.println("Enter the age is::");
	     age=sc.nextInt();
	     if(age>=60)
	     {
	    	 System.out.println("Enter the salary is::");
	    	 sal=sc.nextInt();
	    	 if(sal>=20000)
	    	 {
	    		bns=500+sal;
	    		System.out.println("Your bns is::"+bns);
	    	 }
	    	 else
	    	 {
	    		 bns=1000+sal;
	    		 System.out.println("Your bns is::"+bns);
	    	 }
	     }
	     else
	     {
	    	 System.out.println("Your age is low");
	     }
	}
	void get3()
	{
		int exp;//local variable
		System.out.println("Enter the exp is::");
		exp=sc.nextInt();
		switch(exp)
		{
		case 1:
			System.out.println("Case-1");
			break;
		case 2:
			System.out.println("Case-2");
			break;
		case 3:
			System.out.println("Case-3");
			break;
		default:
			System.out.println("Default case");
			break;
		}
		
	}
}
public class Sample {

	public static void main(String[] args) {
		
		Demo f1=new Demo();
		//f1.get1();
		//f1.get2();
		f1.get3();
	}

}
