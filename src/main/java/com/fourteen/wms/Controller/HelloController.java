package com.fourteen.wms.Controller;

import com.fourteen.wms.Entity.User;
import com.fourteen.wms.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HelloController {
    @GetMapping
    public String hello(){
        return "hello wms";
    }

    @Autowired
    private UserService userService;

    @GetMapping("/list")
    public List<User> list(){
        return userService.list();
    }
}
