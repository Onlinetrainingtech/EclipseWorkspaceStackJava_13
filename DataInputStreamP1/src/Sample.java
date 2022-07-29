import java.io.DataInputStream;
import java.io.IOException;

class Demo
{
	String empname;
	int empid,salary;
	DataInputStream dis=new DataInputStream(System.in);
	
	void addEmployee() throws  IOException
	{
		System.out.println("Enter the empid and Salary is::");
		empid=Integer.parseInt(dis.readLine());
		salary=Integer.parseInt(dis.readLine());
		System.out.println("Enter the empname::");
		empname=dis.readLine();
	}
	void viewDetails()
	{
		System.out.println("Your data is::"+empid+""+empname+""+salary);
	}
}
public class Sample {

	public static void main(String[] args) throws IOException {
		
		Demo f1=new Demo();
		f1.addEmployee();
		f1.viewDetails();

	}

}
