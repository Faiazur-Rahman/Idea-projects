package org.example.myappliation.controller;

import org.example.myappliation.pojo.Pojo;
import org.example.myappliation.services.PlaidService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class Controller {

    @Autowired
    PlaidService plaidService;

    @RequestMapping("/")
    public String test(){
        return "Hi";
    }

    @RequestMapping("/accounts")
    public Pojo allAccounts(){
        System.out.println("hi");
        return plaidService.getAllAccounts();
    }
}
