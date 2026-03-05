package HibernateDemo.HibernateDemo_S7;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.Id;
@Entity  //@Entity annotation is used to Change the class into Entity class Then only java will convert into database.
@Table(name="EmployeeS7")//@Table annotation is used to change the name of the table;
public class Employee {
  @Id   //@Id is used to indicate the primary key.
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  int regno;
  String First_name,Last_name;
  
  // Getter and Setter method is used to get and set the value
  public int getRegno() {
	return regno;
  }
  public void setRegno(int regno) {
	this.regno = regno;
  }
  public String getFirst_name() {
	return First_name;
  }
  public void setFirst_name(String first_name) {
	First_name = first_name;
  }
  public String getLast_name() {
	return Last_name;
  }
  public void setLast_name(String last_name) {
	Last_name = last_name;
  }
  
}
