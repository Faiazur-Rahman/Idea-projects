package org.example.controllers;

import org.example.TestPojo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.net.http.HttpHeaders;
import java.util.Arrays;
import java.util.List;

@RestController
public class Controller {
    @Autowired
    RestTemplate restTemplate;

    @RequestMapping(value = "/call-api")
    public List<TestPojo> getProductList() {
        RestTemplate restTemplate = new RestTemplate();
        String fooResourceUrl
                = "http://universities.hipolabs.com/search?country=United+States";
        List<TestPojo> response
                = Arrays.asList(restTemplate.getForObject(fooResourceUrl , TestPojo[].class));
        return response;
    }
}
