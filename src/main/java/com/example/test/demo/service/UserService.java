package com.example.test.demo.service;

import java.util.Arrays;
import java.util.List;

import com.example.test.demo.model.User;

public class UserService {
    public List<User> getUsers () {
        return Arrays.asList (new User ("1", "Alice", "alice@example.com", "Admin"),
                new User ("2", "Bob", "bob@example.com", "User"),
                new User ("3", "Charlie", "charlie@example.com", "User"));
    }
}
