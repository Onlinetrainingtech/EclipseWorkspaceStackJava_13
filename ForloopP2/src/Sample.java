import java.util.Scanner;

public class Sample {

	public static void main(String[] args) {
		
		int fact=1,n;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the value is::");
		
		n=sc.nextInt();
		
		for(int i=1;i<=n;i++)
		{
			fact=fact*i;
			//System.out.println("I value is::"+i);
		}
		System.out.println("FactValue is::"+fact);

	}

}
