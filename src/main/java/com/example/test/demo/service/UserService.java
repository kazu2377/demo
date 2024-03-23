package com.example.test.demo.service;

import java.util.ArrayList;
import java.util.List;

import com.example.test.demo.model.User;

public class UserService {
    public List<User> getUsers () {
        List<User> users = new ArrayList<User> ();
        for (int i = 1; i <= 30; i++) {
            users.add (new User (String.valueOf (i), "User" + i, "男性", "1990/01/01", "user" + i + "@example.com", "営業部",
                    "マネージャー"));
        }
        return users;
    }
}