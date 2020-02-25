
public class Address {
	// variables
	private String town;
	private String county;
	// constructor
	public Address(String town, String county) {
		super();
		this.town = town;
		this.county = county;
	}
	// to string method
	@Override
	public String toString() {
		return "Address [town=" + town + ", county=" + county + "]";
	}

}
