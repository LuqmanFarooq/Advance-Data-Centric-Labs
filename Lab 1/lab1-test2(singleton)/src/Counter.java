
public class Counter {

	// to make the singleton
	// * make constructor private
	// * make public static method
	// does an instance of class already exists?
	// if yes return its instance
	// if no create a new instance & return it
	private Counter() {
		super();		
	}

	private int total = 0;
	static Counter instance;
	public void incrementTotal() {
		this.total++;
	}
	
	public int getTotal() {
		return this.total;
	}

	public static Counter getInstance() {
		if(instance !=null) {
			instance = new Counter();
		}
		return new Counter();
	}
}
