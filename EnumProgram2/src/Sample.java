
public class Sample {

	enum gg {a1(10),b1(50);
		private int h;
		
		gg(int g)
		{
			h=g;
		}
		int get()
		{
			return h;
		}
		
	}
	
	
	public static void main(String[] args) {
		
          gg g=gg.b1;
          System.out.println("Value is::"+g.get());
	}

}
