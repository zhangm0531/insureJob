package com.sinopac.insurejob.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {



    @PostMapping(value = "/register")
    public String getIndex(Model model,String name){
        model.addAttribute("name",name);
        return "weclome";
    }
}
