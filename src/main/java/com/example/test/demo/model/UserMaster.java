package com.example.test.demo.model;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table (name = "user_master")
public class UserMaster {
    
    @Id
    @Column (name = "USER_ID", nullable = false, length = 64)
    private String userId;
    
    @Column (name = "PASSWORD", length = 64)
    private String password;
    
    @Column (name = "EMAIL", length = 128)
    private String email;
    
    @Column (name = "UPDATETIME", nullable = false)
    private LocalDateTime updateTime; // LocalDateTime を使用
    
    @Column (name = "INSERTTIME", nullable = false)
    private LocalDateTime insertTime; // LocalDateTime を使用
    
    @Column (name = "LASTLOGINDATE", nullable = false)
    private LocalDateTime lastLoginDate; // LocalDateTime を使用
    
    @Column (name = "REGISTER_LINK", length = 128)
    private String registerLink;
    
    @Column (name = "REGISTER_LINK_TIME", nullable = false)
    private LocalDateTime registerLinkTime; // LocalDateTime を使用
    
    @Column (name = "TYPE")
    private Integer type;
    
    // Getters
    public String getUserId () {
        return userId;
    }
    
    public String getPassword () {
        return password;
    }
    
    public String getEmail () {
        return email;
    }
    
    public LocalDateTime getUpdateTime () {
        return updateTime;
    }
    
    public LocalDateTime getInsertTime () {
        return insertTime;
    }
    
    public LocalDateTime getLastLoginDate () {
        return lastLoginDate;
    }
    
    public String getRegisterLink () {
        return registerLink;
    }
    
    public LocalDateTime getRegisterLinkTime () {
        return registerLinkTime;
    }
    
    public Integer getType () {
        return type;
    }
    
    // Setters
    public void setUserId (String userId) {
        this.userId = userId;
    }
    
    public void setPassword (String password) {
        this.password = password;
    }
    
    public void setEmail (String email) {
        this.email = email;
    }
    
    public void setUpdateTime (LocalDateTime updateTime) {
        this.updateTime = updateTime;
    }
    
    public void setInsertTime (LocalDateTime insertTime) {
        this.insertTime = insertTime;
    }
    
    public void setLastLoginDate (LocalDateTime lastLoginDate) {
        this.lastLoginDate = lastLoginDate;
    }
    
    public void setRegisterLink (String registerLink) {
        this.registerLink = registerLink;
    }
    
    public void setRegisterLinkTime (LocalDateTime registerLinkTime) {
        this.registerLinkTime = registerLinkTime;
    }
    
    public void setType (Integer type) {
        this.type = type;
    }
}
