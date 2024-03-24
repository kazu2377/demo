package com.example.test.demo.service;

import java.util.ArrayList;
import java.util.List;

import com.example.test.demo.model.User;

public class UserService {
    public List<User> getUsers () {
        List<User> users = new ArrayList<User> ();
        for (int i = 1; i <= 30; i++) {
            String gender = (i % 2 == 0) ? "女性" : "男性";
            String position;
            if (i % 3 == 0) {
                position = "役員";
            } else if (i % 3 == 1) {
                position = "マネージャー";
            } else {
                position = "一般社員";
            }
            users.add (new User (String.valueOf (i), "User" + i, gender, "1990/01/01", "user" + i + "@example.com",
                    "営業部", position));
        }
        return users;
    }
    
    public List<User> getUsersByPosition (String position) {
        List<User> filteredUsers = new ArrayList<User> ();
        for (User user : getUsers ()) {
            if (user.getPosition ().equals (position)) {
                filteredUsers.add (user);
            }
        }
        return filteredUsers;
    }
    
    public List<User> sortUsers (String column, String order) {
        List<User> users = getUsers (); // 既存のユーザーリストを取得
        
        // ソート処理（ここでは例として名前でソート）
        users.sort ( (u1, u2) -> {
            int direction = "asc".equals (order) ? 1 : -1;
            switch (column) {
                case "name":
                    return u1.getName ().compareTo (u2.getName ()) * direction;
                case "gender":
                    return u1.getGender ().compareTo (u2.getGender ()) * direction;
                // 他のフィールドに対するソート条件も同様に追加
                default:
                    return 0;
            }
        });
        
        return users;
    }
    
}