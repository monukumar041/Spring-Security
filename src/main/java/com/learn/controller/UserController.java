package com.learn.controller;

import com.learn.model.User;
import com.learn.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/")
    public List<User>getAllUser()
    {
        return userService.getAllUser();
    }

    @GetMapping("/{userName}")
    public User getUser(@PathVariable("userName") String userName)
    {
        return userService.getUser(userName);
    }

    @PostMapping("/add")
    public User addUser(@RequestBody User user)
    {
        return userService.addUser(user);
    }
}
