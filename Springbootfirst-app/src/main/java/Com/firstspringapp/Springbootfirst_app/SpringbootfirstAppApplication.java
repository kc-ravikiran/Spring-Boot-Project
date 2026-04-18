package com.kiran.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringbootfirstAppApplication {

	public static void main(String[] args) {

        ApplicationContext context = SpringApplication.run(SpringbootfirstAppApplication.class);

        Root obj=context.getBean(Root.class);

        obj.code();
	}

}
