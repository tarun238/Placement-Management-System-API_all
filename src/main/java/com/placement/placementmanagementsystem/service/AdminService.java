package com.placement.placementmanagementsystem.service;

import com.placement.placementmanagementsystem.entity.Admin;

public interface AdminService {
    Admin createAdmin(Admin admin);
    Admin getAdminById(Long id);
    void deleteAdmin(Long id);
}