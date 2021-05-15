package me.sathish.k8s.myk8demo.controller;

import me.sathish.k8s.myk8demo.data.User;
import me.sathish.k8s.myk8demo.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class UserController {
    @Autowired
    UserService userService;

    @RequestMapping("/allusers")
    public List<User> getAllUsers() {
        List<User> allUsersList = userService.getAllUsers();
//        throw new RuntimeException("This is an error");
        return allUsersList;
    }
}
