package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//        ApplicationContext context = new ClassPathXmlApplicationContext("Spring.xml");
        ApplicationContext  context = new AnnotationConfigApplicationContext(AppConfig.class);
        student obj = (student)context.getBean(student.class);
        obj.String1();
        obj.Phones();




    }
}
