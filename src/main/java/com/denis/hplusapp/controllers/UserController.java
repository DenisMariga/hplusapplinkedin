package com.denis.hplusapp.controllers;
import com.denis.hplusapp.Models.Users;
import com.denis.hplusapp.Repository.userRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {
    @Autowired
    private userRepo userRepo;
    @PostMapping("/registeruser")
    public String addNewUser(@ModelAttribute("newuser")Users users, Model model){
        userRepo.save(users);
        model.addAttribute("data-saved","You have been registered successfully");
        return "login";
    }
}
