class Demo extends Thread
{
	public void run()
	{
		try
		{
			System.out.println("ThreadIN");
			Thread.sleep(10000);
			System.out.println("ThreadOUT");
			System.out.println("Your Current Thread Name is::"+currentThread().getName());
			System.out.println("Your Priority::"+currentThread().getPriority());
		}
		catch(InterruptedException t)
		{
			System.out.println(t);
		}
		//System.out.println("This is multithread..");
	}
}
public class Sample {

	public static void main(String[] args) {
	
		Demo t1=new Demo();
		Demo t2=new Demo();
		t1.start();//Thread-0
		t2.start();//Thread-1
		t1.setName("FinalThread-0");
		t1.setPriority(Thread.MAX_PRIORITY);
		t2.setPriority(Thread.MIN_PRIORITY);
		System.out.println(t1.isInterrupted());
		System.out.println(t1.isAlive());
		

	}

}
