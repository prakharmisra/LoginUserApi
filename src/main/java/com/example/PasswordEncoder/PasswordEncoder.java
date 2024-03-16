package com.example.PasswordEncoder;

public interface PasswordEncoder {

    public String encode(String plainPassword);

    public boolean matches(String plainPassword, String hashPassword);

}
