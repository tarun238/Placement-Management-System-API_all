package com.placement.placementmanagementsystem.service;

import com.placement.placementmanagementsystem.entity.User;

public interface IUserService {
    User addNewUser(User user);
    User updateUser(User user);
    boolean deleteUser(Long id);
    User getUserById(Long id); // <-- ADD THIS LINE
}
