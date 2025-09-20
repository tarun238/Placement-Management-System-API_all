package com.placement.placementmanagementsystem.service;

import com.placement.placementmanagementsystem.entity.User;
import com.placement.placementmanagementsystem.repository.IUserRepository;
import com.placement.placementmanagementsystem.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private IUserRepository userRepository;

    @Override
    public User addNewUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public User updateUser(User user) {
        return userRepository.save(user);
    }

    // ADD THIS ENTIRE METHOD
    @Override
    public boolean deleteUser(Long id) {
        if (userRepository.existsById(id)) {
            userRepository.deleteById(id);
            return true;
        }
        return false;
    }

    // ADD THIS ENTIRE METHOD
    @Override
    public User getUserById(Long id) {
        return userRepository.findById(id).orElse(null);
    }
}