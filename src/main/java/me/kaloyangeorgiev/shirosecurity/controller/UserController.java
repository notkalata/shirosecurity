package me.kaloyangeorgiev.shirosecurity.controller;

import me.kaloyangeorgiev.shirosecurity.model.User;
import me.kaloyangeorgiev.shirosecurity.service.UserService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/all")
    @RequiresPermissions("canSeeAllUsers")
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    @GetMapping("/user/{username}")
    @RequiresPermissions("canSeeUserByUsername")
    public User getUser(@PathVariable("username") String username) {
        return userService.getUser(username);
    }

    @GetMapping("/welcome")
    public String getWelcomeMessage() {
        return "Welcome to this API, please login to view cats!";
    }

    @GetMapping("/login")
    public String login() {
        Subject subject = SecurityUtils.getSubject();

        if (subject.isAuthenticated()) {
            return "Logged in as: " + subject.getPrincipal().toString();
        }

        return "redirect:/login";
    }

    @GetMapping("/logout")
    public String logout() {
        SecurityUtils.getSubject().logout();
        return "Logged out!";
    }
}
