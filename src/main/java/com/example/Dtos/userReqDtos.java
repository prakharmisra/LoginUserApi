package com.example.Dtos;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class userReqDtos {

    private String name;
    private int age;
    private String  pw;

    private  String address;
}
