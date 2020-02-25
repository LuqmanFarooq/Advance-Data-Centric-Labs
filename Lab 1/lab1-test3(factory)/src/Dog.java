
public class Dog implements Animal{

	String name;
	
	public Dog(String name) {
		super();
		this.name = name;
	}

	

	@Override
	public String speak() {
		// TODO Auto-generated method stub
		return "Woof Woof";
	}

	@Override
	public boolean canFly() {
		// TODO Auto-generated method stub
		return false;
	}

}
