
public class Car {
	// variables
	String reg;
	double engineSize;
	
	// constructors
	public Car(String reg, double engineSize) {
		super();
		this.reg = reg;
		this.engineSize = engineSize;
	}
	
	// tostring method
	@Override
	public String toString() {
		return "Car [reg=" + reg + ", engineSize=" + engineSize + "]";
	}
	
	
}
