package com.kiran.app;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Laptop {

    @Autowired
    CPU cpu;
    public void compile(){
        System.out.println(".............");
        System.out.println("HP");
        System.out.println("Dell");
        System.out.println("Lenovo");
        System.out.println("MacBook");
        System.out.println("'''''''''''''");
        cpu.compile();


    }
}
