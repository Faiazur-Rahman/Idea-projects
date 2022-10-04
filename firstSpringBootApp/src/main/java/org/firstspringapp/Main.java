package org.firstspringapp;

//
//import org.firstspringapp.controllers.Controller;
//import org.firstspringapp.services.TopicService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@ComponentScan(basePackageClasses = Controller.class)
//@ComponentScan(basePackageClasses = TopicService.class)
public class Main {
    public static void main(String[] args) {

        SpringApplication.run(Main.class, args);
    }
}