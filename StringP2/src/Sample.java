
public class Sample {

	public static void main(String[] args) {
		
		StringBuilder sb=new StringBuilder("Helloworld");
		
		sb.append("welcome");
		
		System.out.println("Appending::"+sb);
		
		sb.insert(4,"****");
		
		System.out.println("Inserting::"+sb);

		
		sb.reverse();
		
		System.out.println("Reverse::"+sb);
		
		sb.delete(2,5);
		
		System.out.println("Deleting::"+sb);
	}

}
