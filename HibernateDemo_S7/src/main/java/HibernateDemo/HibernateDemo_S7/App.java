package HibernateDemo.HibernateDemo_S7;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.query.Query;

import java.util.*;


public class App {
    public static void main(String[] args) {
    	StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
    	Metadata md = new MetadataSources(ssr).getMetadataBuilder().build();
    	SessionFactory sf = md.getSessionFactoryBuilder().build();
    	Session s = sf.openSession();
    	Transaction t; //transaction is used to Rollback and commit
    	//To delete the record where id=2 in the table Employees7
//    	Employee e = s.find(Employee.class,2);//object 'e' is created and pointed to 2nd record in the database; . find is the one of the curd operation. 
//
//    	System.out.println("First name before deletion: "+e.First_name);
//    	System.out.println("Second name before deletion: "+e.Last_name);
//      	System.out.println("Deleting the record in the table");
//        //To delete method is s.delete
//      s.delete(e); // here object 'e' is deleted, Where e points to 2nd record in the database;  
    	
    	//Read all records from the table
    	
//    	Query q = s.createQuery("FROM Employee");
//    	List<Employee> list = q.list();
//    	
//    	for(Employee i:list){
//    		System.out.println(i.getRegno()+" "+i.getFirst_name()+" "+ i.getLast_name());
//    	}
    	
    	
    //	Read with WHERE clause//
    	
//    	Query q = s.createQuery("FROM Employee WHERE First_name = 'kl'");
//    	List<Employee> list = q.list();
//   	
//  	for(Employee i:list){
//  		System.out.println(i.getRegno()+" "+i.getFirst_name()+" "+ i.getLast_name());
//  	}
//    	
    	
    	//Read using Parameter
//    	Query q = s.createQuery("FROM Employee WHERE First_name = :fn"); 
//    	q.setParameter("fn","Kl");
//    	List<Employee> list = q.list();
//    	 for(Employee i:list) {
//    		 System.out.println(i.getRegno()+" "+i.getFirst_name()+" "+i.getLast_name());
//    	 }
    	
    	
    	 //Reading a Single record
//    	 Query q = s.createQuery("FROM Employee WHERE Regno = 2");
//    	 List<Employee> list = q.list();
//    	 for(Employee i:list) {
//    		 System.out.println(i.getRegno()+" "+i.getFirst_name()+" "+i.getLast_name());
//    	 }
    	
//    	read Using name parameter
//    	Query q = s.createQuery("FROM Employee where regno= :rno");
//    	q.setParameter("rno", 3);
//    	List<Employee> list = q.list();
//    	for(Employee i:list) {
//    		System.out.println("Regno: "+i.getRegno()+ " \nFirstname: "+i.getFirst_name()+" \nLastname: "+i.getLast_name());
//    	}
    	
    	//Update Using HQL
//    	 t =s.beginTransaction();
//    	Query q = s.createQuery("UPDATE Employee SET Last_name='Srivastava' WHERE First_name ='Aryan'");
//    	int rows = q.executeUpdate();   	
//    	System.out.println(rows +"record Updated");
    	
    	
//      Update using Parameter 
//    	Query q = s.createQuery("UPDATE Employee SET Last_name= :ln WHERE Regno= :id");
//    	q.setParameter("ln","Srivatstava");
//    	q.setParameter("id",6);
//    	int rows=q.executeUpdate();
//    	System.out.println(rows +"record Updated");
    	
//    	Delete using HQL
//    	1.Delete By ID
//    	t = s.beginTransaction();
//    	Query q = s.createQuery("DELETE FROM Employee WHERE regno =1");
//    	q.executeUpdate();
//    	t.commit();
//    	System.out.println("Record deleted successfully");
    	
    	
//    	2.Delete By using Parameter
//    	t=s.beginTransaction();
//    	Query q = s.createQuery("DELETE FROM Employee WHERE First_name= :fn");
//    	q.setParameter("fn","Nikhil");
//    	q.executeUpdate();
//    	t.commit();
//    	System.out.println("Record deleted successfully");

    		
    	
//    	Using Aggregation Function
//    	1.count()
//    	Query q = s.createQuery("SELECT COUNT(e) FROM Employee e");
//    	Long count = (Long)q.uniqueResult();
//    	System.out.println("Employee Count = "+count);
    	
//    	2.sum
//    	Query q = s.createQuery("SELECT SUM(e.regno) FROM Employee e");
//    	Long total = (Long)q.uniqueResult();
//    	System.out.println("Sum of regno: "+total);
    	
//    	3.avg
//    	Query q = s.createQuery("SELECT avg(e.regno) FROM Employee e");
//    	Double avg = (Double)q.uniqueResult();
//    	System.out.println("Average of reg no is: "+avg);
    	
//    	4.Max()
//    	t=s.beginTransaction();
//    	Query q =s.createQuery("SELECT max(e.regno) FROM Employee e");
//    	int maximum = (int)q.uniqueResult();
//    	t.commit();
//    	System.out.println("The maximum value in regno is: "+maximum);
    	
    	
////    5.Min()
//    	t = s.beginTransaction();
//    	Query q = s.createQuery("SELECT min(e.regno) FROM Employee e");
//    	int minimum = (int)q.uniqueResult();
//    	t.commit();
//    	System.out.println("The minimum value in the regno is: "+minimum);
    	
    	
    	
//    	Sorting the data in the Table(ORDER By)
//    	Sorting by regno
//    	t = s.beginTransaction();
//    	Query q = s.createQuery("FROM Employee e ORDER BY e.regno ASC");//ASC for Ascending and DESC for descending
//    	List<Employee> list = q.list();
//    	for(Employee i:list) {
//    		System.out.println("Regno: "+i.getRegno()+"\nFirst name: "+i.getFirst_name()+"\nLast name: "+i.getLast_name());
//    	}
//    	t.commit();
//    	
////    	sorting by first name
//    	t = s.beginTransaction();
//    	Query q = s.createQuery("FROM Employee e ORDER BY e.First_name ASC");//ASC for Ascending and DESC for descending
//    	List<Employee> list = q.list();
//    	for(Employee i:list) {
//    		System.out.println("Regno: "+i.getRegno()+"\nFirst name: "+i.getFirst_name()+"\nLast name: "+i.getLast_name());
//    	}
//    	t.commit();
    	
//    	sorting By last Transaction
    	t = s.beginTransaction();
    	Query q = s.createQuery("FROM Employee e ORDER BY e.Last_name ASC");//ASC for Ascending and DESC for descending
    	List<Employee> list = q.list();
    	for(Employee i:list) {
    		System.out.println("Regno: "+i.getRegno()+"\nFirst name: "+i.getFirst_name()+"\nLast name: "+i.getLast_name());
    	}
    	t.commit();
//    	
    	
    	
    	
    	
//    	
//        t = s.beginTransaction();//beginTransaction()method is used to create transaction object  
     	//TO commit the database operation
//    	t.commit();
//    	System.out.println("Record updated Successfully");
    	
//        System.out.println("Record id deleted");

    	
    }
}
