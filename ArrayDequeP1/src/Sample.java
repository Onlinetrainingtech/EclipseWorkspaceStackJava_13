import java.util.ArrayDeque;

public class Sample 
{

	ArrayDeque<Integer>list1=new ArrayDeque<Integer>();
	void get1()
	{
		list1.addFirst(1001);
		list1.add(2001);
		list1.add(2002);
		list1.addLast(3001);
		System.out.println("Your data is::"+list1);
	}
	
	public static void main(String[] args) {
		
		Sample d1=new Sample();
		d1.get1();

	}

}
