
public class Runner {

	public static void main(String[] args) {
		
		//Dog d = new Dog();
		//System.out.println(d.speak());
		
		//Animal c = new Cat();
		//System.out.println(c.speak());
		
		AnimalFactory af = new AnimalFactory();
		Dog d = (Dog) af.getAnimal("dog","Benji");
		//Animal d =  af.getAnimal("sheep");
		if (d != null)
		{
			System.out.println(d.speak());
		}
	}

}
