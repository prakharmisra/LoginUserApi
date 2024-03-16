package com.example.Test;

import java.sql.SQLOutput;
import java.util.*;
import java.util.stream.Collectors;

/*
Class Person {
String firstName;
String lastname;
Integer Salary
}
Sort it based on firstName using Java 8 and Salary greater than 5000

 */

public class test {
    public static void main(String[] args) {

          person ob1 = new person("xyz" , "as" , 32000);
         person ob2 = new person("lmn" , "as" , 320000000);
         person ob3 = new person("pqr" , "as" , 3200000);
        person ob4 = new person("sty" , "as" , 32000000);
        person ob5 = new person("tcy" , "as" , 3000);

        List<person> ans = new ArrayList<>();

        ans.add(ob1);
        ans.add(ob2);
        ans.add(ob3);
        ans.add(ob4);
        ans.add(ob5);

        List<person> sortedList = ans.stream().sorted((a,b) -> a.firstName.compareTo(b.firstName)).filter(val -> val.salary > 5000).collect(Collectors.toList());

        for(int i = 0 ; i < sortedList.size() ; i++){

            System.out.println(sortedList.get(i).toString());

        }

    }
    public  int method(int a , int b){

        return a/b;
    }
}
