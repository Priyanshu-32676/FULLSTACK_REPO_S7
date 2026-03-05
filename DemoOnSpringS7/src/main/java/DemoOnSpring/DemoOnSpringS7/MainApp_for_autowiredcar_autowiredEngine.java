package DemoOnSpring.DemoOnSpringS7;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//AppConfig class is used for configuration
@Configuration
@ComponentScan(basePackages="DemoOnSpring.DemoOnSpringS7")
class AppConfig{
	
}

public class MainApp_for_autowiredcar_autowiredEngine { //This main class is used to execute AutowiredEngine and AutowiredCar class

	public static void main(String[] args) {
		ApplicationContext context =
	            new AnnotationConfigApplicationContext(AppConfig.class);//Loads the configuration files
		
		AutowiredCar car = context.getBean(AutowiredCar.class);
		car.drive();
		car.displayEngineType("petrol");
		

		
	}

}
