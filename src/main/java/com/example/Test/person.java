package com.example.Test;

public class person {

    String firstName;
    String lastName;

    int salary;

    public person(String firstName , String lastName , int salary){
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }
    public String toString(){

        return this.firstName + " " + this.lastName + " " + this.salary ;

    }
}
