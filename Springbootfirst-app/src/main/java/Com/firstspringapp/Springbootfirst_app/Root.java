package com.kiran.app;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;

@Component
public class Root {

    @Autowired
    Laptop laptop;
    public void code() {
        System.out.println("Laptop list");
        laptop.compile();


    }



}
