package com.example.springboot.BS3;


import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
public class FirstClass {

    @PostConstruct
    public void FirstFunction(){
        System.out.println("Hola desde clase inicial");
    }
}
