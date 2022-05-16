package com.saitej.spring.qualifierprimaryannotation.beans;


import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

//@Primary
@Component
public class Tesla implements Car {
	
	;
	
    @Override
    public String drive() {
       return "Driving in Tesla..";
    }
}
