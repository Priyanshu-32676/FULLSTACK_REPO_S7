package DemoOnSpring.DemoOnSpringS7;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class MainApp_for_Engine_Car {
	
	
	
	    public static void main(String[] args) {
	    	//To load the XML file
	    	ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
	    	//Get Car bean
	    	Car c1 = (Car)context.getBean("carBeanOb");
	    	c1.showdetails();
	}
	}



