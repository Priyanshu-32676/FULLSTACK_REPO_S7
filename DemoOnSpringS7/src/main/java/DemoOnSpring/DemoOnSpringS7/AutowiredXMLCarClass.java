package DemoOnSpring.DemoOnSpringS7;

public class AutowiredXMLCarClass {
// One class is injected into another class
	AutowiredXMLEngineClass engine;

	
	//Getter and setter method
	public AutowiredXMLEngineClass getEngine() {
		return engine;
	}

	public void setEngine(AutowiredXMLEngineClass engine) {
		this.engine = engine;
	}
	
	void drive() {
		engine.Start();
		System.out.println("Car is Running fastly");
	}
	

}
