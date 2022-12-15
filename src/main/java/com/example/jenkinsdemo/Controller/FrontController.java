package com.example.jenkinsdemo.Controller;


@Controller
public class FrontController {

    @GetMapping("/getHome")
    public String homePage(){
        return "home";
    }

}
