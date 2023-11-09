package me.kaloyangeorgiev.shirosecurity.service;

import me.kaloyangeorgiev.shirosecurity.model.User;
import me.kaloyangeorgiev.shirosecurity.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public List<User> getAllUsers() {
        return (List<User>) userRepository.findAll();
    }

    public User getUser(String username) {
        return userRepository.findUserByUsername(username);
    }

    public User addUser(User user) {
        return userRepository.save(user);
    }
}
