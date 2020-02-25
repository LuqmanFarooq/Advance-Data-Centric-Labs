
public class Person {
	//variables
	String name;
	Address address;
	Car car;
	
	//constructor
	public Person(String name) {
		super();
		this.name = name;
	}
	// setter methods
	public void setAddress(Address address) {
		this.address = address;
	}

	public void setCar(Car car) {
		this.car = car;
	}

	// tostring method
	@Override
	public String toString() {
		return "Person [name=" + name + ", address=" + address + ", car=" + car + "]";
	}
	
}
