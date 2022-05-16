package com.saitej.spring.qualifierprimaryannotation.beans;

import org.springframework.stereotype.Component;

@Component
public class Lamborghini implements Car {
    @Override
    public String drive() {
    	 return "Driving in Lamborghini..";
    }
}
