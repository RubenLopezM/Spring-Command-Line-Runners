package com.example.springboot.BS3;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;


public class MySecondRunner implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {

        if (args.length > 0) {
            System.out.println("The command line"
                    + " arguments are:");
            for (String val : args)
                System.out.println(val);
        }
        else{
            System.out.println("No command line arguments found");
        }

    }
}
