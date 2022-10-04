package org.example.myappliation;

import org.example.myappliation.controller.Controller;
import org.example.myappliation.repository.AccountRepository;
import org.example.myappliation.services.PlaidService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
//        (scanBasePackages={"org.example.repository",
//        "org.example.main",
//        "org.example.controller",
//        "org.example.services",
//
//})
//@ComponentScan(basePackageClasses = Controller.class)
//@ComponentScan(basePackageClasses = PlaidService.class)
//@ComponentScan(basePackageClasses = AccountRepository.class)
//@EnableConfigurationProperties
//@EntityScan(basePackages = {"com.project.ppaa.model"})
@EnableJpaRepositories
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }
}