package com.signify.ContactManager.controller;

import com.signify.ContactManager.entity.UserClass;
import com.signify.ContactManager.services.UserService;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {


    @Autowired
    private UserService userService;

    @PostMapping("/api/v1/users")
    public UserClass saveUser(@RequestBody UserClass user) {
        System.out.println("User Created");
        System.out.println("ID : " + user.getUserID() + "\n");
        System.out.println("Name : " + user.getName() + "\n");
        System.out.println("Phone : " + user.getPhoneNumber() + "\n");
        System.out.println("Email : " + user.getEmail() + "\n");

        return userService.saveUser(user);
    }

    @GetMapping("/api/v1/users/{id}")
    public UserClass getUserByID(@PathVariable("id") Long userId) {
        return userService.getUserById(userId);

    }

    @PutMapping("/api/v1/users/{userId}")
    public UserClass updateUser(@PathVariable Long userId, @RequestBody UserClass user) {
        return userService.updateUser(userId, user);

    }

    @DeleteMapping("/api/v1/users/{id}")
    public void deleteUserById(@PathVariable("id") Long userId) {
        userService.deleteUserById(userId);

    }
}
