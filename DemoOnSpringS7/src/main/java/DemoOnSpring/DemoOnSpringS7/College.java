package DemoOnSpring.DemoOnSpringS7;

//import org.springframework.beans.factory.annotation.Autowired;



public class College {
	String Cname;
//	@Autowired  	//it is used to inject the class
  
	Student stud;
	
	public College() {
		
	}

	public String getCname() {
		return Cname;
	}

	public void setCname(String cname) {
		Cname = cname;
	}

	public Student getStud() {
		return stud;
	}

	public void setStud(Student stud) {
		this.stud = stud;
	}

//	toString() is used to print the result
	@Override
	public String toString() {
		return "College name=" + Cname + "\nDetails of Student\n" + stud;
	}
	
	
	

}
