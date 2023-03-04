package com.denis.hplusapp.controllers;
import com.denis.hplusapp.Models.Users;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {
    @PostMapping("/registeruser")
    public String addNewUser(@ModelAttribute("newuser")Users users){
        return "login";
    }
}
