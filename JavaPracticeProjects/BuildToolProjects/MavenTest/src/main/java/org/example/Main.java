package org.example;

import com.google.gson.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Gson gson = new Gson();
        MyHelloClasss myHelloClasss = new MyHelloClasss();
        myHelloClasss.setAge(19);
        myHelloClasss.setName("Shovo");
        System.out.println(gson.toJson(myHelloClasss));
    }
}