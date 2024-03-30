package com.example.test.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.test.demo.model.UserMaster;

@Repository
public interface UserMasterRepository extends JpaRepository<UserMaster, String> {
    // ここに必要なメソッドを追加
}
