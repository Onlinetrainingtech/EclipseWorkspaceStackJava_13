import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class Sample {

	//HashSet<Integer>list1=new HashSet<Integer>();
	  //TreeSet<Integer>list1=new TreeSet<Integer>();
	ArrayList<Integer>list1=new ArrayList<Integer>();
	void get1()
	{
	    list1.add(200);
	    list1.add(101);
	    list1.add(201);
	    list1.add(103);
	    list1.add(103);
	    
	    Iterator<Integer>k1=list1.iterator();
	    while(k1.hasNext())
	    {
	    	System.out.println("Inside the loop::"+k1.next());
	    }
	    System.out.println("Searching the data::"+list1.contains(101));
	    System.out.println("Remove the data::"+list1.remove(101));
	    System.out.println("After Removing the data::"+list1.contains(101));
	    System.out.println("Your data is::"+list1);
	    System.out.println("Size of the data is::"+list1.size());
	}
	
	public static void main(String[] args) {
		
		Sample s1=new Sample();
		s1.get1();

	}

}
