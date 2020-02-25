
public class Address {
	// variables
	String street;
	String town;
	String county;
	
	// constructor
	public Address(String street, String town, String county) {
		super();
		this.street = street;
		this.town = town;
		this.county = county;
	}
	
	// tostring
	@Override
	public String toString() {
		return "Address [street=" + street + ", town=" + town + ", county=" + county + "]";
	}
}
