package com.walterlife.blog;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.walterlife.blog.FileNameGenerator;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        ApplicationContext context = 
            new ClassPathXmlApplicationContext(new String[] {"SpringBeans.xml"});

        FileNameGenerator fileName = (FileNameGenerator)context.getBean("FileName");
        System.out.println("name: " + fileName.getName() + "type: " + fileName.getType());
    }
}
