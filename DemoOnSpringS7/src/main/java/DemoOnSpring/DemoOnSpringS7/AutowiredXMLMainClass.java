package DemoOnSpring.DemoOnSpringS7;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutowiredXMLMainClass {
	

	public static void main(String[] args) {
		
		ApplicationContext context =
				new ClassPathXmlApplicationContext("AutowiredXML.xml");
		
		//get bean for car dependent class
		AutowiredXMLCarClass car = context.getBean("car",AutowiredXMLCarClass .class);
		car.drive();
	}

}
