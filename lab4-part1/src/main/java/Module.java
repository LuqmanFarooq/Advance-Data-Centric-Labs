
public class Module {
	// variables
	String moduleName;
	int credits;
	boolean allCA;
	// constructor
	public Module(String moduleName, int credits, boolean allCA) {
		super();
		this.moduleName = moduleName;
		this.credits = credits;
		this.allCA = allCA;
	}
	
	// =================getter and setters==========================================
	public String getModuleName() {
		return moduleName;
	}
	public void setModuleName(String moduleName) {
		this.moduleName = moduleName;
	}
	public int getCredits() {
		return credits;
	}
	public void setCredits(int credits) {
		this.credits = credits;
	}
	public boolean isAllCA() {
		return allCA;
	}
	public void setAllCA(boolean allCA) {
		this.allCA = allCA;
	}

	
}
