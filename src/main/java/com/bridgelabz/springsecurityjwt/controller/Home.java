package com.bridgelabz.springsecurityjwt.controller;

import org.springframework.web.bind.annotation.*;


//controller
@RestController
public class Home {

    //handler
    @PostMapping("/hello")
    public String welcome(){
        String text = "this is private page ";
        text+="this page is not allowed to unauthenticated users";
        return text;

    }
}
