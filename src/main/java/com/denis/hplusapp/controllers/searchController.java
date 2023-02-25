package com.denis.hplusapp.controllers;

import com.denis.hplusapp.Models.Products;
import com.denis.hplusapp.Repository.searchRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;


@Controller
public class searchController {
    @Autowired
  private searchRepo searchRepo;
   public String search(@RequestParam("search") String search, Model model){
       List<Products>productsList = searchRepo.searchByName(search);
       model.addAttribute("products", productsList);
       return "search";
   }
}
