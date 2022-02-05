package com.example;

import io.micronaut.http.annotation.Get;

@io.micronaut.http.annotation.Controller
public class Controller {

    UserRepository userRepository;

    public Controller(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Get
    void test(){
        User user = userRepository.findByEmail("xxx@example.com");
        if(user!=null){
            System.out.println(user.getId());
        }
        else {
            System.out.println("No user found");
        }
    }

}
