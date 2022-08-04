import java.util.Scanner;

class Demo
{
	int i,j,n,m;
	Scanner sc=new Scanner(System.in);
	
	void get1()
	{
	   System.out.println("Enter the n and m value is::");
	   n=sc.nextInt();
	   m=sc.nextInt();
	   for(i=0;i<n;i++)
	   {
		   for(j=0;j<m;j++)
		   {
			   System.out.println("I value is::"+i+"J value is::"+j);
		   }
	   }
	}
	
}


public class Sample {

	public static void main(String[] args) {
		
		Demo g1=new Demo();
		g1.get1();
			
	}

}
