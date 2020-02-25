
public class AnimalFactory {

	public Animal getAnimal(String type) 
	{
		switch (type) {
		case "dog": 
			return new Dog("No name");
		case "cat":
			return new Cat();
		case "crow":
			return new Crow();	
		case "sheep":
			return new Sheep();
		default:
			throw new IllegalArgumentException("Unexpected value: " + type);
		}
	}
	
	public Animal getAnimal(String type, String name)
	{
		return new Dog(name);
	}
}
