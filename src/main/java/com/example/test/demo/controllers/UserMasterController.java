package com.example.test.demo.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.test.demo.model.UserMaster;
import com.example.test.demo.repository.UserMasterRepository;

@RestController
public class UserMasterController {
    
    @Autowired
    private UserMasterRepository userMasterRepository;
    
    @GetMapping ("/user/{userId}")
    public UserMaster getUserById (@PathVariable String userId) {
        Optional<UserMaster> user = userMasterRepository.findById (userId);
        return user.orElse (null); // ユーザーが見つからない場合はnullを返します
    }
    
    @PostMapping ("/user")
    public UserMaster createUser (@RequestBody UserMaster user) {
        return userMasterRepository.save (user);
    }
    
    @PutMapping ("/user/{userId}")
    public UserMaster updateUser (@PathVariable String userId, @RequestBody UserMaster userDetails) {
        UserMaster user = userMasterRepository.findById (userId)
                .orElseThrow ( () -> new RuntimeException ("User not found with id " + userId));
        
        user.setPassword (userDetails.getPassword ());
        user.setEmail (userDetails.getEmail ());
        user.setUpdateTime (userDetails.getUpdateTime ());
        user.setInsertTime (userDetails.getInsertTime ());
        user.setLastLoginDate (userDetails.getLastLoginDate ());
        user.setRegisterLink (userDetails.getRegisterLink ());
        user.setRegisterLinkTime (userDetails.getRegisterLinkTime ());
        user.setType (userDetails.getType ());
        
        return userMasterRepository.save (user);
    }
    
}
