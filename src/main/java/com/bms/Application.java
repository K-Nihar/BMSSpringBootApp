package com.bms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@SpringBootApplication
//@ComponentScan({"domain","repo","rest.controller","service","config"})
public class Application {

	public static void main(String[] args) {
		SpringApplication app  = new SpringApplication(Application.class);
		app.run(args);

	}

}
