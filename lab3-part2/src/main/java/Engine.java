
public class Engine {

	double size;
	String fuel;
	
	// constructor
	public Engine(double size, String fuel) {
		super();
		this.size = size;
		this.fuel = fuel;
	}

	// toString method
	@Override
	public String toString() {
		return "Engine [size=" + size + ", fuel=" + fuel + "]";
	}
	
	
	
}
