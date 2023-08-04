package com.khaling.springsecurityjwt.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.khaling.springsecurityjwt.Entity.User;

@RestController
public class UserController {

    @GetMapping("/")
   // @ResponseBody
    public User getUser(){
        return User.builder()
                .id(1)
                .firstName("Nabin")
                .lastName("Rai")
                .email("abc@gmail.com")
                .password("")
                .build();
    }
}
