package com.sak.welcome_service.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WelcomeController {

    @GetMapping("/")
    public ModelAndView welcome() {
        return new ModelAndView("index.html");
    }

    @GetMapping("/signup") 
    public String signup() {
        return "redirect:http://3.110.33.165:8082/users/signup";
    }

    @GetMapping("/login")
    public String login() {
        return "redirect:http://3.110.33.165:8083/auth/login";
    }
}
