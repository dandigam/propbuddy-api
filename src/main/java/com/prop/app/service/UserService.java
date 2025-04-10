package com.prop.app.service;

import com.prop.app.entity.User;
import com.prop.app.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User createUser(User user) {
        return userRepository.save(user);
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public User getUserById(Integer id) {
        return userRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("User not found with ID: " + id));
    }

    public User updateUser(Integer id, User user) {
        User existing = getUserById(id);
        existing.setFullName(user.getFullName());
        existing.setEmail(user.getEmail());
        existing.setPhoneNumber(user.getPhoneNumber());
        existing.setPasswordHash(user.getPasswordHash());
        existing.setLastLogin(user.getLastLogin());
        existing.setAddress(user.getAddress());
        existing.setEmailVerified(user.getEmailVerified());
        existing.setPhoneVerified(user.getPhoneVerified());
        existing.setReferralCode(user.getReferralCode());
        existing.setAuthProvider(user.getAuthProvider());
        return userRepository.save(existing);
    }

    public void deleteUser(Integer id) {
        userRepository.deleteById(id);
    }
}
