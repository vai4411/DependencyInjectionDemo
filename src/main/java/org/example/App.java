package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath*:spring.xml");

        Gadget vehicles =(Gadget) context.getBean("gadget");
        vehicles.displayGadget();
    }
}
