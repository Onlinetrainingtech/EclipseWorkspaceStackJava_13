class Demo
{
	void addEmployee(String ename,int eid)
	{
		System.out.println("Your data is::"+ename+""+eid);
	}
	void addStudents(String sname,int sid)
	{
		System.out.println("Your data is::"+sname+""+sid);
	}
}
public class Sample {

	public static void main(String[] args) {
		
		Demo f1=new Demo();
		f1.addEmployee("azar",1001);
		f1.addStudents("mohamed",2001);

	}

}
