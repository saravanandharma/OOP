package com.oop;

public class Person {
    private String name;
    private String email;
    private int age;

    public Person(String name, String email, int age ) {
        this.age=age; this.email=email; this.name=name;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person {"+ "name="+ name+ ", email = "+email+", age="+age +"}";
    }
}
