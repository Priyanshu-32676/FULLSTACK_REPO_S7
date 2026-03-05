package DemoOnSpring.DemoOnSpringS7;

public class Student {
   int regno;
   String Sname;
  //Default constructor 
  public Student(){
	   
   }
  

  public Student(int regno, String sname) {
	super();
	this.regno = regno;
	this.Sname = sname;
}


  public int getRegno() {
	return regno;
  }

  public void setRegno(int regno) {
	this.regno = regno;
  }

  public String getSname() {
	return Sname;
  }

  public void setSname(String sname) {
	Sname = sname;
  }

//toString() is used to print the result
  @Override
  public String toString() {
	return "Student regno=" + regno + "\nStudent name=" + Sname ;
  }
  
  
}
