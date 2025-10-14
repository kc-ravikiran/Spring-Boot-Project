package com.kiran.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootpracticeApplication {

	public static void main(String[] args) {

        ApplicationContext context = SpringApplication.run(SpringBootpracticeApplication.class);

        Root obj=context.getBean(Root.class);

        obj.code();
	}

}
