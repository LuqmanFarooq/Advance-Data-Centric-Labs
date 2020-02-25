import org.springframework.beans.factory.annotation.Autowired;

public class Person {
	// variables
	private String name;
			
	private Address address;
	// constructor
	public Person(String name) {
		super();
		this.name = name;
	}
	@Autowired
	public void setAddress(Address address) {
		this.address = new Address("Athlone", "Co. Westmeath");
	}
	@Autowired
	public void setAddr(Address address) {
		this.address = new Address("Tullamore", "Co. Offaly");
	}

	@Autowired
	public void setAddress1(Address address) {
		this.address = new Address("Moate", "Co. Westmeath");
	}

	// tostring method
	@Override
	public String toString() {
		return "Person [name=" + name + ", address=" + address + "]";
	}

}
