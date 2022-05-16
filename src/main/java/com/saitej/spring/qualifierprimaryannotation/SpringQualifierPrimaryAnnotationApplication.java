package com.saitej.spring.qualifierprimaryannotation;



import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.saitej.spring.qualifierprimaryannotation.beans.Person;

@SpringBootApplication
public class SpringQualifierPrimaryAnnotationApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context
                = SpringApplication.run(SpringQualifierPrimaryAnnotationApplication.class, args);
        Person person = context.getBean(Person.class);
        person.setName("Saitej");
        System.out.println(person.getName()+" "+person.getCar().drive());
       
    
        
        
    }

}
