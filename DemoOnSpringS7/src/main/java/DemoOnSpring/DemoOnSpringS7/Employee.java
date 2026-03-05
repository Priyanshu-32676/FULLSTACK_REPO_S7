package DemoOnSpring.DemoOnSpringS7;

public class Employee {
   int empid;
   String empName;
   double sal;
   boolean activeStatus;
     
   public Employee(int empid, String empName, double sal, boolean activeStatus) {
	super();
	this.empid = empid;
	this.empName = empName;
	this.sal = sal;
	this.activeStatus = activeStatus;
}
   public int getEmpid() {
	return empid;
   }
   public void setEmpid(int empid) {
	this.empid = empid;
   }
   public String getEmpName() {
	return empName;
   }
   public void setEmpName(String empName) {
	this.empName = empName;
   }
   public double getSal() {
	return sal;
   }
   public void setSal(double sal) {
	this.sal = sal;
   }
   public boolean isActiveStatus() {
	return activeStatus;
   }
   public void setActiveStatus(boolean activeStatus) {
	this.activeStatus = activeStatus;
   }
   
   @Override
   public String toString() {
	return "Employee [empid=" + empid + ", empName=" + empName + ", sal=" + sal + ", activeStatus=" + activeStatus
			+ "]";
   }
   
   
}
