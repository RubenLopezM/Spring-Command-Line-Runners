package com.example.springboot.BS3;


import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;


public class MyRunner implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        System.out.println("Hola desde clase secundaria");
    }
}
