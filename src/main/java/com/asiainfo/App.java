package com.asiainfo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ClassPathXmlApplicationContext cac=new ClassPathXmlApplicationContext("dubbo-client.xml");
        IGpHello gpHello= (IGpHello) cac.getBean("gpHelloService");
        System.out.println(gpHello.sayHello("mic"));
    }
}
