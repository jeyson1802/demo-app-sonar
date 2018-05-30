package com.fsw.simulacion.project.demospringgradle.controller;

import java.math.BigDecimal;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/")
    public String index() {
    	
    	double d = 1.1;

    	BigDecimal bd1 = new BigDecimal(d);
    	
    	return "Hola Mundo !!";
        
    }

}