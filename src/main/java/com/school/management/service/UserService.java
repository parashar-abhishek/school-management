package com.school.management.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.school.management.dto.UserDto;
import com.school.management.entity.User;
import com.school.management.repository.UserRepository;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;
    
    @Autowired
    private PasswordEncoder passwordEncoder; 

	public List<UserDto> getAllUsers() {
        List<User> users = userRepository.findAll();
        return users.stream().map(user -> new UserDto(user.getUsername(), user.getRole())).collect(Collectors.toList());
    }

    public User saveUser(User user) {
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        return userRepository.save(user);
    }
    
    public boolean authenticateUser(String username, String rawPassword) {
        User user = userRepository.findByUsername(username).orElse(null);
        if (user == null) return false;

        return passwordEncoder.matches(rawPassword, user.getPassword());
    }
}