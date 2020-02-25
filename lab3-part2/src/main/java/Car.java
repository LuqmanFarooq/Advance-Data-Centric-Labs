
public class Car {
	String reg;
	int doors;
	String colour;
	Engine engine;
	
	// constructor
	public Car(String reg, int doors, String colour, Engine engine) {
		super();
		this.reg = reg;
		this.doors = doors;
		this.colour = colour;
		this.engine = engine;
	}
	// toString Method

	@Override
	public String toString() {
		return "Car [reg=" + reg + ", doors=" + doors + ", colour=" + colour + ", engine=" + engine + "]";
	}
	
}
