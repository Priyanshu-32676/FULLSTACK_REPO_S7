
package DemoOnSpring.DemoOnSpringS7;

import org.springframework.stereotype.Component;

@Component  //spring creates the engine object automatically(create the bean) 
public class AutowiredEngine {
  String engineType;
	public void start() {
		System.out.println("Engine started");
	}
	public void EngineType(String type) {
		this.engineType=type;
	}
}
