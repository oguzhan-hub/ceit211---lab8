package com.company;

public class Person {
    String lastName;
    String firstName;
    Address address;

    public Person (String lastName,String firstName,Address address){
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
    }

    public String toString(){
        String x = address.toString();
        return firstName + " " + lastName + " , " + x;
    }
}
