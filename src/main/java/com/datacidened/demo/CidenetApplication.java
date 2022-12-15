package com.datacidened.demo;
 
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.servlet.error.ErrorMvcAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.datacidened.demo.controller.UserController; 

@ComponentScan(basePackages  = {"com.example.CidenetApplication",  "com.example.Controller"}, basePackageClasses = UserController.class)
@EnableAutoConfiguration(exclude = {ErrorMvcAutoConfiguration.class})
@SpringBootApplication 
@Configuration 
@EnableWebMvc
public class CidenetApplication {

	public static void main(String[] args) { 
		SpringApplication.run(CidenetApplication.class, args);
	}

}
