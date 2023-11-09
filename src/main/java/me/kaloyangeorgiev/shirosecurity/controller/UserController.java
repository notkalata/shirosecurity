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
    @RequiresPermissions("user:all")
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    @GetMapping("/{username}")
    @RequiresPermissions("user:specific")
    public User getUser(@PathVariable("username") String username) {
        return userService.getUser(username);
    }

    @PostMapping("/add")
    @RequiresPermissions("user:moderator")
    public User addUser(@RequestBody User user) {
        return userService.addUser(user);
    }

    @GetMapping("/welcome")
    public String getWelcomeMessage() {
        return "Welcome to this API, please login to view users!";
    }

    @PostMapping("/login")
    public String login() {
        Subject subject = SecurityUtils.getSubject();

        if (subject.isAuthenticated()) {
            return "redirect:/index";
        }

        return "redirect:/login";
    }

    @GetMapping("/logout")
    public String logout() {
        SecurityUtils.getSubject().logout();
        return "redirect:'/login";
    }
}
