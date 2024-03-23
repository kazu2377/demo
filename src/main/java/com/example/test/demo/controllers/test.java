package com.example.test.demo.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.test.demo.model.User;
import com.example.test.demo.service.UserService;

// @RestController
@Controller
public class test {
    
    @GetMapping ("/hello")
    public ModelAndView helloWorld (ModelAndView mav) {
        // model.addAttribute("message", "Hello World");
        
        mav.setViewName ("hello");
        // mav.addObject("key", 12);
        return mav;
        
    }
    
    @GetMapping ("/test")
    public String hello (Model model) {
        model.addAttribute ("message", "Hello World");
        return "test";
    }
    
    private final UserService userService = new UserService ();
    
    @GetMapping ("/users")
    public String showUsers (Model model) {
        List<User> users = userService.getUsers ();
        model.addAttribute ("users", users);
        return "hello"; // Thymeleafテンプレート名
    }
    
}