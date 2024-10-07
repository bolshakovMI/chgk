package com.example.chgk.model.db.repository;

import com.example.chgk.model.db.entity.Authority;
import com.example.chgk.model.db.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorityRepo extends JpaRepository<Authority, Long> {
    void deleteAllByUsername(User username);
}
