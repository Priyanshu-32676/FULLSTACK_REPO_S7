package DemoOnSpring.DemoOnSpringS7;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {

       ClassPathXmlApplicationContext context =
        		new ClassPathXmlApplicationContext("ApplicationContext.xml");


//        College c1 = (College)context.getBean("college1");
//        College c2 =(College)context.getBean("college2");
//        System.out.println(c1);
//        System.out.println(c2);
//        context.close();
        //Get Employee Bean(Constructor DI)
        Employee e = (Employee)context.getBean("emp1");
        System.out.println(e);
        Employee e8 = (Employee)context.getBean("emp2");
        System.out.println(e8);
//        
        //Get Employee1Bean(Setter DI)
//        Employee1 e1 = (Employee1)context.getBean("emp1Bean");
//        System.out.println(e1);
//        System.out.println();
//        Employee1 e2 = (Employee1)context.getBean("emp2Bean");
//        System.out.println(e2);
//        System.out.println();
//        Employee1 e3 = (Employee1)context.getBean("emp3Bean");
//        System.out.println(e3);
        
        
        
    }
}
