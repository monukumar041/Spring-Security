package com.learn.repository;

import com.learn.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,String> {
    User findByuserName(String username);
}
