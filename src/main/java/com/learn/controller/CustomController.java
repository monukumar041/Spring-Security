package com.learn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@ResponseBody
@RequestMapping("/public")
public class CustomController {
    @GetMapping("/home")
    public String home()
    {
        return "this is home page";
    }
    @GetMapping("/login")
    public String login()
    {
        return "this is login page";
    }
    @GetMapping("/register")
    public String register()
    {
        return "this is register page";
    }
}
