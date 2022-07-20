package com.ncoding.ncodingcode.controller;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ncoding.ncodingcode.model.User;
import com.ncoding.ncodingcode.service.UserService;

@RestController
@RequestMapping("api")
public class ApiDemo {

    @Autowired
    UserService userService;

    @GetMapping("/saludar")
    public String saludar() {
        return "Hola Mundo";
    }

    @GetMapping("/user")
    public ArrayList<User> getAllUser() {
        return userService.getAllUser();
    }

    @GetMapping("/user/{id}")
    public Optional<User> getUserById(@PathVariable("id") long id) {
        return userService.getUserById(id);
    }

    @PostMapping("/user")
    public User saveUser(@RequestBody User u) {
        return userService.saveUser(u);
    }

    @DeleteMapping("/user/{id}")
    public String deleteUserById(@PathVariable("id") long id) {
        if (userService.deleteUserById(id)) {
            return "user deleted";
        }
        else {
            return "don't user deleted";
        }
    }
}
