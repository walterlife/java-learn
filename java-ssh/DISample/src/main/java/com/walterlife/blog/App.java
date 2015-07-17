package com.walterlife.blog;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.walterlife.blog.OutputHelper;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        ApplicationContext context = 
            new ClassPathXmlApplicationContext(new String[] {"SpringBeans.xml"});

        OutputHelper output = (OutputHelper)context.getBean("OutputHelper");
        output.generateOutput();
    }
}
