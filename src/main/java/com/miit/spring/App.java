package com.miit.spring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

/**
 * Hello world!
 *
 */
//Only XML
public class App 
{
    public static void main( String[] args )
    {
        Resource resouce = new ClassPathResource("applicationContext.xml");
        BeanFactory factory = new XmlBeanFactory(resouce);
        
        Student student = (Student) factory.getBean("studentbean");
        student.info();
    }
}
