package com.firstspringapp.springbootfirstapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class A {

    private final B b; // Use lowercase for variable name

    @Autowired // Use @Autowired to inject B
    public A(B b) {
        this.b = b; // Constructor injection
    }

    public void code() {
        b.compile(); // Call the compile method on the injected B instance
    }
}
