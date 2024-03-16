package com.example.Controller;


import com.example.Dtos.userReqDtos;
import com.example.Models.User;
import com.example.Service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Users")
@AllArgsConstructor
public class CreateUsers {


    UserService userService ;

    @PostMapping
    public User createUser(@RequestBody userReqDtos userrequest){

       return  userService.createUser(userrequest);

    }

}
