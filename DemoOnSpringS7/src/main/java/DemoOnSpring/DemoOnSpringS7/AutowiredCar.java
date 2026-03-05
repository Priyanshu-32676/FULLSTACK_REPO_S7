package DemoOnSpring.DemoOnSpringS7;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component  //spring create the object (Bean created)
public class AutowiredCar {
	@Autowired  //Injecting dependency class(Injecting AutowiredEngine class into AutowiredCar class) automatically
 AutowiredEngine engine;

public void drive() {
	engine.start();
	System.out.println("car is moving");
}
public void displayEngineType(String type) {
	engine.EngineType(type);
	System.out.println("Type of engine is:"+engine.engineType);
}
 
}
