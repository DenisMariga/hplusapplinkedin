package com.denis.hplusapp.controllers;

import com.denis.hplusapp.Models.Users;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.Arrays;
import java.util.List;

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
    @ModelAttribute("newuser")
    public Users getDefaultUser(){
        return new Users();
    }
   @ModelAttribute("genderItems")
   public List<String>genderItems(){
        return Arrays.asList("Male","Female","Others");
    }
}


