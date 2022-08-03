package switchP1;

import java.util.Scanner;

class Demo
{
	int exp;
	Scanner sc=new Scanner(System.in);
	void get1()
	{
		System.out.println("Enter the exp::");
		exp=sc.nextInt();
	}
	void get2()
	{
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
			System.out.println("default case..");
			break;
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
