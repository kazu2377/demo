package com.example.test.demo.model;

public class User {
    private String id;
    private String name;
    private String email;
    private String role;
    
    public User (String id, String name, String email, String role) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.role = role;
    }
    
    // idのゲッターとセッター
    public String getId () {
        return id;
    }
    
    public void setId (String id) {
        this.id = id;
    }
    
    // nameのゲッターとセッター
    public String getName () {
        return name;
    }
    
    public void setName (String name) {
        this.name = name;
    }
    
    // emailのゲッターとセッター
    public String getEmail () {
        return email;
    }
    
    public void setEmail (String email) {
        this.email = email;
    }
    
    // roleのゲッターとセッター
    public String getRole () {
        return role;
    }
    
    public void setRole (String role) {
        this.role = role;
    }
}
