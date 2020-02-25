import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("com/beans/Carbean.xml","com/beans/Enginebean.xml");
		Car c1 = (Car) context.getBean("2017-G-1");
		//Engine e1 = (Engine) context.getBean("engine1.2");
		System.out.println(c1);
	}

}
