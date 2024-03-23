package com.example.test.demo.model;

public class User {
    private String id;
    private String name;
    private String gender;
    private String dob; // 生年月日
    private String email;
    private String department;
    private String position;
    
    // コンストラクタ
    public User (String id, String name, String gender, String dob, String email, String department, String position) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.dob = dob;
        this.email = email;
        this.department = department;
        this.position = position;
    }
    
    // ゲッターとセッター
    public String getId () {
        return id;
    }
    
    public void setId (String id) {
        this.id = id;
    }
    
    public String getName () {
        return name;
    }
    
    public void setName (String name) {
        this.name = name;
    }
    
    public String getGender () {
        return gender;
    }
    
    public void setGender (String gender) {
        this.gender = gender;
    }
    
    public String getDob () {
        return dob;
    }
    
    public void setDob (String dob) {
        this.dob = dob;
    }
    
    public String getEmail () {
        return email;
    }
    
    public void setEmail (String email) {
        this.email = email;
    }
    
    public String getDepartment () {
        return department;
    }
    
    public void setDepartment (String department) {
        this.department = department;
    }
    
    public String getPosition () {
        return position;
    }
    
    public void setPosition (String position) {
        this.position = position;
    }
}
