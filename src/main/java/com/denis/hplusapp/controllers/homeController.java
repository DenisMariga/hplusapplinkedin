package com.denis.hplusapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class homeController {
    @GetMapping("/home")
    public String homePage(){
        return "index";
    }

    @GetMapping("/goToLogin")
    public String goToLogin(){
        return "login";
    }
    @GetMapping("/goToSearch")
    public String goToSearch(){
        return "search";
    }
    @GetMapping("/goToRegister")
    public String goToRegister(){
        return "register";
    }
}

