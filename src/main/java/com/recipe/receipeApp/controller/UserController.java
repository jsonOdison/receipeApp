/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.recipe.receipeApp.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.recipe.receipeApp.model.UserModel;
import com.recipe.receipeApp.services.UserService;

/**
 *
 * @author jason
 */
@RestController()
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/getUser")
    public Optional<UserModel> getUser(long userId) {
        return userService.getUser(userId);
    }

    @GetMapping("/createUser")
    public UserModel createUser(@RequestBody UserModel model) {
        return userService.createUser(model);
    }

}
