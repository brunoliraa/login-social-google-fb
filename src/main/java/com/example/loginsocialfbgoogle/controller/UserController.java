package com.example.loginsocialfbgoogle.controller;


import com.example.loginsocialfbgoogle.exception.ResourceNotFoundException;
import com.example.loginsocialfbgoogle.model.User;
import com.example.loginsocialfbgoogle.repository.UserRepository;
import com.example.loginsocialfbgoogle.security.CurrentUser;
import com.example.loginsocialfbgoogle.security.UserPrincipal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/user/me")
    @PreAuthorize("hasRole('USER')")
    public User getCurrentUser(@CurrentUser UserPrincipal userPrincipal) {
        return userRepository.findById(userPrincipal.getId())
                .orElseThrow(() -> new ResourceNotFoundException("User", "id", userPrincipal.getId()));
    }
}
