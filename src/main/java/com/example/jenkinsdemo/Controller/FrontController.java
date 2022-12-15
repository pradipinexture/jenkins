package com.example.jenkinsdemo.Controller;

import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FrontController {
    
    @GetMapping("/getHome")
    public String homePage(){
        System.out.println("Hello Pradip This is third commit.");
        return "home";
    }

}
