package com.example.chgk.model.db.repository;

import com.example.chgk.model.db.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, String> {}
