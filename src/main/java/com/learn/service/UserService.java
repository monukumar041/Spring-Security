package com.learn.service;

import com.learn.model.User;
import com.learn.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;
    public List<User>getAllUser()
    {
        return userRepository.findAll();
    }

    public User getUser(String userName)
    {
        return userRepository.findByuserName(userName);
    }

    public User addUser(User u)
    {
        userRepository.save(u);
        return u;
    }

}
