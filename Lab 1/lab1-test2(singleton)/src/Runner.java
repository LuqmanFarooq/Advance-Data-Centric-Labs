
public class Runner {

	public static void main(String[] args) {

		Counter c1 = Counter.getInstance();
		c1.incrementTotal();
		c1.incrementTotal();
		System.out.println(c1.getTotal());
		
		// runner is indirectly calling constructor
		Counter c2 = Counter.getInstance();
		c2.incrementTotal();
		System.out.println(c2.getTotal());
	}

}
