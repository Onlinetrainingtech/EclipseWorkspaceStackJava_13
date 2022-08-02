import java.util.Scanner;

class Demo
{
	int a1,b1;
	Scanner sc=new Scanner(System.in);
	void arithmeticOperators()
	{
		System.out.println("Enter the value is::");
		a1=sc.nextInt();
		b1=sc.nextInt();
		System.out.println("Addition::"+(a1+b1));
		System.out.println("Multiple::"+(a1*b1));
	}
	void compareOperators()
	{
		System.out.println("Enter the value is::");
		a1=sc.nextInt();
		b1=sc.nextInt();
		System.out.println("Lessthan:::"+(a1<b1));
		System.out.println("Greaterthan::"+(a1>b1));
		System.out.println("Equal::"+(a1==b1));
	}
	void logicalOperators()
	{
		System.out.println("Enter the value is::");
		a1=sc.nextInt();
		b1=sc.nextInt();
		System.out.println("LogicalAND::"+((a1>b1)&&(b1<a1)));
		System.out.println("LogicalOR::"+((a1>b1)||(b1>a1)));
	}
	void bitwiseOperators()
	{
		System.out.println("Enter the value is::");
		a1=sc.nextInt();
		b1=sc.nextInt();
		System.out.println("BitWiseAND::"+(a1&b1));
		System.out.println("BitWiseOR::"+(a1|b1));
		System.out.println("LeftShift::"+(a1<<1));
		
	}
}
public class Sample {

	public static void main(String[] args) {
		
		Demo f1=new Demo();
		//f1.arithmeticOperators();
		//f1.compareOperators();
		//f1.logicalOperators();
		f1.bitwiseOperators();

	}

}
