package com.example.test.demo.controllers;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.test.demo.model.User;
import com.example.test.demo.service.UserService;

// @RestController
@Controller
public class test {
    
    // @GetMapping ("/hello")
    // public ModelAndView helloWorld (ModelAndView mav) {
    // // model.addAttribute("message", "Hello World");
    //
    // mav.setViewName ("hello");
    // // mav.addObject("key", 12);
    // return mav;
    //
    // }
    //
    // @GetMapping ("/test")
    // public String hello (Model model) {
    // model.addAttribute ("message", "Hello World");
    // return "test";
    // }
    //
    private final UserService userService = new UserService ();
    
    @GetMapping ("/users_main")
    public String showUsers (Model model) {
        List<User> users = userService.getUsers ();
        model.addAttribute ("users", users);
        return "hello"; // Thymeleafテンプレート名
    }
    
    @GetMapping ("/users/filter")
    public String filterUsers (@RequestParam ("position") String position, Model model) {
        List<User> users = userService.getUsersByPosition (position);
        model.addAttribute ("users", users);
        // return "hello"; // ユーザー一覧を表示するThymeleafテンプレート
        return "users-fragment"; // ユーザーテーブルの行だけを更新するためのテンプレート
        
    }
    
    // @GetMapping ("/users/sort")
    // public String sortUsers (@RequestParam ("column") String column,
    // @RequestParam ("order") String order,
    // Model model) {
    // List<User> users = userService.sortUsers (column, order);
    // model.addAttribute ("users", users);
    // return "users-fragment"; // 更新されたユーザーテーブルの行を返す
    // }
    
    @GetMapping ("/users/sort")
    public String sortUsers (@RequestParam ("column") String column, @RequestParam ("order") String order,
            @PageableDefault (size = 10) Pageable pageable, Model model) {
        Page<User> userPage = userService.sortUsers (column, order, pageable);
        model.addAttribute ("userPage", userPage);
        return "users-fragment"; // ソートされたユーザーテーブルのフラグメント
    }
    
    @GetMapping ("/users")
    public String getUsers (Model model, @PageableDefault (size = 10) Pageable pageable) {
        Page<User> userPage = userService.getUsersPage (pageable);
        model.addAttribute ("userPage", userPage);
        return "hello"; // ユーザー一覧ページ
    }
    
    // ページング処理
    // @GetMapping ("/users")
    // public String getUsers (Model model, Pageable pageable) {
    // Page<User> userPage = userService.getUsersPage (pageable);
    // model.addAttribute ("userPage", userPage);
    // return "hello"; // ユーザー一覧ページ
    // }
    
}