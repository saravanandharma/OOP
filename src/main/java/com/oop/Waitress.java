package com.oop;

public class Waitress extends Person {

    public Waitress(String name, String email, int age){
        super(name, email,age);
    }

    public String serverStarter (String starter){
        return "Serving a "+ starter;
    }

}
