package org.example;
import com.google.gson.Gson;

public class Main {
    public static void main(String[] args) {
        MyInfo myInfo = new MyInfo();
        myInfo.setName("Faiaz");
        myInfo.setAge(24);
        Gson gson = new Gson();
        System.out.println(gson.toJson(myInfo));
    }
}