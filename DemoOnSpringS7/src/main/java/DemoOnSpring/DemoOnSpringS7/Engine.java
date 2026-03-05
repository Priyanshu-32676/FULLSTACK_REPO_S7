package DemoOnSpring.DemoOnSpringS7;

//Non primitive data type injection using Constructor DI with XML and application context
public class Engine {
	String type;

	//Constructor for Engine class
	public Engine(String type) {
		super();
		this.type = type;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	

}
