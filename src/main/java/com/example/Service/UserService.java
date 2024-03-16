package com.example.Service;

import com.example.Dtos.userReqDtos;
import com.example.Models.User;
import com.example.PasswordEncoder.PasswordEncoder;
import com.example.Repositry.UserRepositry;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserService {

    UserRepositry userRepositry;
    PasswordEncoder passwordEncoder;

    public User createUser(userReqDtos userrequest) {

        String password = passwordEncoder.encode(userrequest.getPw());

        User user = User.builder().pw(password).address(userrequest.getAddress())
                .name(userrequest.getName()).age(userrequest.getAge()).build();

       return userRepositry.save(user);
    }
}
