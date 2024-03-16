package com.example.Models;


import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@Entity(name = "users")
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class User extends BaseModel {

    private String name;
    private Integer age;
    private String  pw;

    private  String address;
}
