package com.example.PasswordEncoder;

import lombok.AllArgsConstructor;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;


@Component
public class BcryptEncoder implements PasswordEncoder{

    private BCryptPasswordEncoder bcryptPasswordEncoder = new BCryptPasswordEncoder();
    @Override
    public String encode(String plainPassword) {
        return bcryptPasswordEncoder.encode(plainPassword);
    }

    @Override
    public boolean matches(String plainPassword, String hashPassword) {
        return bcryptPasswordEncoder.matches(plainPassword,hashPassword);
    }
}
